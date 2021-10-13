package com.example.learnspringboost.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "phones")
public class Phones {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id; 

    @Column()
    private String phone; 
    

    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
