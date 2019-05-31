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

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CadastraUsuarioService service = new CadastraUsuarioService();
		
		request.setCharacterEncoding("UTF-8");

		Pessoa pessoa = new Pessoa();

		

	
		pessoa.setNome(request.getParameter("name"));

		
		pessoa.setTelefone(request.getParameter("telefone"));

	
		pessoa.setEmail(request.getParameter("email"));


		pessoa.setEndereco(request.getParameter("endereco"));
		
		pessoa.setSenha(request.getParameter("senha"));

		

		if(null != request.getParameter("id") && !request.getParameter("id").equals("") )
				{ pessoa.setId(Long.parseLong(request.getParameter("id")));
	}
				
				service.cadastraOuAlterar(pessoa);

			response.sendRedirect("busca-contato");


	}
}
