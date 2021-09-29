<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>AT-JAVA</title>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="jumbotron text-center">
    <h1>Tesouro Direto</h1>
    <br>
</div>
<div class="container">
    <div class="container">
        <form action="/tesouroDireto/cadastro" method="get">
            <button type="submit" class="btn btn-info">Incluir</button>
        </form>
    </div>
    <hr>

    <c:if test="${not empty tesouroDireto}">
        <c:if test="${not empty mensagem}">
            <div class="alert alert-success alert-dismissible">
                <a class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>Sucesso!</strong> ${mensagem}
            </div>
        </c:if>


        <h4>Tesouro direto cadastrados: ${tesouroDireto.size()}!!</h4>
        <hr>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>Id</th>
                <th>Nome Do Tesouro Direto</th>
                <th>Valor</th>
                <th>Quantidade</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="tesouro" items="${tesouroDireto}">
                <tr>
                <td>${tesouro.id}</td>
                <td>${tesouro.nome}</td>
                <td>${tesouro.valor}</td>
                <form action="/tesouroDireto/${tesouro.id}/excluir" method="get">
                    <td><button class="btn btn-danger">Excluir</button></td>
                </form>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty tesouroDireto}">
        <h4>Não há Tesouro Direto cadastrado no momento.</h4>
    </c:if>
</div>
</div>
</body>
</html>
