package com.example.cucumberexample2.Controller;

import com.example.cucumberexample2.Service.EntityService;
import com.example.cucumberexample2.model.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    public EntityService entityService;


    @GetMapping("/findall")
    public List<entity> findAll(){
        return entityService.findAll();
    }

    @GetMapping("/findall/{id}")
    public entity findAll(@PathVariable(value = "id") int id){
        return entityService.findById(id);
    }


    @PostMapping("/login")
    public entity findByUsernameAndAndPassword(@RequestBody entity entity){
        System.out.println(entity.getUsername()+" "+ entity.getPassword());
        return entityService.findByUsernameAndAndPassword(entity.getUsername(), entity.getPassword());
    }


    @PostMapping("/Add")
    public entity add(@RequestBody entity ent){
         return entityService.save(ent);
    }

}
