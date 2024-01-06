package org.example.ejercicio2.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PetRegister<T extends Pet> {

    private List<T> pets;

    public PetRegister() {
        this.pets = new ArrayList<>();
    }

    public void addPet(T pet) {
        pets.add(pet);
        System.out.println("Mascota añadida: " + pet.getName());
    }

    public List<T> getAllPets() {
        return new ArrayList<>(pets);
    }
    
    public List<T> searchByName(String name) {
        List<T> results = new ArrayList<>();
        System.out.println("Resultado de la búsqueda por nombre " + name + ":");
        for (T pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                results.add(pet);
            }
        }
        return results;
    }

    public List<T> searchBySpecies(String species) {
        List<T> results = new ArrayList<>();
        System.out.println("Resultado de la búsqueda por especie " + species + ":");
        for (T pet : pets) {
            if (pet.getSpecies().equalsIgnoreCase(species)) {
                results.add(pet);
            }
        }
        return results;
    }
    
    public void addRandomPet(PetRegister<Pet> petRegister, int numberOfPets) {
        Random random = new Random();
        List<String> speciesList = List.of("Perro", "Gato", "Reptil", "Ave");
        List<String> namesList = List.of("Pou", "Pichu", "Rayo", "Luna");
        
        for (int i = 0; i < numberOfPets; i++) {
            String randomName = namesList.get(random.nextInt(namesList.size()));
            int randomAge = random.nextInt(10) + 1;
            String randomSpecies = speciesList.get(random.nextInt(speciesList.size()));

            Pet randomPet = new Pet(i + 7L, randomName, randomAge, randomSpecies);
            petRegister.addPet(randomPet);
        }
    }

}
