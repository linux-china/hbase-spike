package org.mvnsearch.hbase;

import org.apache.gora.generated.UserGora;
import org.apache.gora.store.DataStore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * hbase template test
 *
 * @author linux_china
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appContext-hbase.xml")
public class HbaseTemplateTest {
    @Resource
    private HbaseTemplate htemplate;
    @Resource
    @Qualifier("userStore")
    private DataStore<String, UserGora> userDataStore;

    @Test
    public void testSpike() throws Exception {
        User user = htemplate.get("user", "1", "cf", new UserRowMapper());
        System.out.println(user.getNick());
    }

    @Test
    public void testGora() throws Exception {
        UserGora user = userDataStore.get("1");
        System.out.println(user.getEmail());
        user.setEmail("linux_china4@hotmail.com");
        userDataStore.put("1", user);
        user = userDataStore.get("1");
        System.out.println(user.getEmail());
    }
}
