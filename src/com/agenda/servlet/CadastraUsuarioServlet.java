package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;

public class CadastraUsuarioServlet extends HttpServlet {
	@Override
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pessoa pessoa = new Pessoa();
		
		request.getParameter("name");
		pessoa.setNome(request.getParameter("name"));
		
		request.getParameter("telefone");
		pessoa.setTelefone(request.getParameter("telefone"));
		
		request.getParameter("email");
		pessoa.setEmail(request.getParameter("email"));
		
		request.getParameter("endereco");
		pessoa.setEndereco(request.getParameter("endereco"));
		
		CadastraUsuarioService service = new CadastraUsuarioService();
		
		service.cadastra(pessoa);
		
		
	}

}
