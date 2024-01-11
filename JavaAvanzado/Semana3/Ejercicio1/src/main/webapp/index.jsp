<%@page import="java.util.Objects"%>
<%@page import="org.example.ejercicio1.logica.Vote"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Votación de Partidos</title>
        <link rel="stylesheet" href="styles/styles.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-4">
            <h2>Votación</h2>
            <p>Elija su voto:</p>
            <form action="VoteSv" method="post">
                <input type="radio" id="partido-a" name="vote" value="Peperos" />
                <label for="partido-a">Peperos</label><br />
                <input type="radio" id="partido-b" name="vote" value="Socialistas" />
                <label for="partido-b">Socialistas</label><br />
                <input type="radio" id="partido-c" name="vote" value="Pacma" />
                <label for="partido-c">Pacma</label><br />
                <button class="btn btn-primary" type="submit">Votar</button>
            </form>

            <br />

            <form action="VoteSv" method="get">
                <button class="btn btn-success" type="submit">Ver Resultados</button>
            </form>

            <br />
            <br />

            <div class="results-table" >
                <% if (request.getAttribute("resultados") != null) {
                        Map<String, Long> resultados = (Map<String, Long>) request.getAttribute("resultados");
                %>
                <h3>Resultados:</h3>
                <br />
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre Partido</th>
                            <th>Cantidad de Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Map.Entry<String, Long> entry : resultados.entrySet()) {%>
                        <tr>
                            <td><%= entry.getKey()%></td>
                            <td><%= entry.getValue()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>
        </div>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
