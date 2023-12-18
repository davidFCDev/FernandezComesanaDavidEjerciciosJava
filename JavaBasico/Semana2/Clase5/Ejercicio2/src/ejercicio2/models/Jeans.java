
package ejercicio2.models;

public class Jeans extends Outfit {
    private String style;
    private String fabricType;

    public Jeans() {
    }

    public Jeans(String style, String fabricType, int cod, String name, double price, String brand, int size, String color) {
        super(cod, name, price, brand, size, color);
        this.style = style;
        this.fabricType = fabricType;
    }

    public String getStyle() {
        return style;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }
    
    @Override
    public String showBrand() {
        return "These jeans are from the brand: " + getStyle();
    }
}
