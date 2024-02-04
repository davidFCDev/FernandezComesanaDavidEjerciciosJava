package com.softtek.Concesionaria.service;

import com.softtek.Concesionaria.model.Auto;

import java.util.List;

public interface IAutoService {

    public List<Auto> getAutos();
    public Auto getAutoById(Integer id);
    public Auto newAuto(Auto auto);
    public List<Auto> getAutosOrderByPrice();
}
