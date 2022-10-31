/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hms;

/**
 *
 * @author HP
 */
public class Encounter {
    private Vitalsigns Vitalsigns;

    public Vitalsigns getVitalsigns() {
        return Vitalsigns;
    }

    public void setVitalsigns(Vitalsigns Vitalsigns) {
        this.Vitalsigns = Vitalsigns;
    }
    
    public Encounter(Vitalsigns Vitalsigns)
    {
        this.Vitalsigns=Vitalsigns;
    }
}
