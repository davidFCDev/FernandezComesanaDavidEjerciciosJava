
package ejercicio2.models;

public class Shoe extends Outfit {
    private String material;
    private String zipType;

    public Shoe() {
    }

    public Shoe(String material, String zipType, int cod, String name, double price, String brand, int size, String color) {
        super(cod, name, price, brand, size, color);
        this.material = material;
        this.zipType = zipType;
    }

    public String getMaterial() {
        return material;
    }

    public String getZipType() {
        return zipType;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setZipType(String zipType) {
        this.zipType = zipType;
    }
    
    @Override
    public String showBrand() {
        return "These shoes are from the brand: " + getBrand();
    }
}
