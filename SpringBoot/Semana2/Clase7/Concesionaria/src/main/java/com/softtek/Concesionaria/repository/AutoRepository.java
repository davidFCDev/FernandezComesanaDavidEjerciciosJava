package com.softtek.Concesionaria.repository;

import com.softtek.Concesionaria.model.Auto;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class AutoRepository {

    public List<Auto> getAutos() {
        List<Auto> autos = Arrays.asList(
                new Auto(1, "Volkswagen", "Golf", "15000", 5, 25000.0),
                new Auto(2, "Chevrolet", "Camaro", "10000", 3, 50000.0),
                new Auto(3, "Ford", "Fiesta", "20000", 5, 20000.0),
                new Auto(4, "Nissan", "Sentra", "30000", 4, 30000.0),
                new Auto(5, "Toyota", "Corolla", "40000", 4, 35000.0)
        );
        return autos;
    }
}
