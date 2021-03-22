package com.example.redis.Models;

import java.io.Serializable;

public class User implements Serializable {
    public String id;
    public String name;
    public float salary;

    public User(String id, String name, float salary) {
        this.id = id;
        this.name = name;
        salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
