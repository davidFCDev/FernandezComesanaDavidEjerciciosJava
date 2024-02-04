package com.softtek.Concesionaria.service;

import com.softtek.Concesionaria.model.Auto;
import com.softtek.Concesionaria.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoService implements IAutoService {

    @Autowired
    AutoRepository autoRepository;

    @Override
    public List<Auto> getAutos() {
        return autoRepository.getAutos();
    }

    @Override
    public Auto getAutoById(Integer id) {
        return autoRepository.getAutos().stream().filter(auto -> auto.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Auto newAuto(Auto auto) {
        List<Auto> newAutos = new ArrayList<>();
        newAutos.add(auto);
        return auto;
    }

    @Override
    public List<Auto> getAutosOrderByPrice() {
        List<Auto> autos = autoRepository.getAutos();
        autos.sort((auto1, auto2) -> auto1.getPrice().compareTo(auto2.getPrice()));
        return autos;
    }
}
