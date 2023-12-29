package ejercicio1;

import ejercicio1.exceptions.ReservaInvalidaException;
import ejercicio1.models.Reserva;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación de reserva de vuelos.");
        System.out.println("Completa los datos para formalizar tu reserva:");
        System.out.println("-------------------------------------------");

        // Solicitar información al usuario
        String nombre = obtenerInputValido(scanner, "Ingresa tu nombre: ");

        String destino = obtenerInputValido(scanner, "Ingresa el destino del vuelo: ");

        LocalDate fecha = obtenerFechaValida(scanner);

        Reserva reserva = new Reserva(nombre, destino, fecha, 50);

        System.out.println("Asientos disponibles : " + reserva.getNumeroAsientos());

        int cantidadPasajeros = obtenerAsientosValido(scanner, "Ingrese la cantidad de pasajeros: ");

        try {
            reserva.reservarVuelo(cantidadPasajeros);
            System.out.println("¡Se ha realizado la reserva con éxito!");
            System.out.println("-------------------------------------------");
            System.out.println("Detalles de la reserva:\n" + reserva);
            System.out.println("-------------------------------------------");
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al realizar la reserva: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String obtenerInputValido(Scanner scanner, String mensaje) {
        String input;
        do {
            System.out.print(mensaje);
            input = scanner.nextLine().trim();
            if (!esInputValido(input)) {
                System.out.println("Error: El texto debe contener un formato válido. Inténtalo de nuevo.");
            }
        } while (!esInputValido(input));
        return input;
    }

    private static boolean esInputValido(String str) {
        return str.matches("^[a-zA-Z]+$");
    }

    private static LocalDate obtenerFechaValida(Scanner scanner) {
        LocalDate fecha = null;
        do {
            try {
                System.out.print("Ingresa la fecha de la reserva (AAAA-MM-DD): ");
                String fechaStr = scanner.nextLine();
                fecha = LocalDate.parse(fechaStr);
            } catch (Exception e) {
                System.out.println("Escribe la fecha con el formato correcto. Inténtalo de nuevo.");
            }
        } while (fecha == null);
        return fecha;
    }

    private static int obtenerAsientosValido(Scanner scanner, String mensaje) {
        int numero = -1;
        boolean esValido = false;
        do {
            try {
                System.out.print(mensaje);
                String input = scanner.nextLine();
                numero = Integer.parseInt(input);
                esValido = true;

                if (numero < 0) {
                    System.out.println("Error: Ingresa un número positivo. Inténtalo de nuevo.");
                    esValido = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido. Inténtalo de nuevo.");
            }
        } while (!esValido);
        return numero;
    }
}
