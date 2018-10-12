<%-- 
    Document   : especialidad
    Created on : 12-oct-2018, 15:53:58
    Author     : JOSEPH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="link.jsp"></jsp:include>
            <title>Listado Especialidades</title>
        </head>
        <body>
            <div class="jumbotron text-center text-dark bg-ligth">
                <h1>Listado Especialidades</h1>    
            </div>      
            <div class="container">
                <table class="table table-striped>"
                       <thead>
                        <tr>
                            <td><b>Codigo</b></td>
                            <td><b>Nombre Especialidad</b></td>
                            <td><b>Costo</b></td>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="objEspecialidad" items="${ListaEspecialidad}">
                        <tr>
                            <td>${objEspecialidad.getIdesp()}</td>
                            <td>${objEspecialidad.getNomesp()}</td>
                            <td>${objEspecialidad.getCosto()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
