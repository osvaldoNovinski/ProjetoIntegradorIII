package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Funcionario;

public class FuncionarioDAO extends DAO {
	private String SQL_INSERT = "INSERT INTO FUNCIONARIO (mat_fun, nome_fun, cargo_fun, salario_fixo, cpf, ctps, pis, data_nasc, data_admissao, endereco, status_fun) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	private String SQL_UPDATE = "UPDATE FUNCIONARIO nome_fun = ?, cargo_fun = ?, salario_fixo = ?, cpf = ?, ctps = ?, pis = ?, data_nasc = ?, data_admissao = ?, endereco = ?, status_fun = ? where mat_fun = ?;";
	private String SQL_SELECT = "SELECT * FROM FUNCIONARIO;";
	private String SQL_DELETE = "UPDATE FUNCIONARIO status_fun = ? where mat_fun = ?;";
	private String SQL_OBTER_MAT = "SELECT * FROM FUNCIONARIO where mat_fun = ?;";
	private String SQL_OBTER_NOME = "SELECT * FROM FUNCIONARIO where mat_fun like ?;";
	private String SQL_OBTER_CARGO = "SELECT * FROM FUNCIONARIO where cargo like ?;";
	
	public void inserir(Funcionario f) {
		try {
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
			
			ps.setInt(1, f.getMatricula());
			ps.setString(2, f.getNome());
			ps.setString(3,  f.getCargo());
			ps.setFloat(4, f.getSalarioFixo());
			ps.setInt(5,  f.getCpf());
			ps.setInt(6,  f.getCtps());
			ps.setInt(7, f.getPis());
			ps.setDate(8, f.getDataNasc());
			ps.setDate(9, f.getDataAdmissao());
			ps.setString(10, f.getEndereco());
			ps.setBoolean(11, f.isStatus());
			
			ps.executeUpdate();
			
			desconectar();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void atualizar (Funcionario f) {
		try {
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
			
			
			ps.setString(1, f.getNome());
			ps.setString(2,  f.getCargo());
			ps.setFloat(3, f.getSalarioFixo());
			ps.setInt(4,  f.getCpf());
			ps.setInt(5,  f.getCtps());
			ps.setInt(6, f.getPis());
			ps.setDate(7, f.getDataNasc());
			ps.setDate(8, f.getDataAdmissao());
			ps.setString(9, f.getEndereco());
			ps.setBoolean(10, f.isStatus());
			ps.setInt(11, f.getMatricula());
			
			ps.executeUpdate();
			
			desconectar();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Funcionario> listarTodos() {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Funcionario f = new Funcionario(rs.getInt("mat_fun"), 
						rs.getString("nome_fun"), 
						rs.getString("cargo_fun"), 
						rs.getFloat("salario_fixo"),
						rs.getInt("cpf"), 
						rs.getInt("ctps"), 
						rs.getInt("pis"), 
						rs.getDate("data_nasc"), 
						rs.getDate("data_admissao"), 
						rs.getString("endereco"), 
						rs.getBoolean("status_fun"));
				
				lista.add(f);
				
			}
			desconectar();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public void excluir(Funcionario f) {
		try {
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
			
			ps.setBoolean(1, false);
			ps.setInt(2,  f.getMatricula());
			
			ps.executeUpdate();
			
			desconectar();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Funcionario obterPorMat(int mat) {
		Funcionario f = new Funcionario();
		
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_OBTER_MAT);
			
			ps.setInt(1, mat);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				f = new Funcionario(rs.getInt("mat_fun"), 
						rs.getString("nome_fun"), 
						rs.getString("cargo_fun"), 
						rs.getFloat("salario_fixo"),
						rs.getInt("cpf"), 
						rs.getInt("ctps"), 
						rs.getInt("pis"), 
						rs.getDate("data_nasc"), 
						rs.getDate("data_admissao"), 
						rs.getString("endereco"), 
						rs.getBoolean("status_fun"));
				
			}
			
			desconectar();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public List<Funcionario> obterPorNome(String nome) {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_OBTER_NOME);
			
			ps.setString(1, '%'+nome+'%');
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Funcionario f = new Funcionario(rs.getInt("mat_fun"), 
						rs.getString("nome_fun"), 
						rs.getString("cargo_fun"), 
						rs.getFloat("salario_fixo"),
						rs.getInt("cpf"), 
						rs.getInt("ctps"), 
						rs.getInt("pis"), 
						rs.getDate("data_nasc"), 
						rs.getDate("data_admissao"), 
						rs.getString("endereco"), 
						rs.getBoolean("status_fun"));
				
				lista.add(f);
				
			}
			desconectar();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Funcionario> obterPorCargo(String cargo) {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		try {
			
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_OBTER_CARGO);
			
			ps.setString(1, '%'+cargo+'%');
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Funcionario f = new Funcionario(rs.getInt("mat_fun"), 
						rs.getString("nome_fun"), 
						rs.getString("cargo_fun"), 
						rs.getFloat("salario_fixo"),
						rs.getInt("cpf"), 
						rs.getInt("ctps"), 
						rs.getInt("pis"), 
						rs.getDate("data_nasc"), 
						rs.getDate("data_admissao"), 
						rs.getString("endereco"), 
						rs.getBoolean("status_fun"));
				
				lista.add(f);
				
			}
			
			desconectar();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}
