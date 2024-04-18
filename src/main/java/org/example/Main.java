package org.example;

import org.example.Enum.VehicleType;
import org.example.Vehicles.Car;
import org.example.Vehicles.Motorcycle;

public class Main {

    private static VehicleType vehicleType;
    public static void main(String[] args) {

        VehicleType vehicleType= VehicleType.MOTORCYCLE;

        if (vehicleType.equals(VehicleType.CAR)){
            Car car = new Car("White", 2025, 5.0,5);
        }else {
            Motorcycle motorcycle = new Motorcycle("Black",2025, 1600);
        }
    }
}