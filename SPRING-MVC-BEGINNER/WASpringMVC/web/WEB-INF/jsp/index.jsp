<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--INCLUIMOS NUESTROS ENLACES BOOTSTRAP 4--%>
        <jsp:include page="link.jsp"></jsp:include>
            <title>Welcome to Spring Web MVC project</title>
        <%--NUESTRO SCRIPT jQuery QYE NOS PERMITE FILTRAR EN NUESRTO TBODY--%>
        <script>
            //Carga completa de nuestro documento HTML
            $(document).ready(function () {
                //capturamos id de nuestra etiqueta <input> y iniciamos un funcion
                $("#myInput").on("keyup", function () {
                    //capturamos el valor del <input> y convertimos a minusculas
                    var valorInput = $(this).val().toLowerCase();
                    //capturamos id de nuestra etiqueta <tbody> y iniciamos un funcion filter
                    $("#myTableBody tr").filter(function () {
                        //obtenemos valor (this) y iniciamos un metodo .toggle()
                        //capturamos valores de nuestro <tbody> y el texto lo convertimos
                        //a minusculas y lo indexamos(buscar) con nuestro valor obtenido
                        //anteriormente de nuestro <input> = valorInput y sea mayor -1
                        $(this).toggle($(this).text().toLowerCase().indexOf(valorInput) > -1);
                    });
                });
            });
        </script>
    </head>
    <%--CABECERA DE NUESTRO CUERPO HTML--%>
    <body class="bg-dark">
        <div class="jumbotron text-dark  text-center bg-ligth">
            <h1>LISTA DE CURSOS</h1>
        </div>
        <div class="container">
            <center>
                <input id="myInput" type="text" class="form-control text-center w-50"
                       placeholder="Buscar por código, nombre de curso o credito ...">
            </center>
            <br>
            <table class="table table-dark table-striped">
                <thead>
                    <tr>
                        <th>Codigo</th>
                        <th>Nombre de Curso</th>
                        <th>Credito</th>
                    </tr>
                </thead>
                <tbody id="myTableBody">
                    <c:forEach var="objCurso" items="${ListadoCursos}">
                        <tr>
                            <td>${objCurso.getIdCurso()}</td>
                            <td>${objCurso.getNomCurso()}</td>
                            <td>${objCurso.getCredito()}</td>
                        </tr>
                    </c:forEach>         
                </tbody>
            </table>
        </div>
    </body>
</html>