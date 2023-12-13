
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un mapa de asientos
        char[][] mapaAsientos = {
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'}
        };

        // Mostrar el mapa inicial
        mostrarMapa(mapaAsientos);

        // Iniciar el proceso de reserva
        boolean reservasTerminadas = false;
        while (!reservasTerminadas) {
            // Pedir al usuario que ingrese la fila y el asiento
            System.out.print("Ingrese la fila y el asiento (por ejemplo, 'Fila 3, Asiento 2'): ");
            String entradaUsuario = scanner.nextLine();

            // Analizar la entrada del usuario para obtener fila y asiento
            int fila = extraerNumero("Fila", entradaUsuario);
            int asiento = extraerNumero("Asiento", entradaUsuario);

            // Verificar si el asiento está disponible
            if (esAsientoValido(fila, asiento, mapaAsientos)) {
                // Reservar el asiento
                reservarAsiento(fila, asiento, mapaAsientos);

                // Mostrar el mapa actualizado
                mostrarMapa(mapaAsientos);
            } else {
                System.out.println("¡El asiento seleccionado está ocupado! Por favor, elija otro.");
            }

            // Preguntar si hay más reservas
            System.out.print("¿Desea realizar otra reserva? (Sí/No): ");
            String respuesta = scanner.nextLine().toLowerCase();
            reservasTerminadas = !respuesta.equals("sí") && !respuesta.equals("si");
        }

        System.out.println("¡Reservas finalizadas! Gracias por usar el sistema.");
        scanner.close();
    }

    // Método para mostrar el mapa de asientos
    private static void mostrarMapa(char[][] mapa) {
        System.out.println("Mapa de Asientos:");
        for (char[] fila : mapa) {
            for (char asiento : fila) {
                System.out.print(asiento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para extraer el número de una cadena (por ejemplo, "Fila 3" -> 3)
    private static int extraerNumero(String tipo, String entrada) {
        String[] partes = entrada.split("\\s+");
        for (String parte : partes) {
            if (parte.toLowerCase().contains(tipo.toLowerCase())) {
                try {
                    return Integer.parseInt(parte.replaceAll("[^0-9]", ""));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
        return -1;
    }

    // Método para verificar si un asiento está disponible
    private static boolean esAsientoValido(int fila, int asiento, char[][] mapa) {
        return fila > 0 && fila <= mapa.length && asiento > 0 && asiento <= mapa[0].length && mapa[fila - 1][asiento - 1] == 'O';
    }

    // Método para reservar un asiento
    private static void reservarAsiento(int fila, int asiento, char[][] mapa) {
        mapa[fila - 1][asiento - 1] = 'X';
        System.out.println("¡Asiento reservado con éxito!");
    }
}


