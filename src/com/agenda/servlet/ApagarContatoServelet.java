package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;

@WebServlet ("/apagar-contato")
public class ApagarContatoServelet extends HttpServlet{
	
  @Override
  protected void service (HttpServletRequest request, HttpServletResponse resp)
         throws ServletException, IOException {
	  
	  CadastraUsuarioService service = new CadastraUsuarioService();
	  
	  long id = Long.parseLong(request.getParameter("id"));
	  
	  Pessoa pessoa = new Pessoa();
	  pessoa.setId(id);
	  
	  service.apagarContato(pessoa);
	
	  resp.sendRedirect("busca-contato");
	  
  }
	
}
