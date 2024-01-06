
package org.example.ejercicio1.models;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double prize;

    public Car() {
    }

    public Car(String brand, String model, int year, double prize) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.prize = prize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrize() {
        return prize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", prize=" + prize + '}';
    }
    
    
}
