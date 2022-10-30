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
public class Doctordirectory {
    public static ArrayList<Doctor> Doctorlist=new ArrayList<Doctor>();

    public static ArrayList<Doctor> getDoctorlist() {
        return Doctorlist;
    }

    public static void setDoctorlist(ArrayList<Doctor> Doctorlist) {
        Doctordirectory.Doctorlist = Doctorlist;
    }

    public Doctordirectory() {
          this.Doctorlist=new ArrayList<Doctor>();
    }


    
}
