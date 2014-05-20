package org.mvnsearch.hbase;


import org.apache.gora.generated.UserGora;
import org.apache.gora.store.DataStore;
import org.apache.gora.store.DataStoreFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * gora client test
 *
 * @author linux_china
 */
public class GoraClienTest {

    private static DataStore<String, UserGora> userStore;

    @BeforeClass
    public static void setup() throws Exception {
        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "192.168.33.33");
        userStore = DataStoreFactory.getDataStore(String.class, UserGora.class, conf);
    }

    @Test
    public void testSpike() throws Exception {
        UserGora user = userStore.get("1");
        System.out.println(user.getEmail());
    }

    @AfterClass
    public static void tearDown() throws Exception {
        userStore.close();
    }
}
