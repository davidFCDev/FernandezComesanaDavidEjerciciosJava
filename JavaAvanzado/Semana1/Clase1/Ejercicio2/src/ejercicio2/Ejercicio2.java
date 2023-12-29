package ejercicio2;

import ejercicio2.exceptions.InventarioException;
import ejercicio2.models.GestionInventario;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        GestionInventario gestionInventario = new GestionInventario();
        Scanner scanner = new Scanner(System.in);

        try {

            // Scanner de la clase incluyendo las validaciones al obtener los datos
            String nombre = obtenerNombreValido(scanner, "Ingresa el nombre del producto (en singular): ");
            double precio = obtenerPrecioValido(scanner, "Ingresa el precio del producto: ");
            int cantidad = obtenerCantidadValida(scanner, "Ingresa la cantidad del producto: ");

            gestionInventario.agregarProducto(nombre, precio, cantidad);
            if (cantidad > 1) {
                System.out.println("Se han añadido " + cantidad + " " + nombre + "s a un precio de " + precio + "€");
            } else {
                System.out.println("Se ha añadido " + cantidad + " " + nombre + " a un precio de " + precio + "€");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresa un número válido");
        } catch (InventarioException e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    private static String obtenerNombreValido(Scanner scanner, String mensaje) {
        String input;
        do {
            System.out.print(mensaje);
            input = scanner.nextLine().trim();
            if (!esValido(input)) {
                System.out.println("Error: El nombre debe contener un formato válido. Inténtalo de nuevo.");
            }
        } while (!esValido(input));
        return input;
    }

    private static boolean esValido(String str) {
        return str.matches("^[a-zA-Z]+$");
    }

    private static double obtenerPrecioValido(Scanner scanner, String mensaje) {
        double precio = 0;
        boolean precioValido = false;

        do {
            System.out.print(mensaje);
            String input = scanner.nextLine().trim();

            try {
                precio = Double.parseDouble(input);
                if (precio > 0) {
                    precioValido = true;
                } else {
                    System.out.println("Error: El precio no puede ser negativo. Inténtalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido para el precio. Inténtalo de nuevo.");
            }
        } while (!precioValido);

        return precio;
    }

    private static int obtenerCantidadValida(Scanner scanner, String mensaje) {
        int cantidad = 0;
        boolean cantidadValida = false;

        do {
            System.out.print(mensaje);
            String input = scanner.nextLine().trim();

            try {
                cantidad = Integer.parseInt(input);
                if (cantidad > 0) {
                    cantidadValida = true;
                } else {
                    System.out.println("Error: La cantidad no puede ser negativa. Inténtalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido para la cantidad. Inténtalo de nuevo.");
            }
        } while (!cantidadValida);

        return cantidad;
    }

}
