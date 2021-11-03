/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Jefferson
 */
public class Car implements CarInterface {
    
    int id;
    Make make;
    double rate;
    Map<Month, boolean[]> availability;
    
    public Car(int id, Make make, int rate){
        this.id = id;
        this.make = make;
        this.rate = rate;
        this.availability = createAvailability();   
    }
    

    @Override
    public Map<Month, boolean[]> createAvailability() {
       return availability;
    }

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
       this.make = make;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        
return false;
       
    }

    @Override
    public boolean book(Month month, int day) {
        return false;
    }
    
}
