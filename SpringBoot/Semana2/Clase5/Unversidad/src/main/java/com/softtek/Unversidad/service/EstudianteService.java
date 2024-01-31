package com.softtek.Unversidad.service;

import com.softtek.Unversidad.dto.EstudianteDTO;

import java.util.*;

public class EstudianteService {

    public List<EstudianteDTO> inicializarEstudiantes() {
        List<EstudianteDTO> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new EstudianteDTO(1, "Juan", "Perez", 6.0, 7.0, 8.0));
        listaEstudiantes.add(new EstudianteDTO(2, "Maria", "Lopez", 7.0, 8.0, 9.0));
        listaEstudiantes.add(new EstudianteDTO(3, "Pedro", "Gomez", 5.0, 6.0, 4.0));
        listaEstudiantes.add(new EstudianteDTO(4, "Ana", "Gonzalez", 10.0, 9.0, 8.0));
        listaEstudiantes.add(new EstudianteDTO(5, "Luis", "Rodriguez", 5.0, 8.0, 6.0));
        return listaEstudiantes;
    }

    public List<EstudianteDTO> obtenerEstudiantes() {
        return inicializarEstudiantes();
    }

    public EstudianteDTO obtenerEstudiantePorMatricula(Integer matricula) {
        List<EstudianteDTO> listaEstudiantes = inicializarEstudiantes();
        EstudianteDTO estudiante = null;
        for (EstudianteDTO estudianteDTO : listaEstudiantes) {
            if (Objects.equals(estudianteDTO.getNumero_matricula(), matricula)) {
                estudiante = estudianteDTO;
                break;
            }
        }
        return estudiante;
    }

    public List<EstudianteDTO> obtenerEstudiantesPorMediaDescendente() {
        List<EstudianteDTO> listaEstudiantes = inicializarEstudiantes();

        listaEstudiantes.sort(Comparator.comparing(EstudianteDTO::getPromedio).reversed());

        return listaEstudiantes;
    }

}
