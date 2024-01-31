package com.softtek.Unversidad.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {

    private Integer numero_matricula;
    private String nombre;
    private String apellido;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;

    public EstudianteDTO(Integer numero_matricula, String nombre, String apellido, Double calificacion1, Double calificacion2, Double calificacion3) {
        this.numero_matricula = numero_matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;

        calcularPromedio();
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }


}
