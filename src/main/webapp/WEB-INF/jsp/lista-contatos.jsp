<%-- 
    Document   : lista-contatos
    Created on : Jun 26, 2018, 9:05:05 AM
    Author     : luis.silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

        <c:import url="cabecalho.jsp" />
        
        <a href="mvc?logica=AdicionaContatoLogic">Adicionar Cadastro</a>
        
        <!--cria o DAO-->
        <table>
            <!-- percorre contatos montando as linhas da tabela -->
            <c:forEach	var="pessoa" items="${pessoas}">
                <tr>
                    <td>${pessoa.nome}</td>
                    <td>
                        <c:if test="${not empty	pessoa.email}">
                            <a href="mailto:${pessoa.email}">${pessoa.email}</a>
                        </c:if>

                        <c:if test="${empty pessoa.email}">
                            E-mail não informado
                        </c:if>

                    </td>
                    <td>${pessoa.endereco}</td>

                    <td><fmt:formatDate value="${pessoa.dataNascimento}" 
                                    pattern="dd/MM/yyyy" /></td>
                    <td>
                        <a href="mvc?logica=RemoveContatoLogic&id=${pessoa.id}">Remover</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <c:import url="rodape.jsp" />
    </body>

</html>
