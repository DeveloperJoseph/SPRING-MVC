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
            <title>LISTADO DE ALUMNOS</title>
        </head>
        <body>
            <div class="jumbotron text-center bg-ligth text-dark">
                <h1>LISTADO DE ALUMNOS</h1>
            </div>
            <div class="container">
                <table class="table">
                    <thead>
                        <tr>
                            <td>Codigo</td>
                            <td>Apellidos</td>
                            <td>Nombres</td>
                            <td>Especialidad</td>
                            <td>PROCE</td>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="objAlumno" items="${ListaAlumnos}">
                        <tr>
                            <td>${objAlumno.getIdAlumno()}</td>
                            <td>${objAlumno.getApeAlumno()}</td>
                            <td>${objAlumno.getNomAlumno()}</td>
                            <td>${objAlumno.getIdesp()}</td>
                            <td>${objAlumno.getPROCE()}</td>    
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
