
package org.example.ejercicio2.models;

public class Pet {
    private Long id;
    private String name;
    private int age;
    private String species;

    public Pet() {
    }

    public Pet(Long id, String name, int age, String species) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + ", age=" + age + ", species=" + species + '}';
    }
    
    
}
