<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
    <h1>Seja bem vindo, ${user.nome}</h1>
    <p><p> <a href="https://github.com/SouAline">GitHub</a> </p></p>
</div>



</body>
</html>
