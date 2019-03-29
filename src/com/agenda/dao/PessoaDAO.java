package com.agenda.dao;

import com.agenda.model.Pessoa;
import com.mysql.jdbc.Connection;

public class PessoaDAO {
	
	private Connection connection; 
	
	public void cadastra (Pessoa pessoa) {
		
		String SQL ="insert into pessoas (nome, email, endereco, telefone) values(?,?,?,?)";
		
	}
		
	}

