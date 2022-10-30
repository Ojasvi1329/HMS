/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hms;

/**
 *
 * @author HP
 */
public class hospital {
  private String name;
 private  String fadd1;
 private Integer tfpin1;
 private Integer tfdoctorid;
 private String Department;
 private Integer experience;
 private String cityname;

    public hospital(String name, String fadd1, Integer tfpin1, Integer tfdoctorid, String Department, Integer experience, String cityname) {
        this.name = name;
        this.fadd1 = fadd1;
        this.tfpin1 = tfpin1;
        this.tfdoctorid = tfdoctorid;
        this.Department = Department;
        this.experience = experience;
        this.cityname = cityname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFadd1() {
        return fadd1;
    }

    public void setFadd1(String fadd1) {
        this.fadd1 = fadd1;
    }

    public Integer getTfpin1() {
        return tfpin1;
    }

    public void setTfpin1(Integer tfpin1) {
        this.tfpin1 = tfpin1;
    }

    public Integer getTfdoctorid() {
        return tfdoctorid;
    }

    public void setTfdoctorid(Integer tfdoctorid) {
        this.tfdoctorid = tfdoctorid;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
 
}
