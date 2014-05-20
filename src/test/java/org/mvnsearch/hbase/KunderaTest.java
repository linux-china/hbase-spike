package org.mvnsearch.hbase;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * kundera test
 *
 * @author linux_china
 */
public class KunderaTest {
    @Test
    public void testSpike() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_pu");
        EntityManager em = emf.createEntityManager();
        User user = em.find(User.class, "1");
        System.out.println(user.getEmail());
    }
}
