package com.example.mongo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document
public class Users {
    @Id
    public String email;
    public List<DeviceInfo> DeviceInfo;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<com.example.mongo.Model.DeviceInfo> getDeviceInfo() {
        return DeviceInfo;
    }

    public void setDeviceInfo(List<com.example.mongo.Model.DeviceInfo> deviceInfo) {
        DeviceInfo = deviceInfo;
    }
}
