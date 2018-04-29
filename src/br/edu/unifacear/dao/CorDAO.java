package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Cor;

public class CorDAO extends DAO{
	
	private String SQL_INSERT ="INSERT INTO COR (id_cor, nome_cor, status_cor) values (?,?,?);";
	private String SQL_UPDATE = "UPDATE COR SET nome_cor =?, status_cor = ?, WHERE id_cor = ?;";
	private String SQL_DELETE = "UPDATE COR SET status_cor = ? WHERE id_cor = ?;";
	private String SQL_SELECT = "SELECT * FROM COR;";
	
	
public void inserir (Cor cor) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
		
		ps.setInt(1, cor.getId());
		ps.setString(2, cor.getNome());
		ps.setBoolean(3, cor.isStatus());
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e ) {
		e.printStackTrace();
	}
}

public void atualizar (Cor cor) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
		
		ps.setString(1, cor.getNome());
		ps.setBoolean (2, cor.isStatus());
		ps.setInt(3, cor.getId());
		
		ps.executeUpdate();
		
		desconectar();
		
	}catch(Exception e ) {
		e.printStackTrace();
	}
}

public void excluir (Cor cor) {
	try {
		conectar();
		
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
		
		ps.setBoolean(1, false);
		ps.setInt(2, cor.getId());
		
		ps.executeUpdate();
		
		desconectar();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}

public List<Cor> ListarTodas (Cor cor){
	List<Cor> lista = new ArrayList<Cor>();
	try {
		conectar();
	
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Cor cores = new Cor (rs.getInt("id_cor"),rs.getString("nome_cor"),rs.getBoolean("status_cor"));
			
			lista.add(cores);
		}
	
		desconectar();
	}catch(Exception e ) {
		e.printStackTrace();
	}
	return lista;
}

}
