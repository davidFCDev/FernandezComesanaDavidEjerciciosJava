package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Objeto sin parámetros
        Electrodomestico television = new Electrodomestico();

        // Objetos con parámetros
        Electrodomestico thermomix = new Electrodomestico(145, "Vorwerk", "Tm6", 1400, "Blanco");
        Electrodomestico aspirador = new Electrodomestico(150, "Dyson", "V8", 115, "Negro");
        Electrodomestico airfryer = new Electrodomestico(210, "Cecoteq", "Window 6000", 1300, "Negro");

        System.out.println("La thermomix de marca " + thermomix.getMarca() + " y modelo " + thermomix.getModelo() + " tiene un consumo energético de " + thermomix.getConsumo() + "W.");
        System.out.println("El aspirador de marca " + aspirador.getMarca() + " y modelo " + aspirador.getModelo() + " tiene un consumo energético de " + aspirador.getConsumo() + "W.");
        System.out.println("La airfryer de marca " + airfryer.getMarca() + " y modelo " + airfryer.getModelo() + " tiene un consumo energético de " + airfryer.getConsumo() + "W.");
        
        // Obtenemos un null al no enviarle parámetros
        System.out.println("La marca de la televisión es " + television.getMarca());
    }

}
