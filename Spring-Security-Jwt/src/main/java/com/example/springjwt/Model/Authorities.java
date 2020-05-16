package com.example.springjwt.Model;


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

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
