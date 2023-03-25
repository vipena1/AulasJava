package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class ProgramaDeletarComWhere {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Mamifero mamifero = new Mamifero();
		
		MamiferoDAO mamiferoDAO = new MamiferoDAO(con);
		
		mamifero.setIdade(35);
		mamifero.setMesesGestação(4);
		
		System.out.println(mamiferoDAO.deletarWhere(mamifero));
		
		Conexao.fecharConexao(con);
	}

}
