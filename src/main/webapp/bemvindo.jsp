<%-- 
    Document   : bemvindo
    Created on : 25/06/2018, 16:31:00
    Author     : luis.silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <c:import url="/WEB-INF/jsp/cabecalho.jsp" />

    <body>

        <%-- comentário em JSP aqui: nossa primeira página JSP --%>

        <% String mensagem = "Bem vindo ao sistema de agenda do Luis Novaes!"; %>

        <% out.println(mensagem); %>

        <br />

        <% String desenvolvido = "Desenvolvido por (Luis Novaes)";%>      

        <%= desenvolvido%>
        <br />
        <a href="mvc?logica=AdicionaContatoLogic">Adicionar Cadastro</a>

        <br />

        <% System.out.println("Tudo foi executado!");%>

        <c:import url="/WEB-INF/jsp/rodape.jsp" />

    </body>

</html>
