package com.softtek.Unversidad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calificacion {

    private Integer id;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
    private Estudiante estudiante;

}
