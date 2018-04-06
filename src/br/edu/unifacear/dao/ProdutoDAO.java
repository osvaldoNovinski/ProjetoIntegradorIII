package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Marca;
import br.edu.unifacear.model.Produto;

public class ProdutoDAO extends DAO {
	private String SQL_INSERT = "INSERT INTO TB_PRODUTO (id_produto, desc_produto, status) values (?,?,?);";
	private String SQL_UPDATE = "UPDATE TB_PRODUTO SET desc_produto = ?, status = ? WHERE id_produto = ?;";
	private String SQL_DELETE = "TB_PRODUTO SET status = ? WHERE id_produto = ?;";
	private String SQL_SELECT = "SELECT * FROM TB_PRODUTO;";
	private String SQL_OBTER_ID = "SELECT * FROM TB_PRODUTO WHERE id_produto = ?;";
	private String SQL_OBTER_DESC = "SELECT * FROM TB_PRODUTO WHERE desc_produto LIKE'%?%';";

	public void inserir(Produto p) {
		try {

			conectar();

			PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);

			ps.setInt(1, p.getId());
			ps.setString(2, p.getDescricao());
			ps.setBoolean(3, p.isStatus());

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
			ps.setString(1, p.getDescricao());
			ps.setBoolean(2, p.isStatus());
			ps.setInt(3, p.getId());

			ps.executeUpdate();

			desconectar();

		} catch (Exception e) {
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
				Produto p = new Produto(rs.getInt("id_produto"), rs.getString("desc_produto"), rs.getBoolean("status"));

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
				p = new Produto(rs.getInt("id_produto"), rs.getString("desc_produto"), rs.getBoolean("status"));
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
			ps.setString(1, desc);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Produto p = new Produto(rs.getInt("id_produto"), rs.getString("desc_produto"),
						rs.getBoolean("status"));
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
			ps.setBoolean(1, p.isStatus());
			ps.setInt(2, p.getId());

			ps.executeUpdate();

			desconectar();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
