
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Primer número
        System.out.println("Introduce un número entero: ");
        int number1 = scanner.nextInt();
        
        // Segundo número
        System.out.println("Introduce un segundo número entero: ");
        int number2 = scanner.nextInt();
        
        // Devolvemos las operaciones
        int suma = number1 + number2;
        int resta = number1 - number2;
        int multiplicacion = number1 * number2;
        int division = number1 / number2;
        System.out.println("El resultado de la suma de " + number1 + " y " + number2 + " es igual a: " + suma);
        System.out.println("El resultado de la resta entre " + number1 + " y " + number2 + " es igual a: " + resta);
        System.out.println("El resultado de la multiplicación entre " + number1 + " y " + number2 + " es igual a: " + multiplicacion);
        System.out.println("El resultado de la división entre " + number1 + " y " + number2 + " es igual a: " + division);
    }
    
    // Si intentamos dividir entre 0 nos tirará un error 'ArithmeticException', porque no está definida en matemáticas
    // Podemos controlarlo con un try & catch o con un if previo
}

