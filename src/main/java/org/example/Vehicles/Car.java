package org.example.Vehicles;

public class Car implements IVehicles, IVehicleCar{
    private String color;
    private int year;
    private double engine;
    private int seats;

    public Car(String color, int year, double engine, int seats) {
        System.out.println("Color: " + color + "; Year: " + year + "; Engine: " + engine + "; Seats: " + seats);
        configureCar(color, year, engine, seats);
    }

    @Override
    public void configureCar(String color, int year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("Creating a car");
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting");
    }
}