<%@page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>AT-JAVA</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="jumbotron text-center">
    <h1>Acoes</h1>
<br>
</div>
<div class="container">
    <div class="container">
        <form action="/acao/cadastro" method="get">
            <button type="submit" class="btn btn-info">Incluir</button>
        </form>
    </div>

    <c:if test="${not empty acoes}">
        <c:if test="${not empty mensagem}">
            <div class="alert alert-success alert-dismissible"><!--//mensagem via alerta-->
                <a class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>Sucesso!</strong> ${mensagem}
            </div>
        </c:if>


        <h4>Ações cadastradas: ${acoes.size()}!!</h4>
        <hr>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>Id</th>
                <th>Nome Do Ativo</th>
                <th>Valor</th>
                <th>Quantidade</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="ac" items="${acoes}">
                <tr>
                <td>${ac.id}</td>
                <td>${ac.nome}</td>
                <td>${ac.valor}</td>
                <td>${ac.quantidade}</td>
                <form action="/acao/${ac.id}/excluir" method="get">
                <td><button class="btn btn-danger">Excluir</button></td>
                </form>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty acoes}">
        <h4>Não há ações cadastrados no momento.</h4>
    </c:if>
</div>
</div>
</body>
</html>


