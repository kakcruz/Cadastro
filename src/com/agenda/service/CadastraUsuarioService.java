package com.agenda.service;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {
	
	public static void cadastra (Pessoa pessoa) {
	
    PessoaDAO ligacao = new PessoaDAO();
    ligacao.cadastra(pessoa);
		
		
	}

}
