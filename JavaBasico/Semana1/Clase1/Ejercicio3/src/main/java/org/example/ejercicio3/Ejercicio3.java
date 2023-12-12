
package org.example.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitamos la base
        System.out.println("Vamos a calcular el área de un triángulo");
        System.out.println("Ingresa la longitud de la base: ");
        double base = scanner.nextDouble();
        
        // Solicitamos la altura
        System.out.println("Ingresa la altura: ");
        double height = scanner.nextDouble();
        
        // Calculamos el área
        double area = (base * height) / 2;
        
        System.out.println("El área del triángulo es: " + area);
        
    }
}
