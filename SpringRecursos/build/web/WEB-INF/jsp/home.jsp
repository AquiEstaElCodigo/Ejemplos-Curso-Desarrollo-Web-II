

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <!--
        <link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/css/estilos.css">
        -->
        <link rel="stylesheet" href="<d:url value="/recursos/css/estilos.css" />"/>
        <script src="<d:url value="/recursos/js/funciones.js"/>"></script>
       
        <title>miSitio</title>
        
    </head>
    <body>
        <h1>Título del sitio</h1>
        <hr/>
        <button onclick="saludo()">Aceptar</button>
        <hr/>
        <img src="<d:url value="/recursos/imagenes/java.png"/>">
        <hr/>
        <a href="inicio.htm">Ir a inicio</a>
    </body>
</html>
