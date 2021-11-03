/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

/**
 *
 * @author Jefferson
 */
public class CarAtt {
    
    String carMake;
    int carPrice;
    int carQt;

    public CarAtt(String carMake, int carPrice, int carQt) {
        this.carMake = carMake;
        this.carPrice = carPrice;
        this.carQt = carQt;
    }

    @Override
    public String toString() {
        return "CarAtt{" + "carMake=" + carMake + ", carPrice=" + carPrice + ", carQt=" + carQt + '}';
    }
    
}
