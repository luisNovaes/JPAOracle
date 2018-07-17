<%-- 
    Document   : digita-idade
    Created on : Jun 26, 2018, 8:40:17 AM
    Author     : luis.silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        Digite sua idade e pressione o botão:<br/>

        <form action="mostra-idade.jsp">

            Idade: <input type="text" 
                          name="idade"/> 

            <input type="submit"/>

        </form>
    </body>

</html>
