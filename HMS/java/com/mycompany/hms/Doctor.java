/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hms;

/**
 *
 * @author HP
 */
public class Doctor {
    public String name;
     public String address;
   public int pincode;
    public int phno;
    public int bt;
     public int bp;
     public int age;
     public int RespirationRate;

    public Doctor(String name, String address, int pincode, int phno, int bt, int bp, int age, int RespirationRate) {
        this.name = name;
        this.address = address;
        this.pincode = pincode;
        this.phno = phno;
        this.bt = bt;
        this.bp = bp;
        this.age = age;
        this.RespirationRate = RespirationRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }

    public int getBt() {
        return bt;
    }

    public void setBt(int bt) {
        this.bt = bt;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRespirationRate() {
        return RespirationRate;
    }

    public void setRespirationRate(int RespirationRate) {
        this.RespirationRate = RespirationRate;
    }
    
}
