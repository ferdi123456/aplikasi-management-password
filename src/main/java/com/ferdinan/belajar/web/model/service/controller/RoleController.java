/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferdinan.belajar.web.model.service.controller;

import com.ferdinan.belajar.web.model.Role;
import com.ferdinan.belajar.web.model.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ferdinan
 */
@RestController
@RequestMapping("/home")
public class RoleController {
    
    @Autowired
    private RoleService roleService;
    
    //meminta tampilkan semua yang ada dalam role(ok)
    @RequestMapping(value = "/role", method = RequestMethod.GET)
    public Iterable<Role> tampilSemuaRole(){
        return roleService.findAll();
    }
    
    //meminta tampilkan nama lebih spesifik
    @RequestMapping(value = "/role/{id}", method = RequestMethod.GET)
    public Role tampilSemuaRole(@PathVariable(value = "id")String idRole){
        return roleService.findOne(idRole);
    }
    
    @RequestMapping(value = "/role", method = RequestMethod.POST)
    public void simpanData(@RequestBody Role role)throws Exception{
        if(role == null){
            throw new Exception("Role tidak boleh null");
        }
        
        roleService.save(role);
    }
    
    @RequestMapping(value = "/role/{id}", method = RequestMethod.DELETE)
    public void hapusRole(@PathVariable(value = "id")String idRole)throws Exception{
        if( idRole.trim().length() <= 0 || idRole == null ){
            throw new Exception("id tidak boleh kosong atau null");
        }
        Role role = roleService.findOne(idRole);
        if(role == null){
            throw new Exception("Role dengan id tidak ditemukan");
        }
        roleService.delete(role);
    }
    
    
    @RequestMapping(value = "/role/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable String id, @RequestBody Role x) throws Exception {
        Role role = roleService.findOne(id);
        if (role == null) {
            throw new Exception("Role dengan id tidak ditemukan");
        }
        x.setId(role.getId());
        roleService.save(x);
    }
    
}