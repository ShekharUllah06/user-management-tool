/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UserLogin;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Abdullah Shekhar
 */
public class LoginDAO implements LoginDAOLocal {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PortaleDipendentiPU");
    @Override
    public boolean checkUser(String userName, String password) {
        EntityManager em = emf.createEntityManager();
        List<UserLogin> s = (List<UserLogin>) em.createQuery("select e from UserLogin e where e.username='" + userName + "' and e.password='" + password + "'").getResultList();
        System.out.println("is list empty ?" + s.isEmpty() + " for the" + userName + " and " + password);

        if (!s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    
    
    
}
