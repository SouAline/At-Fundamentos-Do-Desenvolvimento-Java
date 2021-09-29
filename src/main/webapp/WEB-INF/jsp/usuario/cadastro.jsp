<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
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
    <h1>CADASTRO DE USUARIO</h1>
    <br>
</div>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
            <h3>Cadastro</h3>
            <form action="/buscarCep" method="post">
                <div class="row">
                    <input type="text" class="form-control" placeholder="Cep" name="cep">
                    <br>
                    <button type="submit" class="btn btn-primary">Buscar</button>
                </div>
            </form>
            <hr>
            <c:import url="/WEB-INF/jsp/endereco.jsp"/>
            <form action="/usuario/cadastro" method="post">
                <div class="login-form">
                    <div class="form-group">
                        <label>Nome</label>
                        <input type="text" class="form-control" value="Aline Souza" placeholder="Digite seu nome"
                               name="nome">
                    </div>

                    <div class="form-group">
                        <label>E-mail</label>
                        <input type="email" class="form-control" value="ds.alinesouza@gmail.com"
                               placeholder="Digite seu e-mail" name="email">
                    </div>

                    <div class="form-group">
                        <label>Senha</label>
                        <input type="password" class="form-control" value="123" placeholder="Digite sua senha"
                               name="senha">
                    </div>

                    <button type="submit" class="btn btn black">Cadastrar</button>
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>

