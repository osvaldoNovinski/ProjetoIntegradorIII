package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Genero;
import br.edu.unifacear.model.Unidade;

public class UnidadeDAO extends DAO{
	
	private String SQL_INSERT = "INSERT INTO UNIDADE (id_un, nome_un, status_un) values (?,?,?);";
	private String SQL_UPDATE = "UPDATE UNIDADE SET nome_un = ? WHERE id_un = ?;";
	private String SQL_SELECT = "SELECT * FROM UNIDADE WHERE id_un = ?;";
	private String SQL_DELETE = "UPDATE UNIDADE SET status_un = ? WHWRE id_un = ?;";
	private String SQL_OBTER_POR_DESC = "SELECT * FROM UNIDADE WHERE nome_un = ?;";
	
	
public void inserir (Unidade un) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
		ps.setInt(1, un.getId_un());
		ps.setString(2, un.getNome_un());
		ps.setBoolean (3, un.isStatus_un());
		
		ps.executeUpdate();
		
		
		desconectar();
	}catch(Exception e ) {
		e.printStackTrace ();
	}
}

public void atualizar (Unidade un) {
	try {
		conectar();
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
		ps.setString(1, un.getNome_un());
		ps.setInt(2, un.getId_un());
		
		ps.executeUpdate();
		desconectar();
	}catch (Exception e) {
		e.printStackTrace();
	}
}	
public List <Unidade> listarTodos (){
		List<Unidade> lista = new ArrayList<Unidade>();
			try {
				conectar();
				PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
				ResultSet rs = ps.executeQuery();
				
				while (rs.next()) {
					Unidade un = new Unidade (rs.getInt("id_un"),rs.getString("nome_un"), rs.getBoolean("status_un"));
					
					lista.add(un);
				}
				
				desconectar();
			}catch(Exception e) {
				e.printStackTrace();
			}
		return lista;
	}

public void delete (Unidade un) {
	try {
		conectar();
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
		ps.setBoolean(1, un.isStatus_un());
		ps.setInt(2, un.getId_un());
		
		ps.executeUpdate();
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public List<Unidade> listarPorNome (String nome){
	List <Unidade> lista = new ArrayList<Unidade>();
	try {
		conectar();
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_OBTER_POR_DESC);
		ResultSet rs = ps.executeQuery();
		ps.setString(1, '%'+nome+'%');
		
		while(rs.next()) {
			Unidade un = new Unidade (rs.getInt("id_un"), rs.getString("nome_un"),rs.getBoolean("status_un"));
			lista.add(un);
		}
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return lista;
}
}
