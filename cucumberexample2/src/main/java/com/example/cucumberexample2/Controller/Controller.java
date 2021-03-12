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

    @GetMapping("")
    public String test(){
        return "check";
    }

    @GetMapping("/findall")
    public List<entity> findAll(){
        return entityService.findAll();
    }

    @GetMapping("/findall/{id}")
    public entity findAll(@PathVariable(value = "id") int id){
        return entityService.findById(id);
    }

    @PostMapping("/Add")
    public entity addd(@RequestBody entity ent){
         return entityService.save(ent);
    }

}
