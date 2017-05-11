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
import javax.persistence.EntityTransaction;
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
        List<UserLogin> userList = (List<UserLogin>) em.createQuery("select e from UserLogin e").getResultList();
        return userList;
    }

    @Override
    public UserLogin getSingleUser(int id) {
        EntityManager em = emf.createEntityManager();
        UserLogin user = (UserLogin) em.createQuery("select e from UserLogin e where e.id='" + id + "'").getSingleResult();
        return user;
    }

    @Override
    public boolean updateUser(int id, String fullName, String userName, String email, String address, String city, String zip, boolean isAdmin) {
        EntityManager em = emf.createEntityManager();
        UserLogin userLogin = em.find(UserLogin.class, id);
        userLogin.setFullName(fullName);
        userLogin.setUsername(userName);
        userLogin.setEmail(email);
        userLogin.setAddress(address);
        userLogin.setCity(city);
        userLogin.setZipCode(zip);
        userLogin.setAdmin(isAdmin);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(userLogin);
        tx.commit();
        return true;
    }

}
