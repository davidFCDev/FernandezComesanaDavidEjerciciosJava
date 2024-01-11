package org.example.ejercicio1.servlets;

import org.example.ejercicio1.logica.Vote;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.example.ejercicio1.logica.Controladora;

@WebServlet(name = "VoteSv", urlPatterns = {"/VoteSv"})
public class VoteSv extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Vote> voteList = control.getVotes();

        Map<String, Long> voteCounter = voteList.stream()
                .collect(Collectors.groupingBy(Vote::getName, Collectors.counting()));
        request.setAttribute("resultados", voteCounter);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String voteName = request.getParameter("vote");

        if (voteName != null) {
            Vote vote = new Vote(voteName);
            System.out.println("Voto recibido: " + voteName);
            control.newVote(vote);

        } else {
            System.out.println("Voto es nulo");
        }

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
