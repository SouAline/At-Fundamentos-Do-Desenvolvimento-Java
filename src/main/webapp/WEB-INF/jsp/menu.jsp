<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/telaInicial">RANKING</a>
        </div>
        <ul class="nav navbar-nav">
            <c:if test="${not empty user}">
                <li><a href="/usuario/lista">USUARIOS</a></li>
                <li><a href="/cadastro">ACOES</a></li>
                <li><a href="/cadastramento">FUNDO IMOBILIARIO</a></li>
                <li><a href="/cadastrar">TESOURO DIRETO</a></li>
                <li><a href="/ativo/lista">ATIVOS</a></li>
                <li><a href="/simulacao/lista">SIMULACAO</a></li>
                <li><a href="/investidor/lista">INVESTIDOR</a></li>

            </c:if>
        </ul>

        <ul class="nav navbar-nav navbar-right">
            <c:if test="${empty user}">
                <li><a href="/usuario/cadastro"><span class="glyphicon glyphicon-user"></span>CADASTRAR</a></li>
                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> ENTRAR</a></li>
            </c:if>
            <c:if test="${not empty user}">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout, ${user.nome}!!!</a></li>
            </c:if>
        </ul>
    </div>
</nav>
</body>
</html>
