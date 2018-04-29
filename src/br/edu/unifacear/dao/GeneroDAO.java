package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Genero;

public class GeneroDAO extends DAO {
	
	private String SQL_INSERT = "INSERT INTO GENERO (id_gen, nome_gen, status_gen) values (?,?,?);";
	private String SQL_UPDATE = "UPDATE GENERO SET nome_gen =?, status_gen = ?, WHERE id_gen = ?;";
	private String SQL_DELETE = "UPDATE GENERO SET status_gen = ? WHERE id_gen = ?;";
	private String SQL_SELECT = "SELECT * FROM GENERO;";
	
	
public void inserir (Genero gen) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
		
		ps.setInt(1, gen.getId());
		ps.setString(2, gen.getNome());
		ps.setBoolean(3, gen.isStatus());
		
		ps.executeUpdate();
		
		desconectar();
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void atualizar (Genero gen) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
		
		ps.setString(1, gen.getNome());
		ps.setBoolean(2, gen.isStatus());
		ps.setInt(3, gen.getId());
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	
public List <Genero> listarTodos () {
	
	List<Genero> lista = new ArrayList<Genero>();
	
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Genero gen = new Genero (rs.getInt("id_genero"), rs.getString("nome_genero"), rs.getBoolean("status_genero"));
			
			lista.add(gen);
		}
		
		desconectar();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return lista;
	
}

public void excluir (Genero gen) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
		
		ps.setBoolean(1, false);
		ps.setInt(2, gen.getId());
		
		ps.executeUpdate();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
	
}


