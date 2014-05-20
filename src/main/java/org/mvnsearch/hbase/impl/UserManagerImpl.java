package org.mvnsearch.hbase.impl;

import org.mvnsearch.hbase.User;
import org.mvnsearch.hbase.UserManager;
import org.springframework.orm.jpa.support.JpaDaoSupport;

/**
 * user manage implementation
 *
 * @author linux_china
 */
public class UserManagerImpl extends JpaDaoSupport implements UserManager {
    public User findById(String id) {
        return getJpaTemplate().find(User.class, id);
    }
}
