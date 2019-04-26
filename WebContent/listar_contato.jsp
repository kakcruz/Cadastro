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
	<a class="navbar-brand" href="#"><h2>Lista de Cadastros</h2></a>
</nav>

</head>


<body>
      <table class="table table-bordered">
		<thead class="thead-dark">
			<tr>
				<th scope="col"></th>
				<th scope="col">Nome</th>
				<th scope="col">E-mail</th>
				<th scope="col">Endereço</th>
				<th scope="col">Telefone</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach var="pessoa" items="${contatos}">
			<tr>
				<th scope="row">1</th>
				<td>$(pessoa.nome)</td>
				<td>$(pessoa.email)</td>
				<td>$(pessoa.endereco)</td>
				<td>$(pessoa.telefone)</td>
			</tr>
		</c:forEach>
			
		</tbody>
	</table>

	<center><div class="form-group col-md-6">
		<a class="btn btn-primary" href="index.html">Voltar a pagina inicial</a>
	</div></center>


</body>
</html>