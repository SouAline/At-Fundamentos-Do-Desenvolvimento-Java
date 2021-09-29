<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <h1>Lista usuarios</h1>
    <br>
    <br>

    <c:if test="${not empty mensagem}">
        <div class="alert alert-success alert-dismissible">
            <a class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>!</strong> ${mensagem}
        </div>
    </c:if>
    <c:if test="${not empty lista}">
        <h4>Quantidade de usuario cadastrados: ${lista.size()}</h4>
        <hr>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Email</th>
                <th>Investidores</th>
                <th>Ativos</th>
                <th>Simulacoes</th>
                <c:if test="${user.admin}">
                <th></th>
            </tr>
            </c:if>
            </thead>
            <tbody>
            <c:forEach var="u" items="${lista}">
                <tr>
                    <td>${u.id}</td>
                    <td>${u.nome}</td>
                    <td>${u.email}</td>
                    <td>${u.investidores.size()}</td>
                    <td>${u.ativos.size()}</td>
                    <td>${u.simulacoes.size()}</td>
                    <c:if test="${user.admin}">
                        <td>
                            <c:choose>
                                <c:when test="${user.id != u.id}">
                                    <a href="/usuario/${u.id}/excluir">Excluir</a>
                                </c:when>
                            </c:choose>
                        </td>
                    </c:if>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty lista}">
        <h4>Não existem usuarios cadastradas ate o momento</h4>
    </c:if>
</div>
</div>
</div>
</div>
</body>
</html>