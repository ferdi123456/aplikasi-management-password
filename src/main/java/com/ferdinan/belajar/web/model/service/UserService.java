/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdinan.belajar.web.model.service;

import static ch.qos.logback.core.joran.spi.ConsoleTarget.findByName;
import com.ferdinan.belajar.web.model.User;
import java.io.Serializable;
import java.util.List;
import java.util.jar.Attributes.Name;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ferdinan
 */
@Repository
public interface UserService extends PagingAndSortingRepository<User, String>{
    

//    public User findById(String id);//ok
    
//    public User findByNama(String nama);//ok
    
    public User findByNamaAndId(String nama, String id);//OK
    
     
//    
//    @Query("from User u where u.aturan.nama = ?1") <-- ini mengarah ke parameter pertama dalam method
//    @Query("select p from User p where p.id_role.nama = :namaRole") //<-- jika nama param :namaRole dan nama param method :namaRole, maka tidak usah memakai @param
////    @Query("from User u where u.aturan.nama = :nama")
//    public List<User> findUsersBerdasarkanNamaRole(@Param("namaRole") String namaRole);
}
