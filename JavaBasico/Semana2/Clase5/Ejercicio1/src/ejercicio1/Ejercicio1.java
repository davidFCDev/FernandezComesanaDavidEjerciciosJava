
package ejercicio1;

import ejercicio1.models.Bird;
import ejercicio1.models.Mammal;
import ejercicio1.models.Reptile;

public class Ejercicio1 {

    public static void main(String[] args) {
        Mammal lion = new Mammal(4, "Viviparous reproduction", "Brown", "Savannah", 1, "Lion", 13, "Thin skin", "Carnivorous");
        Bird pelican = new Bird(30.12, "Delta", "White plumage", "Long beak", 3, "Pelican", 5, "Thin skin",  "Fish");
        Reptile iguana = new Reptile(1.13, "Small rigid scales", "No poison", "Rainforests", 3, "Common Iguana", 8, "Hard skin", "Herbivorous" );
        
        lion.salute();
        pelican.salute();
        iguana.salute();
        
        // Debido al polimorfismo podemos asignar un objeto de una clase hija a una clase padre, pero no al revés
        // Se puede castear pero puede provocar una excepcion
        
        // No podemos acceder a los atributos privados desde fuera de la clase
        // Conseguiremos un error de compilación
    }
    
}
