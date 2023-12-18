
package ejercicio1.models;

public class Mammal extends Animal {

   private int legsNumber;
   private String reproductionType;
   private String skinColor;
   private String habitat;

    public Mammal() {
    }

    public Mammal(int legsNumber, String reproductionType, String skinColor, String habitat, int id, String name, int age, String skin, String feeding) {
        super(id, name, age, skin, feeding);
        this.legsNumber = legsNumber;
        this.reproductionType = reproductionType;
        this.skinColor = skinColor;
        this.habitat = habitat;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public String getReproductionType() {
        return reproductionType;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    public void setReproductionType(String reproductionType) {
        this.reproductionType = reproductionType;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    @Override
    public void salute() {
        System.out.println("Hello, I'm a mammal!");
    }
}
