/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hms;

/**
 *
 * @author HP
 */
public class Vitalsigns {
    private int bloodpressure;
    private int temperature;
    private int respirationrate;
    private String Entered;
    private String Updated;
    
    public Vitalsigns(int bloodpressure, int temperature,int respirationrate,String Entered,String Updated){
        
    }

    public String getEntered() {
        return Entered;
    }

    public void setEntered(String Entered) {
        this.Entered = Entered;
    }

    public String getUpdated() {
        return Updated;
    }

    public void setUpdated(String Updated) {
        this.Updated = Updated;
    }

    public int getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(int bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getRespirationrate() {
        return respirationrate;
    }

    public void setRespirationrate(int respirationrate) {
        this.respirationrate = respirationrate;
    }
    
    
}
