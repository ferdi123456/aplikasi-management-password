/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdinan.belajar.web.service;

import com.ferdinan.belajar.web.App;
import com.ferdinan.belajar.web.model.User;
import com.ferdinan.belajar.web.model.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 *
 * @author ferdinan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class UserServiceTest {
    
    @Autowired
    private UserService user_service;
    
    @Test
    public void cariSemuaUser() {
        User users = user_service.findById("1");
        if (users != null) {
            System.out.println("user ketemu");
        }else{
            System.out.println("tidak ketemu");
        }
    }
    
    
    
    
//    @Test
//    public void cariSemuaUserAndId() {
//        User users = user_service.findByNameAndId("ferdi1", "123");
//        if (users != null) {
//            System.out.println("user ketemu");
//            System.out.println("user adalah : " + users.getPassword());
//        }
//    }
    
//    @Test
//    public void cariSatuAja() {
//        List<User> users = user_service.findUsersBerdasarkanNamaRole("admin");
//        System.out.println("ketemu jumlah : " + users.size());
//        for (User user : users) {
//            System.out.println("nama User : " + user.getName());
//        }
//    }

//    @Test
    public void hitungSemuaUser() {
        long count = user_service.count();
        System.out.println("count : " + count);
    }

}

