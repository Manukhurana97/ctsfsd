package com.example.demo.Model;

import javax.persistence.*;



@Entity
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String authority;

    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "username", nullable = false)
    public Users user;

    public String getAuthority() {
        return authority;
    }



    public Users getUser() {
        return user;
    }

}
