
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        
        if ( edad >= 18){
            System.out.println("Genial! Puedes acceder al evento");
        } else {
            System.out.println("Lo sentimos, no puedes acceder al evento");
        }
    }
}
