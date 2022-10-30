/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hms;

import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class Patientdirectory {
    ArrayList<Patient> existingpatients;

    public ArrayList<Patient> getExistingpatients() {
        return existingpatients;
    }

    public Patientdirectory(ArrayList<Patient> existingpatients) {
        this.existingpatients = existingpatients;
    }
     
    public void setExistingpatients( ArrayList<Patient> patients) {
        this.existingpatients=patients;
    }
    
    public void addPatient(Patient p)
    {
        existingpatients.add(p);
    }    
}
