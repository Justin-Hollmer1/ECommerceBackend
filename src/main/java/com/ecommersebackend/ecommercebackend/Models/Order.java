package com.ecommersebackend.ecommercebackend.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String date;
    @Column
    private double cost;
    @Column
    private long userID;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public long getUserID() {
        return userID;
    }
    public void setUserID(long userID) {
        this.userID = userID;
    }
}