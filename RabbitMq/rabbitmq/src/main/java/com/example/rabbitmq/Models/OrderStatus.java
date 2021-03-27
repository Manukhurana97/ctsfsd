package com.example.rabbitmq.Models;



public class OrderStatus {
    private Orders order;
    private String status;
    private String message;

    public OrderStatus() {
    }

    public OrderStatus(Orders order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}