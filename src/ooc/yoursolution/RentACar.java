/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author Jefferson
 */

public class RentACar implements RentACarInterface {
    
    public String name;
    private List<CarAtt> rentacar;
    
    
     
    public RentACar(String dlrName, List<CarAtt> newCars){
        this.name = dlrName;
        this.rentacar = newCars;
    
    }

    RentACar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   @Override
    public List<CarInterface> getCars() {
        return this.rentacar;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.rentacar.addAll(rentacar);    
    }

    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        for (CarInterface car : cars) {
            if (car.getMake().equals(make)) {
                if (car.isAvailable(month, day)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
    for (CarInterface car : cars) {
            if (car.getMake().equals(make)) {
                return car.getId();
            }
        }
        return 0;
    
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
       return false;
    }

    @Override
    public int getNumberOfCars() {
       return rentacar.size();
    }
    
}
