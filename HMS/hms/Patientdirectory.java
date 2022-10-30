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
    public static ArrayList<Patient> Patientlist=new ArrayList<Patient>();

    public static ArrayList<Patient> getPatientlist() {
        return Patientlist;
    }

    public static void setPatientlist(ArrayList<Patient> Patientlist) {
        Patientdirectory.Patientlist = Patientlist;
    }

    public Patientdirectory() {
         this.Patientlist=new ArrayList<Patient>();
    }



}

