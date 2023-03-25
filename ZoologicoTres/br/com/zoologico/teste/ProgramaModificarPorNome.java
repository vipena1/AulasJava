package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class ProgramaModificarPorNome {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Mamifero mamifero = new Mamifero();
		
		MamiferoDAO mamiferoDAO = new MamiferoDAO(con);
		
		mamifero.setMesesGestação(5);
		mamifero.setNome("Tigre");

		
		System.out.println(mamiferoDAO.modificarComNome(mamifero));
		
		Conexao.fecharConexao(con);

	}

}
