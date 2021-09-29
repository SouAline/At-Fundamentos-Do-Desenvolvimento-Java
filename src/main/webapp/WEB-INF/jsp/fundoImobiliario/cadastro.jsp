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
    <h1>FUNDO IMOBILIARIO</h1>
    <br>
</div>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
            <h3>Cadastro De Fundo Imobiliario</h3>
            <form action="/fundoImobiliario/incluir" method="post">
                <div class="login-form">
                    <div class="form-group">
                        <label>Fundo Imobiliario</label>
                        <input type="text" value="ALZR" class="form-control" placeholder="Nome do ativo" name="nome">
                    </div>

                    <div class="form-group">
                        <label>Empresa</label>
                        <input type="text" value="ALIANZA TRUST RENDA" class="form-control" placeholder="Empresa" name="empresa">
                    </div>

                    <div class="form-group">
                        <label>Valor de Compra</label>
                        <input type="number" value="125,22" step="0.01" class="form-control" placeholder="R$ Compra" name="valor">
                    </div>

                    <div class="form-group">
                        <label>Valor de Dividendo</label>
                        <input type="number" step="0.01" value="0,85" class="form-control" placeholder="R$ Dividendo" name="dividendo">
                    </div>

                    <div class="form-group">
                        <label>Quantidade</label>
                        <input type="number" step="0.01" value="15" class="form-control" placeholder="Digite a quantidade" name="quantidade">
                    </div>
                    <button type="submit" class="btn btn black">Cadastrar</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
