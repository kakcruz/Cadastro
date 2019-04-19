package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {
	
	public static void cadastra (Pessoa pessoa) {
		
    PessoaDAO ligacao = new PessoaDAO();
    ligacao.cadastra(pessoa);
    
	}
	
	public CadastraUsuarioService() {
		this.dao = new PessoaDAO();
	}

	private PessoaDAO dao;
		
	
   public void adicona(Pessoa pessoa){
	   
	   this.dao.adiciona(pessoa);
	   
	   System.out.println(buscaPessoa());
   }
	
	
	
	
	
   public List<Pessoa> buscaPessoa(){
	   
	   PessoaDAO dao = new PessoaDAO();
	   
	   return dao.buscaPessoa();
   }


}