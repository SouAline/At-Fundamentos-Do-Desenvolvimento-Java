<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <h1>ASSESMENT JAVA WEB</h1>
    <ul class="list-group">
        <c:forEach var="mapa" items="${totalizacao}">
            <li class="list-group-item">${mapa.key}<span class="badge">${mapa.value}</span></li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
