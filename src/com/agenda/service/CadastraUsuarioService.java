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
		
	
   public void adiciona(Pessoa pessoa){   
	   this.dao.cadastra(pessoa);	   
   }
	
   
   public List<Pessoa> buscaPessoas(){
	   return this.dao.buscarPessoas();
   }
   
   public void apagarContato(Pessoa pessoa) {
	   this.dao.apagarContato(pessoa);
   }

}