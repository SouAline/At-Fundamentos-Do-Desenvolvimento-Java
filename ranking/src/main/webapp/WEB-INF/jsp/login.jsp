<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

    <title>Login</title>

</head>
<body>
<div class="sidenav">
    <div class="login-main-text">
        <h3>Autenticação</h3>
        <form action= "/login" method="post">

    <div class="main">
        <div class="col-md-6 col-sm-12">
            <div class="login-form">
                    <div class="form-group">
                        <label>E-mail</label>
                        <input type="text" class="form-control" placeholder="Digite seu e-mail">
                    </div>
                    
                    <div class="form-group">
                        <label>Senha</label>
                        <input type="password" class="form-control" placeholder="Digite sua senha">
                    </div>
                    <button type="submit" class="btn btn black">Entrar</button>
                   
               </div>
       	 </div>
        </div>
        </form>
        </div>
        </div>
    </body>
</html>
