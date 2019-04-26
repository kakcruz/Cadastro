package com.agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;

@WebServlet("/busca-contato")
public class ListarContatoServlet extends HttpServlet {
	
	private CadastraUsuarioService service;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		service = new CadastraUsuarioService();
		
		this.service = new CadastraUsuarioService();
		
		List<Pessoa> contatos = service.buscaPessoas();
		
		request.setAttribute("contato", contatos);
		
		request.getRequestDispatcher("listar_contato.jsp")
		.forward(request, response);
		
		
	}
}
