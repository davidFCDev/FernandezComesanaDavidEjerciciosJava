package ejercicio1.models;

public class Electrodomestico {

    private int cod;
    private String marca;
    private String modelo;
    private int consumo;
    private String color;

    // Constructor 
    public Electrodomestico() {
    }

    public Electrodomestico(int cod, String marca, String modelo, int consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }
    
    // Getters
    public int getCod() {
        return cod;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getConsumo() {
        return consumo;
    }
    
    public String getColor() {
        return color;
    }

}
