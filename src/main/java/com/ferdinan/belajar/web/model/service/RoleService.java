/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdinan.belajar.web.model.service;

import com.ferdinan.belajar.web.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ferdinan
 */
@Repository
public interface RoleService extends PagingAndSortingRepository<Role, String>{
    
}
