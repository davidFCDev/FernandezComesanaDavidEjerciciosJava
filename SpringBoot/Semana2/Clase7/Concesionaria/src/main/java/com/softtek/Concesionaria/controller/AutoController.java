package com.softtek.Concesionaria.controller;

import com.softtek.Concesionaria.model.Auto;
import com.softtek.Concesionaria.service.IAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class AutoController {

    @Autowired
    IAutoService autoService;

    @PostMapping("/vehicles")
    public String createAuto(@RequestBody Auto auto) {
        autoService.newAuto(auto);
        return "Added auto " + auto.getBrand() + " " + auto.getModel() + " with id " + auto.getId() + " successfully!";
    }

    @GetMapping("/vehicles")
    public List<Auto> getAutos() {
        return autoService.getAutos();
    }

    @GetMapping("/vehicles/price")
    public List<Auto> getAutosOrderByPrice() {
        return autoService.getAutosOrderByPrice();
    }

    @GetMapping("/vehicles/{id}")
    public Auto getAutoById(@PathVariable Integer id) {
        return autoService.getAutoById(id);
    }
}
