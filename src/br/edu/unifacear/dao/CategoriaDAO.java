package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Categoria;

public class CategoriaDAO extends DAO {
	
	private String SQL_INSERT = "INSERT INTO CATEGORIA (id_cat, nome_cat, status_cat) values (?,?,?);";
	private String SQL_UPDATE = "UPDATE CATEGORIA SET nome_cat = ?, status_cat = ? WHERE id_cat=?;";
	private String SQL_SELECT = "SELECT * FROM CATEGORIA;";
	private String SQL_DELET = "UPDATE CATEGORIA SET status_cat = ? WHERE id_cat = ?;";
	
	
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
			Categoria catego = new Categoria(rs.getInt("id_cat"),rs.getString("nome_cat"),rs.getBoolean("status_cat"));
			
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
		
		ps.setBoolean(1, false);
		ps.setInt(2, cat.getId());
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

}
