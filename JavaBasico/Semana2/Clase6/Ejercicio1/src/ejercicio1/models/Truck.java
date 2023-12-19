
package ejercicio1.models;

public class Truck extends Vehicle implements Combustion {
    private int tankCapacity;
    private double combustibleCost;

    public Truck() {
    }

    public Truck(int tankCapacity, double combustibleCost, int id, String plate, String brand, String model, int year, double cost) {
        super(id, plate, brand, model, year, cost);
        this.tankCapacity = tankCapacity;
        this.combustibleCost = combustibleCost;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public double getCombustibleCost() {
        return combustibleCost;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setCombustibleCost(double combustibleCost) {
        this.combustibleCost = combustibleCost;
    }
    
    @Override
    public void refuel() {
        System.out.println("Refueling is in progress");
    }
}
