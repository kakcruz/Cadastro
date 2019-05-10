<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Cadastro</title>

<link crossorigin="anonymous"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	rel="stylesheet">
	
	


<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
	<a class="navbar-brand" href="busca-contato"><h2>Lista de Cadastros</h2></a>
</nav>

</head>


<body>
      <table class="table table-bordered">
		<thead class="thead-dark">
			<tr>
			    <th>Id</th>
				<th>Nome</th>
				<th>E-mail</th>
				<th>Endereço</th>
				<th>Telefone</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach var="pessoa" items="${contato}">
			<tr>
			    <td>${pessoa.id}</td>
				<td>${pessoa.nome}</td>
				<td>${pessoa.email}</td>
				<td>${pessoa.endereco}</td>
				<td>${pessoa.telefone}</td>
				<td><a class="btn btn-danger" href="apagar-contato?id=${pessoa.id}">Apagar</a></td>
			</tr>
		</c:forEach>
			
		</tbody>
	</table>
	

	<center><div class="form-group col-md-6">
		<a class="btn btn-primary" href="index.html">Voltar a pagina inicial</a>
	</div></center>
	
	<center><div class="form-group col-md-6">
		<a class="btn btn-info" href="adiciona-contato.jsp">Fazer um Cadastro</a>
	</div></center>


</body>
</html>