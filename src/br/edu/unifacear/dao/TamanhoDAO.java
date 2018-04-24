package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Tamanho;

public class TamanhoDAO extends DAO{
	
	private String SQL_INSERT ="INSERT INTO TB_TAMANHO (id,nome,status) values (?,?,?);";
	private String SQL_UPDATE = "UPDATE TB_TAMANHO nome = ? status = ? where id = ?;";
	private String SQL_SELECT = "SELECT * FROM TB_TAMANHO;";
	private String SQL_DELETE = "TB_TAMANHO status = ? WHERE id = ?;";
	
	
public void inserir (Tamanho tamanho) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
		
		ps.setInt(1, tamanho.getId());
		ps.setString(2, tamanho.getNome());
		ps.setBoolean(3, tamanho.isStatus());
		
		ps.executeUpdate();
		
		desconectar();
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void alterar (Tamanho tamanho) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
		
		ps.setString(1, tamanho.getNome());
		ps.setBoolean(2, tamanho.isStatus());
		ps.setInt(3, tamanho.getId());
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}

public List<Tamanho> listarTodos (){
	List<Tamanho> lista = new ArrayList<Tamanho>();
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Tamanho tam = new Tamanho (rs.getInt("id"),rs.getString("nome"),rs.getBoolean("status"));
			
			lista.add(tam);
			
		}
		
		
		desconectar();
	}catch (Exception e ) {
		e.printStackTrace();
	}
	
	return lista;
}

public void excluir (Tamanho tamanho) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
		
		ps.setBoolean(1, tamanho.isStatus());
		ps.setInt(2, tamanho.getId());
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

}
