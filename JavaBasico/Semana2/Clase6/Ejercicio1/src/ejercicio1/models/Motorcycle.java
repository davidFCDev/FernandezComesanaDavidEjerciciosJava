package ejercicio1.models;

import java.time.Year;

public class Motorcycle extends Vehicle implements Combustion {

    private int displacement;
    private String engineType;

    public Motorcycle() {
    }

    public Motorcycle(int displacement, String engineType, int id, String plate, String brand, String model, int year, double cost) {
        super(id, plate, brand, model, year, cost);
        this.displacement = displacement;
        this.engineType = engineType;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public int getOld(){
        int actualYear = Year.now().getValue();
        return actualYear - getYear();
    }
    
    @Override
    public void refuel() {
        System.out.println("Refueling is in progress");
    }
}
