package org.example.Vehicles;

public class Motorcycle implements IVehicles,IVehicleMotorcycle{
    private String color;
    private int year;
    private double engine;

    public Motorcycle(String color, int year, double engine) {
        System.out.println("Color: " + color + "; Year: " + year + "; Engine: " + engine);
        configureMotorcycle(color, year, engine);
    }

    @Override
    public void configureMotorcycle(String color, int year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        System.out.println("Creating a motorcycle");
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting");
    }
}
