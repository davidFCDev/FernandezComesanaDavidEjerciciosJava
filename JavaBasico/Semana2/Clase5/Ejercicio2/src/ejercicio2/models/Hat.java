
package ejercicio2.models;

public class Hat extends Outfit{
    private String type;
    private char hatSize;

    public Hat() {
    }

    public Hat(String type, char hatSize, int cod, String name, double price, String brand, int size, String color) {
        super(cod, name, price, brand, size, color);
        this.type = type;
        this.hatSize = hatSize;
    }

    public String getType() {
        return type;
    }

    public char getHatSize() {
        return hatSize;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHatSize(char hatSize) {
        this.hatSize = hatSize;
    }

    @Override
    public String showBrand() {
        return "This hat is from the brand: " + getType();
    }
    
    
}
