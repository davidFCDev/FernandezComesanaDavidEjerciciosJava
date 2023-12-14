
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[ ][ ] mapaAsientos = {
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'}
        };

        // Mapa inicial
        mostrarMapa(mapaAsientos);

        // Proceso de reserva
        boolean reservasTerminadas = false;
        while (!reservasTerminadas) {
            System.out.print("Ingresa la fila y el asiento (por ejemplo, 'Fila 3, Asiento 2'): ");
            String entradaUsuario = scanner.nextLine();

            int fila = extraerNumero("Fila", entradaUsuario);
            int asiento = extraerNumero("Asiento", entradaUsuario);

            // Verificar si el asiento está disponible
            if (esAsientoValido(fila, asiento, mapaAsientos)) {
                reservarAsiento(fila, asiento, mapaAsientos);

                // Mostramos el mapa actualizado con la reserva
                mostrarMapa(mapaAsientos);
            } else {
                System.out.println("El asiendo seleccionado ya está ocupado! Por favor, elige otro.");
            }

            // Preguntamos si quiere realizar más reservas
            System.out.print("¿Desea realizar otra reserva? (Sí/No): ");
            String respuesta = scanner.nextLine().toLowerCase();
            reservasTerminadas = !respuesta.equals("sí") && !respuesta.equals("si");
        }

        System.out.println("¡Reservas finalizadas!");
        scanner.close();
    }

    // Método para mostrar los asientos
    private static void mostrarMapa(char[ ][ ] mapa) {
        System.out.println("Mapa de Asientos:");
        for (char[ ] fila : mapa) {
            for (char asiento : fila) {
                System.out.print(asiento + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método para extraer el número de la cadena
    private static int extraerNumero(String tipo, String entrada) {
        String[ ] partes = entrada.split("\\s+");
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

    // Método para verificar si el asiento está disponible
    private static boolean esAsientoValido(int fila, int asiento, char[][] mapa) {
        return fila > 0 && fila <= mapa.length && asiento > 0 && asiento <= mapa[0].length && mapa[fila - 1][asiento - 1] == 'O';
    }

    // Método para reservar un asiento en el teatro
    private static void reservarAsiento(int fila, int asiento, char[ ][ ] mapa) {
        mapa[fila - 1][asiento - 1] = 'X';
        System.out.println("¡Asiento reservado con éxito!");
    }
}


