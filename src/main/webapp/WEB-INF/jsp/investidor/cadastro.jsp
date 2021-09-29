<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <h1>INVESTIDOR</h1>
</div>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
            <h3>Cadastro De investidor</h3>
            <form action="/investidor/incluir" method="post">
                <div class="login-form">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" value = "Aline Souza" class="form-control" placeholder="Digite seu nome" name="nome">
                    </div>

                    <div class="form-group">
                        <label>Idade</label>
                        <input type="number" class="form-control" placeholder="Digite sua idade" name="idade">
                    </div>

                    <div class="form-group">
                        <label>E-mail</label>
                        <input type="email" value="aline@aline.com.br" class="form-control" name="email">
                    </div>

                    <button type="submit" class="btn btn black">Cadastrar</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
