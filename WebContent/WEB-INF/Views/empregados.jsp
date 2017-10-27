<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista de Empregados</title>
 
	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>
 
</head>
 
 
<body>
	<h2>Empregados</h2>	
	<table>
		<tr>
			<td>Nome</td><td>Data de Admissão</td><td>Salário</td><td>Matrícula</td>
		</tr>
		<c:forEach items="${empregados}" var="empregado">
			<tr>
			<td>${empregado.nome}</td>
			<td>${empregado.dataAdmissao}</td>
			<td>${empregado.salario}</td>
			<td><a href="<c:url value='/delete/${empregado.matricula}/empregado' />">${empregado.matricula}</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/new' />">Novo Empregado</a>
</body>
</html>