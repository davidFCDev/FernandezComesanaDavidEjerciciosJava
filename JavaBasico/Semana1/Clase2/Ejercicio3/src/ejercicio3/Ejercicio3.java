
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] temperaturasSemana = new double[7];
        
        // Recorremos el vector pidiendo los datos para cada día
        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingresa la temperatura máxima del día " + dia + ": ");
            temperaturasSemana[dia - 1] = scanner.nextDouble();
        }
        
        double promedioTemperaturas = calcularPromedio(temperaturasSemana);
        
        System.out.println("La temperatura máxima promedio de la semana es: " + promedioTemperaturas);
        
        scanner.close();
        
    }
    
    // Función para calcular el promedio
    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;
        for (double temperatura : temperaturas) {
            suma += temperatura;
        }
        
        return suma / temperaturas.length;
    }
    
}
