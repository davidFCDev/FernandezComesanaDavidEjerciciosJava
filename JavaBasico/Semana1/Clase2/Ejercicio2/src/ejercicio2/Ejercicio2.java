
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        boolean flag = false;
        
        System.out.println("Ingresa los precios de tu producto. Escribe 0 para detener.");
        
        while (flag!=true) {
            System.out.println("Ingresa un precio: ");
            double price = scanner.nextDouble();
            
            if (price == 0) {
                flag = true;
            }
            
            total = price + total;

        }
        System.out.println("El total de tus productos es: " + total);
    }
}
