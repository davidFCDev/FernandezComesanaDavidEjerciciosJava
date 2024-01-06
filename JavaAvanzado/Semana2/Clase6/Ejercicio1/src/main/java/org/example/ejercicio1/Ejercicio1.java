package org.example.ejercicio1;

import java.util.List;
import org.example.ejercicio1.models.CarInventory;
import org.example.ejercicio1.models.Car;

public class Ejercicio1 {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022, 25000.0);
        Car car2 = new Car("Honda", "Civic", 2023, 22000.0);
        Car car3 = new Car("Ford", "Focus", 2022, 23000.0);
        Car car4 = new Car("Chevrolet", "Malibu", 2020, 28000.0);
        Car car5 = new Car("Nissan", "Altima", 2022, 26000.0);
        Car car6 = new Car("Ford", "Kuga", 2023, 23000.0);
        Car car7 = new Car("Volkswagen", "Jetta", 2020, 24000.0);

        // Crear coches y añadirlos
        CarInventory<Car> carInventory = new CarInventory<>();

        carInventory.addCar(car1);
        carInventory.addCar(car2);
        carInventory.addCar(car3);
        carInventory.addCar(car4);
        carInventory.addCar(car5);
        carInventory.addCar(car6);
        carInventory.addCar(car7);

        System.out.println("---------------------------------------------");

        // Buscar coches por marca
        String brandToSearch = "Ford";
        List<Car> carResultsByBrand = carInventory.searchByBrand(brandToSearch);
        
        for (Car car : carResultsByBrand) {
            System.out.println(car);
        }
        System.out.println("---------------------------------------------");

        // Buscar coches por fecha
        int yearToSearch = 2022;
        List<Car> carResultsByYear = carInventory.searchByYear(yearToSearch);
        
        for (Car car : carResultsByYear) {
            System.out.println(car);
        }
        System.out.println("---------------------------------------------");

        // Calcular el valor total del inventario
        double totalValue = carInventory.calculateTotalValue();
        System.out.println("Valor total del inventario: " + totalValue + "€");
    }
}
