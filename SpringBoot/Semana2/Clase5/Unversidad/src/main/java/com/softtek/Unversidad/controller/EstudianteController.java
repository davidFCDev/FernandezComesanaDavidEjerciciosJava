package com.softtek.Unversidad.controller;

import com.softtek.Unversidad.dto.EstudianteDTO;
import com.softtek.Unversidad.service.EstudianteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {

    private EstudianteService estudianteService = new EstudianteService();

    @GetMapping("/estudiantes")
    public List<EstudianteDTO> obtenerEstudiantes() {
        return estudianteService.obtenerEstudiantes();
    }

    @GetMapping("/calificaciones/{num_matricula}")
    public EstudianteDTO obtenerEstudiantePorMatricula(@PathVariable Integer num_matricula) {
        return estudianteService.obtenerEstudiantePorMatricula(num_matricula);
    }

    @GetMapping("/calificaciones/ordendesc")
    public List<EstudianteDTO> obtenerEstudiantesOrdenados() {
        return estudianteService.obtenerEstudiantesPorMediaDescendente();
    }
}
