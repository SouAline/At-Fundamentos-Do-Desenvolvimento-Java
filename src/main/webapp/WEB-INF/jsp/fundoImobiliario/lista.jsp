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
    <h1>Fundo Imobiliario</h1>
    <br>
</div>
<div class="container">
    <div class="container">
        <form action="/fundoImobiliario/lista" method="get">
            <button type="submit" class="btn btn-info">Incluir</button>
        </form>
    </div>
    <hr>

    <c:if test="${not empty fundoImobiliario}">
        <c:if test="${not empty mensagem}">
            <div class="alert alert-success alert-dismissible"><!--//mensagem via alerta-->
                <a class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>Sucesso!</strong> ${mensagem}
            </div>
        </c:if>


        <h4>FII cadastrados: ${fundoImobiliario.size()}!!</h4>
        <hr>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>Id</th>
                <th>Nome Do Fundo Imobiliario</th>
                <th>Valor</th>
                <th>Quantidade</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="fundo" items="${fundoImobiliario}">
                <tr>
                <td>${fundo.id}</td>
                <td>${fundo.nome}</td>
                <td>${fundo.valor}</td>
                <td>${fundo.quantidade}</td>
                <form action="/fundoImobiliario/${fundo.id}/excluir" method="get">
                    <td><button class="btn btn-danger">Excluir</button></td>
                </form>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty fundoImobiliario}">
        <h4>Não há Fundo Imobiliario cadastrado no momento.</h4>
    </c:if>
</div>
</div>
</body>
</html>
