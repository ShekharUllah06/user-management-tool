/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UserLogin;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Abdullah Shekhar
 */
public class UserDAO implements UserDAOLocal {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PortaleDipendentiPU");

    @Override
    public List<UserLogin> getAllUser() {
        EntityManager em = emf.createEntityManager();
        List<UserLogin> s = (List<UserLogin>) em.createQuery("select e from UserLogin e").getResultList();
        return s;
    }

}
