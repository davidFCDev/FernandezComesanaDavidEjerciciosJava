package com.softtek.Concesionaria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Auto {

    private Integer id;
    private String brand;
    private String model;
    private String kilometers;
    private int doors;
    private Double price;

}
