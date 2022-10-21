package com.designpatterns.creational.prototype;

import java.util.Date;

public class Sapiens implements Prototype{

    private String fullName;
    private Date birthday;
    private Double weight;
    private Double height;

    @Override
    public Prototype clone() {
        Sapiens sapien = new Sapiens();
        sapien.setBirthday(this.birthday);
        sapien.setFullName(this.fullName);
        sapien.setWeight(this.weight);
        sapien.setHeight(this.height);
        return sapien;
    }

    public Sapiens(String fullName, Date birthday, Double weight, Double height) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    }

    public Sapiens() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
