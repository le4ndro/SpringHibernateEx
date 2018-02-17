<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Empregado</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Registration Form</h2>

	<form:form method="POST" modelAttribute="empregado">
		<table>
			<tr>
				<td><label for="nome">Nome: </label> </td>
				<td><form:input path="nome" id="nome"/></td>
				<td><form:errors path="nome" cssClass="error"/></td>
		    </tr>

			<tr>
				<td><label for="dataAdmissao">Data de Admissão: </label> </td>
				<td><form:input path="dataAdmissao" id="dataAdmissao"/></td>
				<td><form:errors path="dataAdmissao" cssClass="error"/></td>
		    </tr>

			<tr>
				<td><label for="salario">Salário: </label> </td>
				<td><form:input path="salario" id="salario"/></td>
				<td><form:errors path="salario" cssClass="error"/></td>
		    </tr>

			<tr>
				<td><label for="matricula">Matrícula: </label> </td>
				<td><form:input path="matricula" id="matricula"/></td>
				<td><form:errors path="matricula" cssClass="error"/></td>
		    </tr>

			<tr>
				<td colspan="3"><input type="submit" value="Gravar"/></td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Voltar para a <a href="<c:url value='/list' />">Lista de Empregados</a>
</body>
</html>
