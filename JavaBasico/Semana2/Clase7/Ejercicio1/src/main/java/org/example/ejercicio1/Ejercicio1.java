package org.example.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.example.ejercicio1.models.Estudiante;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            String sql = "SELECT * FROM estudiantes";
            ResultSet resultado = statement.executeQuery(sql);

            boolean flag = true;

            while (flag) {
                System.out.println("Ingrese los datos del estudiante que desea añadir:");
                Estudiante nuevoEstudiante = obtenerEstudianteDesdeScanner(scanner);
                agregarEstudiante(nuevoEstudiante, conexion);

                System.out.print("¿Desea agregar otro estudiante? (Escriba 'continuar' para añadir otro, o 'terminar' para finalizar): ");
                String respuesta = scanner.next();

                if (respuesta.equalsIgnoreCase("terminar")) {
                    flag = false;
                }
            }

            // Obtenemos y mostramos la lista de estudiantes
            List<Estudiante> listaEstudiantes = obtenerEstudiantes(conexion);
            mostrarEstudiantes(listaEstudiantes);

            // Cerramos conexión
            resultado.close();
            statement.close();
            conexion.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    // Método para obtener los estudiantes mediante scanner
    public static Estudiante obtenerEstudianteDesdeScanner(Scanner scanner) {

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Calificación: ");
        int calificacion = scanner.nextInt();

        return new Estudiante(nombre, edad, calificacion);
    }

    // Método para agregar estudiante a la base de datos
    public static void agregarEstudiante(Estudiante estudiante, Connection conexion) {
        try {
            String sql = "INSERT INTO estudiantes (id, nombre, edad, calificacion) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setInt(1, estudiante.getId());
                statement.setString(2, estudiante.getNombre());
                statement.setInt(3, estudiante.getEdad());
                statement.setInt(4, estudiante.getCalificacion());
                statement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la lista de todos los estudiantes
    public static List<Estudiante> obtenerEstudiantes(Connection conexion) {
        List<Estudiante> estudiantes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM estudiantes";
            try (PreparedStatement statement = conexion.prepareStatement(sql); ResultSet resultado = statement.executeQuery()) {
                while (resultado.next()) {
                    int id = resultado.getInt("id");
                    String nombre = resultado.getString("nombre");
                    int edad = resultado.getInt("edad");
                    int calificacion = resultado.getInt("calificacion");

                    estudiantes.add(new Estudiante(id, nombre, edad, calificacion));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

    // Método para mostrar la información por pantalla de los estudiantes
    public static void mostrarEstudiantes(List<Estudiante> estudiantes) {
        System.out.println("Lista de estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("ID: " + estudiante.getId()
                    + ", Nombre: " + estudiante.getNombre()
                    + ", Edad: " + estudiante.getEdad()
                    + ", Calificación: " + estudiante.getCalificacion());
        }
    }
}
