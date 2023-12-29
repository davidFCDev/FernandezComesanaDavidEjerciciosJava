package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vectorDatos = new String[5];

        almacenarDatosEnVector(vectorDatos, scanner);
        accederDatosEnVector(vectorDatos, scanner);

        scanner.close();
    }

    private static void almacenarDatosEnVector(String[] vector, Scanner scanner) {
        System.out.println("Ingresa los datos del vector:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingresa el dato en la posición " + (i + 1) + ": ");
            vector[i] = scanner.nextLine();
        }

        System.out.println("-------------------------------------");
        System.out.println("Se han almacenado los datos correctamente.");
        System.out.println("-------------------------------------");
    }

    private static void accederDatosEnVector(String[] vector, Scanner scanner) {
        System.out.println("\nAcceder a datos en el vector:");

        boolean indiceValido = false;

        while (!indiceValido) {
            try {
                System.out.print("Ingresa el índice para acceder a un dato: ");
                int indice = Integer.parseInt(scanner.nextLine());

                indice--;
                String dato = vector[indice];
                System.out.println("Dato en la posición " + (indice + 1) + ": " + dato);

                indiceValido = true;

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número entero válido como índice.");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Estás intentando acceder a una posición errónea del vector.");
            }
        }
    }
}
