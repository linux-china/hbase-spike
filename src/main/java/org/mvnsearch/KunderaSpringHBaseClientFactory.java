package org.mvnsearch;

import com.impetus.client.hbase.HBaseClient;
import com.impetus.client.hbase.HBaseClientFactory;
import com.impetus.client.hbase.HBaseEntityReader;
import com.impetus.client.hbase.config.HBasePropertyReader;
import com.impetus.client.hbase.schemamanager.HBaseSchemaManager;
import com.impetus.kundera.PersistenceProperties;
import com.impetus.kundera.client.Client;
import com.impetus.kundera.configure.schema.api.SchemaManager;
import com.impetus.kundera.metadata.KunderaMetadataManager;
import com.impetus.kundera.metadata.model.PersistenceUnitMetadata;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTablePool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * kundrea spring hbase client factory
 *
 * @author linux_china
 */
public class KunderaSpringHBaseClientFactory extends HBaseClientFactory implements ApplicationContextAware {

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        conf = applicationContext.getBean(HBaseConfiguration.class);
    }

    /**
     * The logger.
     */
    private static Logger logger = LoggerFactory.getLogger(HBaseClientFactory.class);

    /**
     * The conf.
     */
    private static HBaseConfiguration conf;

    /**
     * The h table pool.
     */
    private HTablePool hTablePool;

    /**
     * The Constant DEFAULT_POOL_SIZE.
     */
    private static final int DEFAULT_POOL_SIZE = 100;

    /**
     * The pool size.
     */
    private int poolSize;

    @Override
    public void initialize(Map<String, Object> externalProperty) {
        setExternalProperties(externalProperty);
        initializePropertyReader();
        // Initialize HBase configuration
        PersistenceUnitMetadata puMetadata = KunderaMetadataManager.getPersistenceUnitMetadata(kunderaMetadata, getPersistenceUnit());

        String poolSize = puMetadata.getProperties().getProperty(PersistenceProperties.KUNDERA_POOL_SIZE_MAX_ACTIVE);

        if (StringUtils.isEmpty(poolSize)) {
            this.poolSize = DEFAULT_POOL_SIZE;
        } else {
            this.poolSize = Integer.parseInt(poolSize);
        }
        reader = new HBaseEntityReader(kunderaMetadata);
    }

    @Override
    protected Object createPoolOrConnection() {
        hTablePool = new HTablePool(conf, poolSize);
        return hTablePool;
    }

    @Override
    protected Client instantiateClient(String persistenceUnit) {
        return new HBaseClient(indexManager, conf, hTablePool, reader, persistenceUnit, externalProperties, clientMetadata, kunderaMetadata);
    }

    @Override
    public boolean isThreadSafe() {
        return true;
    }

    @Override
    public void destroy() {
        // TODO destroy pool
        // hTablePool = null;

        // indexManager.close();
        if (schemaManager != null) {
            schemaManager.dropSchema();
        }
        externalProperties = null;
        schemaManager = null;
    }

    @Override
    public SchemaManager getSchemaManager(Map<String, Object> externalProperty) {
        setExternalProperties(externalProperty);
        if (schemaManager == null) {
            initializePropertyReader();
            schemaManager = new HBaseSchemaManager(HBaseClientFactory.class.getName(), externalProperty, kunderaMetadata);
        }
        return schemaManager;
    }

    /**
     *
     */
    private void initializePropertyReader() {
        if (propertyReader == null) {
            propertyReader = new HBasePropertyReader(externalProperties, kunderaMetadata.getApplicationMetadata()
                    .getPersistenceUnitMetadata(getPersistenceUnit()));
            propertyReader.read(getPersistenceUnit());
        }
    }

    @Override
    protected void initializeLoadBalancer(String loadBalancingPolicyName) {
        throw new UnsupportedOperationException("Load balancing feature is not supported in "
                + this.getClass().getSimpleName());
    }
}
