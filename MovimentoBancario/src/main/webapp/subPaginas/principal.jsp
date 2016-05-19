<%-- 
    Document   : principal
    Created on : 13/05/2016, 19:28:53
    Author     : Thayro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/botoes.css" type= "text/css">
        <link rel="stylesheet" href="./css/principal.css" type= "text/css">
        <title>Movimento Bancário</title>
    </head>
    <body>
        <form method="POST" action="ServletMovimento">
            <table width="641" border="0" align="center">
                <tr>
                    <td colspan="2"><div align="center"><img src="./img/logobankonline.png" width="710" height="181"></div></td>
                </tr>
                <tr>
                    <td width="200"><div align="right">Nº Conta</div></td>
                    <td width="338"><input type="text" id="nconta" name="nconta" required="required" value="<c:out value="${conta.nConta}" />"></td>
                </tr>
                <tr>
                    <td><div align="right">Valor</div></td>
                    <td><input type="text" id="valor" name="valor" required="required" value="<c:out value="${conta.valor}" />"></td>
                </tr>
                <tr align="center">
                    <td colspan="2"><br><br>
                        <input class="depositar" type="submit" value="depositar" id="depositar" name="depositar">
                        <input class="sacar"     type="submit" value="sacar"     id="sacar"     name="sacar">
                        <input class="consultar" type="submit" value="consultar" id="consultar" name="consultar">
                    </td>
                </tr>
            </table>
        </form>            
        <p><br><table width="800" align="center">
            <nav>
                <tr class="menu">
                    <td><iframe class="iframePrincipal" name= "iframePrincipal" id= "iframePrincipal" width="900" height="750" src="subPaginas/home.jsp" frameborder="0"></iframe></td>
                </tr>
            </nav>
        </table>

    </body>
</html>
