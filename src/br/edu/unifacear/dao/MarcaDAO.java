package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Marca;

public class MarcaDAO extends DAO{
	private String SQL_INSERT = "INSERT INTO TB_MARCA(id_marca, desc_marca, status) values(?, ?, ?);";
	private String SQL_UPDATE = "UPDATE TB_MARCA SET desc_marca = ?, status = ? WHERE id_marca = ?;";
	private String SQL_DELETE = "UPDATE TB_MARCA SET status = ? WHERE id_marca = ?;";
	private String SQL_SELECT = "SELECT * FROM TB_MARCA;";
	private String SQL_OBTER_ID = "SELECT * FROM TB_MARCA WHERE id = ?;";
	private String SQL_OBTER_DESC = "SELECT * FROM TB_MARCA WHERE desc_marca like '%?%';";
	
	public void inserir(Marca m) {
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
			ps.setInt(1, m.getId());
			ps.setString(2, m.getDescricao());
			ps.setBoolean(3, m.isStatus());
			
			ps.executeUpdate();
			
			desconectar();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar (Marca m) {
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
			
			ps.setString(1, m.getDescricao());
			ps.setBoolean(2, m.isStatus());
			ps.setInt(3, m.getId());
			
			ps.executeUpdate();
			
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public void excluir(Marca m) {
		
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
			
			ps.setBoolean(1, false);
			ps.setInt(2, m.getId());
			
			ps.executeUpdate(SQL_DELETE);
			
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Marca> listarTodos() {
		List<Marca> lista = new ArrayList<Marca>();
		
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Marca m = new Marca(rs.getInt("id_marca"),
										rs.getString("desc_marca"),
										rs.getBoolean("status"));
				
				lista.add(m);
			}
			
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public Marca obterPorId(int id) {
		Marca m = null;
		
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_OBTER_ID);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				m = new Marca(rs.getInt("id_marca"),
								rs.getString("desc_marca"),
								rs.getBoolean("status"));
			}
			
			desconectar();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return m;
	}
	
	public List<Marca> obterPorDesc(String desc) {
		List<Marca> lista = new ArrayList<Marca>();
		
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_OBTER_DESC);
			ps.setString(1, desc);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Marca m = new Marca(rs.getInt("id_marca"),
										rs.getString("desc_marca"),
										rs.getBoolean("status"));
				
				lista.add(m);
			}
			
			desconectar();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
