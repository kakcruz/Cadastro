
package com.agenda.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.agenda.model.Pessoa;
import com.agenda.util.ConnectionFactory;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PessoaDAO {

	private static final String SQL = null;
	private Connection connection;

	public void cadastra(Pessoa pessoa) {

		String SQL = "insert into pessoas (nome, email, endereco, telefone) values(?,?,?,?)";

		try {

			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement(SQL);

			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEmail());
			stmt.setString(3, pessoa.getEndereco());
			stmt.setString(4, pessoa.getTelefone());

			stmt.execute();
			stmt.close();

			buscarPessoas();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Pessoa> buscarPessoas() {

		String SQL = "select * from pessoas";

		try {

			this.connection = new ConnectionFactory().getConnection();

			java.sql.PreparedStatement stmt = this.connection.prepareStatement(SQL);

			List<Pessoa> pessoas = new ArrayList<Pessoa>();

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Pessoa pessoa = new Pessoa();
				pessoa.setNome(rs.getString("nome"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setEndereco(rs.getString("endereco"));
				pessoa.setTelefone(rs.getString("telefone"));
				pessoas.add(pessoa);

			}

			stmt.close();
			this.connection.close();

			return pessoas;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	public void  apagarContato(Pessoa pessoa) {
	
		System.out.println("Metodo APAGAR executado com sucesso");
	
}
	
}