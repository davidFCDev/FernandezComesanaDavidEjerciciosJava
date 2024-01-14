package org.example.integrador.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.example.integrador.logica.ControladoraEquipo;
import org.example.integrador.logica.ControladoraPartido;
import org.example.integrador.logica.Partido;
import org.example.integrador.logica.Equipo;

@WebServlet(name = "PartidoSv", urlPatterns = {"/PartidoSv"})
public class PartidoSv extends HttpServlet {

    ControladoraEquipo controladoraEquipo = new ControladoraEquipo();
    ControladoraPartido controladoraPartido = new ControladoraPartido();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Partido> partidos = controladoraPartido.traerPartidos();
        request.setAttribute("partidos", partidos);

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            int idLocal = Integer.parseInt(request.getParameter("equipoLocal"));
            int idVisitante = Integer.parseInt(request.getParameter("equipoVisitante"));
            LocalDate fecha = LocalDate.parse(request.getParameter("fecha"));
            int resultadoLocal = Integer.parseInt(request.getParameter("resultadoLocal"));
            int resultadoVisitante = Integer.parseInt(request.getParameter("resultadoVisitante"));

            Partido partido = new Partido();

            partido.setFecha(fecha);
            partido.setResultadoLocal(resultadoLocal);
            partido.setResultadoVisitante(resultadoVisitante);

            Equipo equipoLocal = controladoraEquipo.traerEquipoPorId(idLocal);
            Equipo equipoVisitante = controladoraEquipo.traerEquipoPorId(idVisitante);

            partido.setEquipoLocal(equipoLocal);
            partido.setEquipoVisitante(equipoVisitante);

            controladoraPartido.crearPartido(partido);
            response.sendRedirect("index.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
