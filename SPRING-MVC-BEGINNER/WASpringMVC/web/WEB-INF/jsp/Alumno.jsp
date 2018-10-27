<%-- 
    Document   : Alumno
    Created on : 12-oct-2018, 14:08:35
    Author     : JOSEPH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="link.jsp"></jsp:include>
            <title>MANTENIMIENTO DE ALUMNOS</title>
        </head>
        <body>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="#">THE SOFTMAN</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" 
                        data-target="#navbarNav" aria-controls="navbarNav"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                </div>
            </nav>
            <div class="card">
                <div class="jumbotron text-center bg-ligth text-dark">
                    <h1>LISTADO DE ALUMNOS</h1>
                </div>
                <div class="card-body">
                    <button type="button" data-toggle="modal" class="btn btn-success" >
                        AGREGAR ALUMNO
                    </button>
                    <br/>
                    <br/>
                    <table class="table table-striped table-bordered table-sm "
                           id="tablaAlumnos">
                        <thead class="text-center">
                            <tr>
                                <th scope="col">Alumno ID</th>
                                <th scope="col">Apellidos</th>
                                <th scope="col">Nombres</th>
                                <th scope="col">Nombre Especialidad</th>
                                <th scope="col">Especialidad ID</th>
                                <th scope="col">Procedencia</th>
                                <th scope="col">Editar</th>
                                <th scope="col">Eliminar</th>
                            </tr>
                        </thead>
                        <tbody class="text-center">
                        <c:forEach var="objAlumno" items="${ListaAlumnos}">
                            <tr>
                                <td>${objAlumno.getIdAlumno()}</td>
                                <td>${objAlumno.getApeAlumno()}</td>
                                <td>${objAlumno.getNomAlumno()}</td>
                                <td>${objAlumno.getNomesp()}</td>
                                <td>${objAlumno.getIdesp()}</td>
                                <td>${objAlumno.getPROCE()}</td>    
                                <td>
                                    <button type="button" class="btn btn-primary">EDITAR</button>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-danger">ELIMINAR</button>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
