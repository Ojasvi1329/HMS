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
public class Encounterdir {
    private ArrayList<Encounter>Encounters;

    public ArrayList<Encounter> getEncounters() {
        return Encounters;
    }

    public void setEncounters(ArrayList<Encounter> Encounters) {
        this.Encounters = Encounters;
    }
    
    public Encounterdir(ArrayList<Encounter>Encounter)
    {
        this.Encounters=Encounters;
    }
}
