package com.example.redis.Controller;

import com.example.redis.Dao.UserDao;
import com.example.redis.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class Controller {

    @Autowired
    public UserDao dao;

    @GetMapping("/add/{id}/{name}/{salary}")
    public User add(@PathVariable(value = "id") String id, @PathVariable(value = "name") String name, @PathVariable(value = "salary") float salary){
        User user = new User(id, name, salary);
        return dao.save(user);
    }

    @GetMapping("/find/{id}")
    public User findbyid(@PathVariable(value = "id") String id){
        return dao.findById(id);
    }

    @GetMapping("/findAll")
    public Map<String, User> findAll(){
        return dao.findAll();
    }

}
