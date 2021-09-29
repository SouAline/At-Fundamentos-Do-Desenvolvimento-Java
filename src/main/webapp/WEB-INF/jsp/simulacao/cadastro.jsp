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
<div class="jumbotron text-center">
    <h1>SIMULACAO</h1>
</div>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
            <h3>Cadastro De simulacao</h3>
            <form action="/simulacao/cadastrar" method="post">
                <div class="login-form">
                    <div class="form-group">
                        <c:if test="${not empty ativos}">
                        <label>Investidor</label>
                        <select class="form-control" name="investidor.id">
                            <c:forEach var="inv" items="${ativos}">
                                <option value="${inv.id}">${inv.nome}</option>
                            </c:forEach>
                        </select>
                        </c:if>
                        <c:if test="${empty investidores}">
                            <c:set var="button" value="disabled"/>
                        <label>Investidor: não existem registros cadastrados.</label>
                        </c:if>
                    </div>

                    <div class="form-group">
                        <label>Descrição</label>
                        <input type="text" value="investimento iniciante" class="form-control" placeholder="Tipo Investimento" name="descricao">
                    </div>

                        <div class="form-group">
                            <c:if test="${not empty investidores}">
                                <label>Ativos</label>
                                <c:forEach var="invest" items="${investidores}">
                                    <div class="form-check">
                                        <label class="form-check-label">
                                            <input name="ativosId" type="checkbox" checked="checked"
                                                   value="${invest.id}"> ${invest.nome}
                                        </label>
                                    </div>
                                </c:forEach>

                            </c:if>
                            <c:if test="${empty ativos}">

                                <label>Não existem registros cadastrados!!!</label>
                            </c:if>
                        </div>

                        <button type="submit" class="btn btn-default">Cadastrar</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    </div>
</div>
</body>
</html>
