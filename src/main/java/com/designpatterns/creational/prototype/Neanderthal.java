package com.designpatterns.creational.prototype;

import java.util.Date;

public class Neanderthal implements Prototype{

    private String fullName;
    private Date birthday;
    private Double weight;
    private Double height;

    public Neanderthal(String fullName, Date birthday, Double weight, Double height) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    }

    public Neanderthal() {
    }

    @Override
    public Prototype clone() {
        Neanderthal neanderthal = new Neanderthal();
        neanderthal.setBirthday(this.birthday);
        neanderthal.setFullName(this.fullName);
        neanderthal.setWeight(this.weight);
        neanderthal.setHeight(this.height);
        return neanderthal;
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
