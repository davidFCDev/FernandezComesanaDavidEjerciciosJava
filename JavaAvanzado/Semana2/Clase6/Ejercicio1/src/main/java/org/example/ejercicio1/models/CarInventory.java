package org.example.ejercicio1.models;

import java.util.ArrayList;
import java.util.List;

public class CarInventory<T extends Car> {

    private List<T> cars;

    public CarInventory() {
        this.cars = new ArrayList<>();
    }

    public void addCar(T car) {
        cars.add(car);
        System.out.println("Se ha añadido al inventario un " + car.getBrand() + " " + car.getModel());
    }

    public List<T> searchByBrand(String brand) {
        List<T> results = new ArrayList<>();
        System.out.println("Resultado de la búsqueda por marca " + brand + ":");
        for (T car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                results.add(car);
            }
        }
        return results;
    }

    public List<T> searchByYear(int year) {
        List<T> results = new ArrayList<>();
        System.out.println("Resultado de la búsqueda por año " + year + ":");
        for (T car : cars) {
            if (car.getYear() == year) {
                results.add(car);
            }
        }
        return results;
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (T car : cars) {
            totalValue += car.getPrize();
        }
        return totalValue;
    }

}
