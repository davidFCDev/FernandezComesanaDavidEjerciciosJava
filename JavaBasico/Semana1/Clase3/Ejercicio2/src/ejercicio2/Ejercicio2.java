
package ejercicio2;

import ejercicio2.models.Persona;

public class Ejercicio2 {

    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
        
        // Creamos las personas y las guardamos
        personas[0] = new Persona(1, "David", 30, "Direccion A", "666123456");
        personas[1] = new Persona(1, "Manuel", 35, "Direccion B", "666654321");
        personas[2] = new Persona(1, "Jose", 20, "Direccion C", "666162534");
        personas[3] = new Persona(1, "María", 36, "Direccion D", "666615243");
        personas[4] = new Persona(1, "Sofía", 33, "Direccion E", "666563412");
        
        // Nombre y edad de cada persona en el vector
        System.out.println("Nombre y edad de las personas almacenadas: ");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");
        }
        
        // Cambio de nombres
        System.out.println("///////////////////////////////////////////");
        System.out.println("Nombres antes del cambio:");
        System.out.println("Persona 1: " + personas[0].getNombre());
        System.out.println("Persona 2: " + personas[1].getNombre());
        
        personas[0].setNombre("Paco");
        personas[1].setNombre("Adolfo");
        
        System.out.println("Nombres después del cambio:");
        System.out.println("Persona 1: " + personas[0].getNombre());
        System.out.println("Persona 2: " + personas[1].getNombre());
        System.out.println("///////////////////////////////////////////");
        
        // Mostrar personas mayores de 30 años
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println(persona.getNombre() + " es mayor de 30 años.");
            }
        }
    }
    
}
