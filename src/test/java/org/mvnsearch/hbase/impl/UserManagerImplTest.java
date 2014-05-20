package org.mvnsearch.hbase.impl;

import org.mvnsearch.hbase.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mvnsearch.hbase.UserManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * user manager implementation test
 *
 * @author linux_china
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appContext-hbase.xml")
public class UserManagerImplTest {
    @Resource
    private UserManager userManager;

    @Test
    public void testFind() {
        User user = userManager.findById("1");
        System.out.println(user.getEmail());
    }
}
