package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class ProgramaDeletarSemWhere {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		MamiferoDAO mamiferoDAO = new MamiferoDAO(con);
		
		System.out.println(mamiferoDAO.deletar());
		
		Conexao.fecharConexao(con);

	}

}
