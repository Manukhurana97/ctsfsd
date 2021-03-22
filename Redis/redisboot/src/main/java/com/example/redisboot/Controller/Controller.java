package com.example.redisboot.Controller;

import com.example.redisboot.dao.userdao;
import com.example.redisboot.models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@Cacheable(cacheNames = {"userdetails"})
@RestController
public class Controller {
    @Autowired
    userdao dao;

    @GetMapping("/add/{name}/{password}")
    public user save(@PathVariable(value = "name") String name, @PathVariable(value = "password") String password){
        user usr = new user();
        usr.setUsername(name);
        usr.setPassword(password);
        return dao.save(usr);
    }


    @GetMapping("/find/{id}")
    @Cacheable(key = "#id", value = "user")
    public user find(@PathVariable(value = "id") int id){
        return dao.findById(id);
    }
}
