package com.softtek.MenuRestaurante.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {

    private Integer codigo_ingrediente;
    private String nombre;
    private Integer cantidad_calorias;
}
