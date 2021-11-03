/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Jefferson
 */
public class BookingSystem implements BookingSystemInterface {

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        
        RentACarInterface rentacar = new RentACar();
        
            in.readLine();
            String text=in.readLine();
            String[] carSplit;   
            
             do {
                 


                
                carSplit = text.split(":");
               
                CarAtt car = new CarAtt(carSplit[0],Integer.parseInt(carSplit[1]),Integer.parseInt(carSplit[2]));
                rentacar.getCars();
                text = in.readLine();
                
                
             } while (text!=null);
             
            return rentacar;
        }
       
        
    }
    

