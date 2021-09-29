<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h1>Ativos Cadastrados</h1>
    <br>
</div>
    <c:if test="${not empty mensagem}">
        <div class="alert alert-success alert-dismissible">
            <a class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>!</strong> ${mensagem}
        </div>
    </c:if>
<div class="container" style="margin-top:20px">
    <c:if test="${not empty ativos}">
        <h4>Quantidade de ativos cadastrados: ${ativos.size()}</h4>
        <hr>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>Id</th>
                <th>Ativo</th>
                <th>Valor</th>
                <th>Quantidade</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="atv" items="${ativos}">
                <tr>
                    <td>${atv.id}</td>
                    <td>${atv.nome}</td>
                    <td>${atv.valor}</td>
                    <td>${atv.quantidade}</td>
                    <td><a href="/ativo/${atv.id}/excluir" method="get">Excluir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty ativos}">
        <h4>Não existem ativos cadastrados ate o momento</h4>
    </c:if>
</div>
</div>
</div>
</div>
</body>
</html>

