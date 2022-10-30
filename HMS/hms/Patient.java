/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hms;

/**
 *
 * @author HP
 */
public class Patient {
     private String name;
      private String add;
    private Integer pincode;
      private Integer phoneno;
      private String   bloodgp;
      private String Department;
      private Integer age;
     private Integer tfwardno;

    public Patient(String name, String add, Integer pincode, Integer phoneno, String bloodgp, String Department, Integer age, Integer tfwardno) {
        
        this.name = name;
        this.add = add;
        this.pincode = pincode;
        this.phoneno = phoneno;
        this.bloodgp = bloodgp;
        this.Department = Department;
        this.age = age;
        this.tfwardno = tfwardno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Integer getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Integer phoneno) {
        this.phoneno = phoneno;
    }

    public String getBloodgp() {
        return bloodgp;
    }

    public void setBloodgp(String bloodgp) {
        this.bloodgp = bloodgp;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTfwardno() {
        return tfwardno;
    }

    public void setTfwardno(Integer tfwardno) {
        this.tfwardno = tfwardno;
    }
     
}
