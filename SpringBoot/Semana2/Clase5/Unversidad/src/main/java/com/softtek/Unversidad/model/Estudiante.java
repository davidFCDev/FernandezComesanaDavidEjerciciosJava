package com.softtek.Unversidad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {

    private Integer num_matricula;
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
}
