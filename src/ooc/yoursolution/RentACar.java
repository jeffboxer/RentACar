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
    
    ArrayList<CarAtt> RentACar;
    
     public RentACar(){
        RentACar = new ArrayList<>();
    }
     
     
 

  
      @Override
    public CarAtt getItem(String title) {
        for(CarAtt item : RentACar){
            
                return item;      
        }
        return null;
    }
    
   @Override
    public List<CarAtt> getCars() {
        
         for(CarAtt item : RentACar){
            
                return item;      
        }
        return null;
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        this.RentACar.addAll(RentACar);    
    }

    @Override
    public String getName() {
       return this.RentACar;
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
    for (CarInterface car : RentACar) {
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
       return RentACar.size();
    }
    
}
