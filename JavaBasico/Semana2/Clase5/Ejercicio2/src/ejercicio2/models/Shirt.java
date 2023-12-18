
package ejercicio2.models;

public class Shirt extends Outfit {
    private String sleeve;
    private String neck;

    public Shirt() {
    }

    public Shirt(String sleeve, String neck, int cod, String name, double price, String brand, int size, String color) {
        super(cod, name, price, brand, size, color);
        this.sleeve = sleeve;
        this.neck = neck;
    }

    public String getSleeve() {
        return sleeve;
    }

    public String getNeck() {
        return neck;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }
    
    @Override
    public String showBrand() {
        return "This shirt is from the brand: " + getSleeve();
    }
}
