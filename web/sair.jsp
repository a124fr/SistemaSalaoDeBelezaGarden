<%-- 
    Document   : sair
    Created on : 22/12/2020, 00:25:26
    Author     : Francisco de Assis de Oliveira Silva
--%>

<%
    session.removeAttribute("funcionario_logado");
    response.sendRedirect("login.jsp");
%>