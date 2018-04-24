package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Categoria;

public class CategoriaDAO extends DAO {
	
	private String SQL_INSERT = "INSERT INTO TB_CATEGORIA (id, nome, status) values (?,?,?);";
	private String SQL_UPDATE = "UPDATE TB_CATEGORIA SET nome = ?, status = ? WHERE id=?;";
	private String SQL_SELECT = "SELECT * FROM TB_CATEGORIA;";
	private String SQL_DELET = "TB_CATEGORIA SET status = ? WHERE id = ?;";
	
	
public void inserir (Categoria cat) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
		
		ps.setInt(1, cat.getId());
		ps.setString(2, cat.getNome());
		ps.setBoolean(3, cat.isStatus());
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public void alterar (Categoria cat) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
		
		ps.setString(1, cat.getNome());
		ps.setBoolean(2, cat.isStatus());
		ps.setInt(3, cat.getId());
		
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public List<Categoria> listarTodos(){
	List<Categoria> lista = new ArrayList<Categoria>();
	
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Categoria catego = new Categoria(rs.getInt("id"),rs.getString("nome"),rs.getBoolean("status"));
			
			lista.add(catego);
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return lista;
}

public void excluir (Categoria cat) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELET);
		
		ps.setBoolean(1, cat.isStatus());
		ps.setInt(2, cat.getId());
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

}
