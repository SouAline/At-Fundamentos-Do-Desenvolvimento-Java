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
    <h1>TESOURO DIRETO</h1>
    <br>
</div>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
            <h3>Cadastro De Tesouro Direto</h3>
            <form action="/tesouroDireto/incluir" method="post">
                <div class="login-form">
                    <div class="form-group">
                        <label>Nome Tesouro Direto</label>
                        <input type="text" value = "NTN-B" class="form-control" placeholder="Nome do tesouro direto" name="nome">
                    </div>

                    <div class="form-group">
                        <label>Valor de Compra</label>
                        <input type="number" class="form-control" placeholder="R$ Compra" name="valor">
                    </div>

                    <label>Tipo</label>
                    <div class="radio">
                        <label><input type="radio" name="tipo" checked>IPCA</label>
                    </div>

                    <div class="radio">
                        <label><input type="radio" name="tipo">SELIC</label>
                    </div>
                    <div class="radio">
                        <label><input type="radio" name="tipo">PRE-FIXADO</label>
                    </div>

                    <div class="form-group">
                        <label>Juros</label>
                        <input type="number" step="0.01" class="form-control" placeholder="% Juros" name="rentabilidadeAnual">
                    </div>

                    <div class="form-group">
                        <label>Data vencimento</label>
                        <input type="data" value = "13/02/2028" class="form-control" name="data">
                    </div>

                    <div class="form-group">
                        <label>Quantidade</label>
                        <input type="text" value = "100" class="form-control" placeholder="Digite a quantidade" name="quantidade">
                    </div>
                    <button type="submit" class="btn btn black">Cadastrar</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
