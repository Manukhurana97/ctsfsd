package com.example.demo.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class Users {

    @Id
    public String username;
    public String password;
    @Column(columnDefinition = "boolean default true")
    public boolean enabled;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
    @JsonIgnore
    private Authorities authorities;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Authorities getAuthorities() {
        return authorities;
    }


}
