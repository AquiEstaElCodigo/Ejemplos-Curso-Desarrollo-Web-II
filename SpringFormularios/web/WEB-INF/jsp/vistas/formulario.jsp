
<%@taglib prefix="formulario" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulario</h1>
        
        <formulario:form>
            <formulario:label path="nombre">Nombre:</formulario:label>
            <formulario:input path="nombre"/>
            
            <formulario:label path="email">Email:</formulario:label>
            <formulario:input path="email"/>
            
            <formulario:label path="edad">Edad:</formulario:label>
            <formulario:input path="edad"/>
            <hr>
            <formulario:button>Enviar</formulario:button>
        </formulario:form>
    </body>
</html>
