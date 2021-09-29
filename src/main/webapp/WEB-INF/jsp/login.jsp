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


    <title>AT-Java</title>

</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="jumbotron text-center">
    <h1>LOGIN DE USUARIO</h1>
    <br>
</div>
<div class="container">
    <c:if test="${not empty mensagem}">
        <div class="alert alert-info alert-dismissible">
            <a href="#" class="close" data-dismiss="alert" arial-label="close"></a>
                ${mensagem}
        </div>
    </c:if>
</div>
<div class="container" style="margin-top:20px">
    <div class="row">
        <div class="col-md-4">
        <h3>Autenticação</h3>
        <form action="/login" method="post">
                    <div class="login-form">
                        <div class="form-group">
                            <label>E-mail</label>
                            <input type="text" value = "ds.alinesouza@gmail.com" class="form-control" placeholder="Digite seu e-mail" name="email">
                        </div>

                        <div class="form-group">
                            <label>Senha</label>
                            <input type="password" value = "123" class="form-control" placeholder="Digite sua senha" name="senha">
                            <br>
                            <button type="submit" class="btn btn black">Entrar</button>
                        </div>
                    </div>
        </form>
    </div>
</div>
</div>
</body>
</html>