<%-- 
    Document   : lista-contatos-scriptlet
    Created on : 25/06/2018, 16:40:58
    Author     : luis.silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.*,
         br.com.webservice.dao.*,
         br.com.webservice.model.*" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <%
                PessoaDAO dao = new PessoaDAO();

                List<Pessoa> pessoas = dao.getLista();

                for (Pessoa pessoa : pessoas) {
            %>
            <tr>
                <td><%=pessoa.getNome()%></td> 
                <td><%=pessoa.getEmail()%></td>
                <td><%=pessoa.getEndereco()%></td>
                <td><%=pessoa.getDataNascimento()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
