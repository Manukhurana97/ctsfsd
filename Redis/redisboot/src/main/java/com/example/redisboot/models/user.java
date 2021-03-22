package com.example.redisboot.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class user implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String username;
    public String password;



}
