/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UserLogin;
import java.util.List;

/**
 *
 * @author Abdullah Shekhar
 */
public interface UserDAOLocal {
    public List<UserLogin> getAllUser();
    public UserLogin getSingleUser(int id);
}
