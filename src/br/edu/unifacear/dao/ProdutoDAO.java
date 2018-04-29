package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import br.edu.unifacear.model.*;

public class ProdutoDAO extends DAO {
	private String SQL_INSERT = "INSERT INTO PRODUTO (id_produto,nome_produto,status_produto,qtde_produto,id_cat,id_cor,id_gen,volume,peso,id_un,id_tam) values (?,?,?,?,?,?,?,?,?,?,?) ;";
	private String SQL_UPDATE = "UPDATE PRODUTO SET nome_produto = ?, status_produto = ? WHERE id_produto = ?;";
	private String SQL_DELETE = "UPDATE PRODUTO SET status_produto = ? WHERE id_produto = ?;";
	private String SQL_SELECT = "SELECT * FROM PRODUTO;";
	private String SQL_OBTER_ID = "SELECT * FROM PRODUTO WHERE id_produto = ?;";
	private String SQL_OBTER_DESC = "SELECT * FROM PRODUTO WHERE nome_produto LIKE'%?%';";
	private String SQL_UPDATE_QTDA = "UPDATE PRODUTO SET qtda_produto = ? WHERE id_produto = ?;";

	public void inserir(Produto p) {
		Categoria ca = new Categoria();
		Cor co = new Cor();
		Genero ge = new Genero();
		Unidade un = new Unidade();
		Tamanho tam = new Tamanho();
		try {

			conectar();

			PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);

			ps.setInt(1, p.getId_produto());
			ps.setString(2, p.getNome_produto());
			ps.setBoolean(3, p.isStatus_produto());
			ps.setInt(4, p.getQtda_produto());
			ps.setInt(5, p.getCategoria().getId());
			ps.setInt(6, p.getCor().getId());
			ps.setInt(7, p.getGenero().getId());
			ps.setFloat(8, p.getVolume());
			ps.setFloat(9, p.getPeso());
			ps.setInt(10, p.getUnidade().getId_un());
			ps.setInt(11, p.getTamanho().getId());
			
			

			ps.executeUpdate();

			desconectar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alterar(Produto p) {
		try {

			conectar();

			PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
			ps.setString(1, p.getNome_produto());
			ps.setBoolean(2, p.isStatus_produto());
			ps.setInt(3, p.getId_produto());

			ps.executeUpdate();

			desconectar();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarQtdaProduto (Produto p) {
		Entrada ent = new Entrada();
		try {
			conectar();
			
			PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE_QTDA);
			
			ps.setFloat(1, p.getQtda_produto());
			ps.setInt (2, ent.getQtda());
				
			
			desconectar();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Produto> listarTodos() {
		List<Produto> lista = new ArrayList<Produto>();

		try {
			conectar();

			PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Categoria ca = new Categoria (rs.getInt("id_cat"),rs.getString("nome_cat"), rs.getBoolean("status_cat"));
				Cor co = new Cor (rs.getInt("id_cor"),rs.getString("nome_cor"),rs.getBoolean("status_cor"));
				Genero ge = new Genero (rs.getInt("id_gen"), rs.getString("nome_gen"), rs.getBoolean("status_gen"));
				Unidade un = new Unidade (rs.getInt("id_gen"),rs.getString("nome_gen"),rs.getBoolean("status_gen"));
				Tamanho tam = new Tamanho (rs.getInt("id_tam"),rs.getString("nome_tam"), rs.getBoolean("status_tam"));
				Produto p = new Produto(rs.getInt("id_produto"), rs.getString("nome_produto"), rs.getBoolean("status_produto"),rs.getInt("qtda_produto"),ca,co,ge,rs.getFloat("volume"),rs.getFloat("peso"),un,tam);

				lista.add(p);
			}

			desconectar();

		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(lista);
		return lista;

	}

	public Produto listarTodosPorID(int id) {
		Produto p = null;

		try {
			conectar();

			PreparedStatement ps = db.getConnection().prepareStatement(SQL_OBTER_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Categoria ca = new Categoria (rs.getInt("id_cat"),rs.getString("nome_cat"), rs.getBoolean("status_cat"));
				Cor co = new Cor (rs.getInt("id_cor"),rs.getString("nome_cor"),rs.getBoolean("status_cor"));
				Genero ge = new Genero (rs.getInt("id_gen"), rs.getString("nome_gen"), rs.getBoolean("status_gen"));
				Unidade un = new Unidade (rs.getInt("id_gen"),rs.getString("nome_gen"),rs.getBoolean("status_gen"));
				Tamanho tam = new Tamanho (rs.getInt("id_tam"),rs.getString("nome_tam"), rs.getBoolean("status_tam"));
				p = new Produto(rs.getInt("id_produto"), rs.getString("nome_produto"), rs.getBoolean("status_produto"),rs.getInt("qtda_produto"),ca,co,ge,rs.getFloat("volume"),rs.getFloat("peso"),un,tam);

			}
			desconectar();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return p;
	}

	public List<Produto> listarTodosPorDesc(String desc) {
		List<Produto> lista = new ArrayList<Produto>();

		try {
			conectar();

			PreparedStatement ps = db.getConnection().prepareStatement(SQL_OBTER_DESC);
			ps.setString(1, '%'+desc+'%');
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Categoria ca = new Categoria (rs.getInt("id_cat"),rs.getString("nome_cat"), rs.getBoolean("status_cat"));
				Cor co = new Cor (rs.getInt("id_cor"),rs.getString("nome_cor"),rs.getBoolean("status_cor"));
				Genero ge = new Genero (rs.getInt("id_gen"), rs.getString("nome_gen"), rs.getBoolean("status_gen"));
				Unidade un = new Unidade (rs.getInt("id_gen"),rs.getString("nome_gen"),rs.getBoolean("status_gen"));
				Tamanho tam = new Tamanho (rs.getInt("id_tam"),rs.getString("nome_tam"), rs.getBoolean("status_tam"));
				Produto p = new Produto(rs.getInt("id_produto"), rs.getString("nome_produto"), rs.getBoolean("status_produto"),rs.getInt("qtda_produto"),ca,co,ge,rs.getFloat("volume"),rs.getFloat("peso"),un,tam);

				
				
				lista.add(p);
				
			}
			desconectar();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	public void excluir(Produto p) {
		try {

			conectar();

			PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
			ps.setBoolean(1, false);
			ps.setInt(2, p.getId_produto());

			ps.executeUpdate();

			desconectar();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
