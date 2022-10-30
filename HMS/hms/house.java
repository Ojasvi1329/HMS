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
public class house {
    private String housename;
    private ArrayList<Person>Person;
   
    public house(String housename,ArrayList<Person>Person)
    {
        this.housename=housename;
        this.Person=Person;
    }

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public ArrayList<Person> getPerson() {
        return Person;
    }

    public void setPerson(ArrayList<Person> Person) {
        this.Person = Person;
    }
    
}
