package br.com.zoologico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.zoologico.beans.Mamifero;

public class MamiferoDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
		
	}

	public MamiferoDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Mamifero mamifero) {
		String sql = "insert into mamifero(nome, idade, mesesgestacao) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, mamifero.getNome());
			ps.setInt(2, mamifero.getIdade());
			ps.setInt(3, mamifero.getMesesGestação());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";

			} else {
				return "Erro ao inserir.";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	//Deletar sem where
	public String deletar() {
		String sql = "delete from mamifero";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";

			} else {
				return "Erro ao deletar.";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}

	}
	
	//Deletar com Where
	public String deletarWhere(Mamifero mamifero) {
		String sql = "delete from mamifero where idade = ? and mesesgestacao = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, mamifero.getIdade());
			ps.setInt(2, mamifero.getMesesGestação());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";

			} else {
				return "Erro ao deletar.";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	// Modificar os meses de gestação apartir de um mes pré definido
	public String modificar(Mamifero mamifero) {
		String sql = "update mamifero set mesesgestacao = ? where mesesgestacao = 5";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, mamifero.getMesesGestação());
			if (ps.executeUpdate() > 0) {
				return "Modificado com sucesso.";

			} else {
				return "Erro ao deletar.";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	// Modificar os meses de gestação apartir do nome
	public String modificarComNome(Mamifero mamifero) {
		String sql = "update mamifero set mesesgestacao = ? where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, mamifero.getMesesGestação());
			ps.setString(2, mamifero.getNome());
			if (ps.executeUpdate() > 0) {
				return "Modificado com nome com sucesso.";

			} else {
				return "Erro ao deletar.";
			}

		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}



