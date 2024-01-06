package org.example.ejercicio2;

import java.util.List;
import org.example.ejercicio2.models.PetRegister;
import org.example.ejercicio2.models.Pet;

public class Ejercicio2 {

    public static void main(String[] args) {
        PetRegister<Pet> petRegister = new PetRegister<>();
        petRegister.addPet(new Pet(1L, "Leo", 3, "Perro"));
        petRegister.addPet(new Pet(2L, "Chiscas", 2, "Gato"));
        petRegister.addPet(new Pet(3L, "Lagartijo", 5, "Reptil"));
        petRegister.addPet(new Pet(4L, "Piolin", 1, "Ave"));
        petRegister.addPet(new Pet(5L, "Paco", 3, "Perro"));
        petRegister.addPet(new Pet(6L, "Simba", 2, "Gato"));
        System.out.println("--------------------------------------------------");

        // Añadir mascota aleatoria
        petRegister.addRandomPet(petRegister, 4);
        System.out.println("--------------------------------------------------");

        // Lista de mascotas añadidas
        List<Pet> allPets = petRegister.getAllPets();
        System.out.println("Lista de mascotas añadidas:");
        for (Pet pet : allPets) {
            System.out.println(pet.toString());
        }
        System.out.println("--------------------------------------------------");

        // Contar la cantidad total de mascotas registradas
        System.out.println("Cantidad total de mascotas registradas: " + allPets.size());
        System.out.println("--------------------------------------------------");

        // Buscar mascotas por nombre
        List<Pet> petsByName = petRegister.searchByName("Paco");
        for (Pet pet : petsByName) {
            System.out.println(pet);
        }
        System.out.println("--------------------------------------------------");

        // Buscar mascotas por especie
        List<Pet> petsBySpecies = petRegister.searchBySpecies("Gato");
        for (Pet pet : petsBySpecies) {
            System.out.println(pet.toString());
        }

    }
}
