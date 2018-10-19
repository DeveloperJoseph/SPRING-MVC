<%-- 
    Document   : home
    Created on : 29-sep-2018, 2:13:57
    Author     : JOSEPH
--%>
<%--INCLUIMOS NUESTRAS ETIQUETAs taglib PRFIX = SPRING Y VALUE(URL)
ESTE NOS PERMITE INCLUIR ETIQUETAS NATIVAS DE SPRING FRAMEWORK--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--INCLUIMOS NUESTRAS ETIQUETAS SPRING:URL CON SU VAR(NOMBRE VARIABLE) Y VALUE(URL)--%>
        <spring:url var="BootStrapJS" value="/Recursos/Scripts/Bootstrap/bootstrap.js"></spring:url>
        <spring:url var="BootStrapCSS" value="/Recursos/Content/Bootstrap/bootstrap.css"></spring:url>
        <spring:url var="JQueryJS"  value="/Recursos/Scripts/Jquery/jquery-1.12.4.js"></spring:url>
        <%--INCLUIMOS NUESTRAS ETIQUETAS SPRING:URL EN UN HREF A NUESTRO CARPETA RECURSOS--%>
        <link href="${BootStrapCSS}" rel="stylesheet" type="text/css"/>
        <script src="${BootStrapJS}" type="text/javascript"></script>
        <script src="${JqueryJs}" type="text/javascript"></script>
        
        <title>Welcome to Spring Web MVC project - HOME</title>
    </head>
    <%--CABECERA DE NUESTRO CUERPO HTML--%>
    <body class="text-white bg-dark text-center">
        <div class="jumbotron text-white bg-success">
            <h1>HELLO WORLD SPRING MVC - HOME</h1>
        </div>
        <%--DIV CONTAINER--%>
        <div class="container">
            <%--DIV ROW PARA NUESTRA RESPECTIVAS COLUMNAS--%>
            <div class="row">
                <%-- 1 DIV col-sm-4 es nuestra primera columna en nuestro pagina jsp--%>
                <div class="col-sm-4">
                    <h3>Columna 1</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
                    <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
                </div>
                <%-- 2 DIV col-sm-4 es nuestra primera columna en nuestro pagina jsp--%>
                <div class="col-sm-4">
                    <h3>Columna 2</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
                    <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
                </div>
                <%-- 3 DIV col-sm-4 es nuestra primera columna en nuestro pagina jsp--%>
                <div class="col-sm-4">
                    <h3>Columna 3</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
                    <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
                </div>
            </div>
        </div>
    </body>
</html>
