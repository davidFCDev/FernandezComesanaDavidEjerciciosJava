
package ejercicio2.models;

public class Product {
    private int cod;
    private String name;
    private String brand;
    private String type;
    private double costPrice;
    private double sellPrice;
    private int stock;

    public Product() {
    }

    public Product(int cod, String name, String brand, String type, double costPrice, double sellPrice, int stock) {
        this.cod = cod;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.stock = stock;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" + "cod=" + cod + ", name=" + name + ", brand=" + brand + ", type=" + type + ", costPrice=" + costPrice + ", sellPrice=" + sellPrice + ", stock=" + stock + '}';
    }
    
    
}
