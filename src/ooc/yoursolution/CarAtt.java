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
    
    public final String carMake;
    public final int carPrice;
    public final int carQt;

    public CarAtt(String carMake, int carPrice, int carQt) {
        this.carMake = carMake;
        this.carPrice = carPrice;
        this.carQt = carQt;
    }

    public String getCarMake() {
        return carMake;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public int getCarQt() {
        return carQt;
    }

    @Override
    public String toString() {
        return "CarAtt{" + "carMake=" + carMake + ", carPrice=" + carPrice + ", carQt=" + carQt + '}';
    }

}
