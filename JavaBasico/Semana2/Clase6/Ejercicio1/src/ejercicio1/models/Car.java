
package ejercicio1.models;

public class Car extends Vehicle implements Electric {
    private double battery;
    private int autonomy;

    public Car() {
    }

    public Car(double battery, int autonomy, int id, String plate, String brand, String model, int year, double cost) {
        super(id, plate, brand, model, year, cost);
        this.battery = battery;
        this.autonomy = autonomy;
    }

    public double getBattery() {
        return battery;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }
    
    @Override
    public void chargeEnergy() {
        System.out.println("An electric recharge is being carried out");
    }
    
}
