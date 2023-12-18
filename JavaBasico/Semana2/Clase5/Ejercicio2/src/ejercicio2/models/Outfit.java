
package ejercicio2.models;

public class Outfit {
    private int cod;
    private String name;
    private double price;
    private String brand;
    private int size;
    private String color;

    public Outfit() {
    }

    public Outfit(int cod, String name, double price, String brand, int size, String color) {
        this.cod = cod;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Outfit{" + "cod=" + cod + ", name=" + name + ", price=" + price + ", brand=" + brand + ", size=" + size + ", color=" + color + '}';
    }
    
    public String showBrand() {
        return "This piece is from the brand: " + getBrand();
    }
}
