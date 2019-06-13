package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {

	private PessoaDAO dao = new PessoaDAO();

	public void cadastraOuAlterar(Pessoa pessoa) {

		if (0 != pessoa.getId()) {
			this.dao.alterar(pessoa);
		} else {
			this.dao.cadastra(pessoa);
		}

	}

	public List<Pessoa> buscaPessoas() {
		return this.dao.buscarPessoas();
	}

	public void apagarContato(Pessoa pessoa) {
		this.dao.apagarContato(pessoa);
	}

}