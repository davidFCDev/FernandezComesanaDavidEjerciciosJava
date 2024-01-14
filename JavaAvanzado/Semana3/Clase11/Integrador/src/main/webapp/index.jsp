
<%@page import="org.example.integrador.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page import="org.example.integrador.logica.ControladoraEquipo"%>
<%@page import="org.example.integrador.logica.Equipo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Formularios Baloncesto</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body class="row justify-content-between container mt-4 ml-4">

        <div class="col-6 col-sm-5">

            <%-- Formulario Equipo --%>
            <h2>Añadir Equipo</h2>
            <form action="EquipoSv" method="post">
                <div class="form-group">
                    <label for="nombreEquipo">Nombre del equipo</label>
                    <input type="text" class="form-control" id="nombreEquipo" name="nombreEquipo" >
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>

            <br>
            <br>

            <%-- Formulario Partido --%>
            <h2>Añadir Partido</h2>
            <form action="PartidoSv" method="post">

                <div class="row justify-content-between">
                    <div class="form-group col-6 col-sm-6">
                        <label for="equipoLocal">Local</label>
                        <select class="form-control" id="equipoLocal" name="equipoLocal">
                            <option value="">Selecciona equipo</option>
                            <% ControladoraEquipo cea = new ControladoraEquipo();
                                List<Equipo> equiposL = new ArrayList<>(cea.traerEquipos());
                                for (Equipo eq : equiposL) {
                            %>
                            <option value="<%=eq.getId()%>"><%=eq.getNombre()%></option>
                            <% } %>
                        </select>
                    </div>


                    <div class="form-group col-6 col-sm-6">
                        <label for="equipoVisitante">Visitante</label>
                        <select class="form-control" id="equipoVisitante" name="equipoVisitante">
                            <option value="">Selecciona equipo</option>
                            <% ControladoraEquipo ceb = new ControladoraEquipo();
                                List<Equipo> equiposV = new ArrayList<>(ceb.traerEquipos());
                                for (Equipo eq : equiposV) {
                            %>
                            <option value="<%=eq.getId()%>"><%=eq.getNombre()%></option>
                            <%}%>
                        </select>
                    </div>
                </div> 

                <div class="row justify-content-between">
                    <div class="form-group col-6 col-sm-6">
                        <label for="fecha">Fecha:</label>
                        <input type="date" class="form-control" id="fecha" name="fecha" >
                    </div>

                    <div class="form-group col-6 col-sm-6">

                        <div class="row justify-content-between text-center">
                            <div class="form-group col-6 col-sm-5">
                                <label for="resultadoLocal">Local:</label>
                                <input type="number" class="form-control" id="resultadoLocal" name="resultadoLocal">
                            </div>
                            <p class="col-1">-</p>
                            <div class="form-group col-6 col-sm-5">
                                <label for="resultadoVisitante">Visit.:</label>
                                <input type="number" class="form-control" id="resultadoVisitante" name="resultadoVisitante">
                            </div>
                        </div>
                    </div>
                </div>

                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
            <%-- Fin Formulario Partido --%>
        </div>

        <%-- Resultados --%>
        <div class="results-table">
            <h2>Resultados</h2>
            <br>
            <form action ="PartidoSv" method="GET">
                <button type="submit" class="btn btn-primary">Mostrar </button>            
            </form>
            <br>
            <% if (request.getAttribute("partidos") != null) { %>
            <div class="table-responsive">
                <table class="table table-bordered table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>Fecha</th>
                            <th>Local</th>
                            <th>Visitante</th>
                            <th>Resultado</th>
                        </tr>
                    </thead>  
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("partidos")) {%>
                        <tr>
                            <td><%= partido.getFecha()%></td>
                            <td><%= partido.getEquipoLocal().getNombre()%></td>
                            <td><%= partido.getEquipoVisitante().getNombre()%></td>
                            <td><%= partido.getResultadoLocal()%> - <%= partido.getResultadoVisitante()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
            <% }%>


        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>