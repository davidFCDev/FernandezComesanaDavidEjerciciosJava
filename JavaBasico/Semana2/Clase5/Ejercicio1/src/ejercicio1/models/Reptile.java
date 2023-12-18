
package ejercicio1.models;

public class Reptile extends Animal {
    private double length;
    private String scaleType;
    private String poisonType;
    private String habitat;

    public Reptile() {
    }
    
    public Reptile(double length, String scaleType, String poisonType, String habitat, int id, String name, int age, String skin, String feeding) {
        super(id, name, age, skin, feeding);
        this.length = length;
        this.scaleType = scaleType;
        this.poisonType = poisonType;
        this.habitat = habitat;
    }

    public double getLength() {
        return length;
    }

    public String getScaleType() {
        return scaleType;
    }

    public String getPoisonType() {
        return poisonType;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setScaleType(String scaleType) {
        this.scaleType = scaleType;
    }

    public void setPoisonType(String poisonType) {
        this.poisonType = poisonType;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void salute() {
        System.out.println("Hello, I'm a reptile!");
    }
}
