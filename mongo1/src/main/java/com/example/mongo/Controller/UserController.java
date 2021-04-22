package com.example.mongo.Controller;

import com.example.mongo.Dao.Dao;
import com.example.mongo.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    public Dao user_dao;


    @RequestMapping(method = RequestMethod.POST, path = "/Add")
    public String savedata(@RequestBody Users users)
    {
       try{
           System.out.println(users.toString());
           Users data = user_dao.save(users);
           return data+" saved successfully";
       }
       catch (Exception e){
           return e.toString();
       }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/userinfo/{email}")
    public Users getuserdevices(@PathVariable(value = "email") String email)
    {
        Users data = null;
        try{

            data = user_dao.findUsersByEmail(email);
            return data;
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return data;
    }

}
