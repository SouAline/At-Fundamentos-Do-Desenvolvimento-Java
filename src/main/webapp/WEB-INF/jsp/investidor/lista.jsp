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
<br>
<br>

<div class="container">
    <div class="container">
        <form action="/investidor" method="get">
            <br>
            <br>
            <button type="submit" class="btn btn-info">Incluir</button>
        </form>
    </div>


    <c:if test="${not empty investidor}">
    <div class="alert alert-success alert-dismissible">
        <a class="close" data-dismiss="alert" aria-label="close">&times;</a>
        <strong>Sucesso!</strong> ${mensagem}
    </div>
    </c:if>

    <h4>Investidores cadastrados: ${investidor.size()}!!</h4>
    <hr>
    <table class="table">
        <thead class="thead-light">
        <tr>
            <th>Id</th>
            <th>Nome</th>
            <th>E-mail</th>
            <th>Idade</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="invest" items="${investidor}">
            <tr>
                <td>${invest.id}</td>
                <td>${invest.nome}</td>
                <td>${invest.email}</td>
                <td>${invest.idade}</td>
                <form action="/investidor/${invest.id}/excluir" method="get">
                    <td>
                        <button class="btn btn-danger">Excluir</button>
                    </td>
                </form>

                <c:if test="${empty investidor}">
                    <h4>Não há investidores cadastrado no momento.</h4>
                </c:if>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
