
package ejercicio1;

import ejercicio1.models.Car;
import ejercicio1.models.Combustion;
import ejercicio1.models.Electric;
import ejercicio1.models.Motorcycle;
import ejercicio1.models.Truck;
import ejercicio1.models.Vehicle;
import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        // Objetos
        Car electricCar = new Car(57.5, 4, 1, "4352B", "Tesla", "Model S", 2016, 95970);
        Car electricCar2 = new Car(60.5, 3, 2, "1234Z", "Tesla", "Model Y", 2020, 47970);
        Truck combustionTruck = new Truck(70, 15, 3, "4434V", "Range Rover", "Evoque", 2021, 140500);
        Truck combustionTruck2 = new Truck(60, 15, 4, "3311A", "Range Rover", "Sport", 2023, 160900);
        Motorcycle combustionMotorcycle = new Motorcycle(150, "Brushless", 5, "1515R", "Ducati", "Model A", 2015, 12000);
        Motorcycle combustionMotorcycle2 = new Motorcycle(200, "Brushless", 6, "6615R", "Harley Davinson", "Model B", 2010, 16000);
        
        // ArayList de tipo vehículo
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(electricCar);
        vehicles.add(electricCar2);
        vehicles.add(combustionTruck);
        vehicles.add(combustionTruck2);
        vehicles.add(combustionMotorcycle);
        vehicles.add(combustionMotorcycle2);
        
        // Recorremos el ArrayList
        for (Vehicle vehicle : vehicles) {
            System.out.println("ID: " + vehicle.getId());
            System.out.println("Brand & Model: " + vehicle.getBrand() + " " + vehicle.getModel());
            System.out.println("Year: " + vehicle.getYear());
            System.out.println("Cost: " + vehicle.getCost() + " €");
            System.out.println("Old: " + vehicle.getOld() + " years");
            
            if (vehicle instanceof Electric) {
                ((Electric) vehicle).chargeEnergy();
            } else if (vehicle instanceof Combustion) {
                ((Combustion) vehicle).refuel();
            }

            System.out.println("---------------------------");
        }
    }
    
}
