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
    private Encounterdir Encounterdir;
    public Patient(Encounterdir Encounterdir)
    {
     this.Encounterdir=Encounterdir;
    }

    public Encounterdir getEncounterdir() {
        return Encounterdir;
    }

    public void setEncounterdir(Encounterdir Encounterdir) {
        this.Encounterdir = Encounterdir;
    }
}
