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

<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
            <div class="login-form">
                <div class="form-group">
                    <label>Cep</label>
                    <input type="text" class="form-control" value="${endereco.cep}" placeholder="XXXXX-XXX" name="cep">
                </div>
                <div>
                    <label>Endereco</label>
                    <input type="text" class="form-control" value="${endereco.logradouro}"
                           placeholder="Digite seu endereco" name="logradouro">
                </div>

                <div class="form-group">
                    <label>Complemento</label>
                    <input type="text" class="form-control" value="${endereco.complemento}"
                           placeholder="Digite complemento" name="complemento">
                </div>

                <div class="form-group">
                    <label>Bairro</label>
                    <input type="text" class="form-control" value="${endereco.bairro}" placeholder="Digite seu bairro"
                           name="bairro">
                </div>

                <div class="form-group">
                    <label>Localidade</label>
                    <input type="text" class="form-control" value="${endereco.localidade}"
                           placeholder="Digite sua localidade" name="localidade">
                </div>

                <div class="form-group">
                    <label>Uf</label>
                    <input type=type="text" class="form-control" value="${endereco.uf}"
                           placeholder="Sigla do seu estado" name="uf">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
