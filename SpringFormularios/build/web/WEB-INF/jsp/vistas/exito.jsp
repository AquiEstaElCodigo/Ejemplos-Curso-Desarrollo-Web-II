<%@taglib prefix="datos" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados formulario</h1>
        
        <ul>
            <li>Nombre: <datos:out value="${nombre}"/> </li>
            <li>Email: <datos:out value="${email}"/></li>
            <li>Edad: <datos:out value="${edad}"/></li>
        </ul>
        
    </body>
</html>
