package br.edu.unifacear.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.model.Categoria;
import br.edu.unifacear.model.ConstruirProduto;
import br.edu.unifacear.model.Cor;
import br.edu.unifacear.model.Genero;
import br.edu.unifacear.model.Produto;
import br.edu.unifacear.model.Tamanho;

public class ConstruirProdutoDAO extends DAO{
	
	private String SQL_INSERT_PRODUTO_CAT = "INSERT INTO produto_cat (id_cat,id_produto) values (?,?);";
	private String SQL_INSERT_PRODUTO_TAM = "INSERT INTO produto_tam (id_tam,id_produto) values (?,?);";
	private String SQL_INSERT_PRODUTO_GENERO = "INSERT INTO produto_genero (id_genero,id_produto) values (?,?);";
	private String SQL_INSERT_PRODUTO_COR = "INSERT INTO produto_cor (id_cor,id_produto) values (?,?);";
	private String SQL_INSERT_PRODUTO_ENTRADA = "INSERT INTO produto_entrada (id_produto,id_entrada) values (?,?);";
	private String SQL_INSERT_PRODUTO_BAIXA = "INSERT INTO produto_baixa (id_produto,id_baixa) values (?,?);";
	private String SQL_BUSCAR_PRODUTO_ID_PRODUTO = "SELECT * FROM tb_produto inner join produto_cor on tb_produto.id_produto = produto_cor.id_produto	inner join tb_cor on tb_cor.id_cor = produto_cor.id_cor	inner join produto_cat on tb_produto.id_produto = produto_cat.id_produto inner join tb_categoria on tb_categoria.id_cat = produto_cat.id_cat inner join produto_tam on tb_produto.id_produto = produto_tam.id_produto inner join tb_tamanho on tb_tamanho.id_tamanho = produto_tam.id_tam inner join produto_genero on tb_produto.id_produto = produto_genero.id_produto inner join tb_genero on tb_genero.id_genero = produto_genero.id_genero	WHERE tb_produto.id_produto = ?;";
	
	public List <ConstruirProduto> obterProdutoCompletoPorId (Produto produ) {
		List<ConstruirProduto> lista = new ArrayList<ConstruirProduto>();
		Produto pro = null;
		Categoria ca = null;
		Tamanho ta = null;
		Cor co = null;
		Genero ge = null;
		
		
		try {
			conectar();
			
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_BUSCAR_PRODUTO_ID_PRODUTO);	
		ps.setInt(1, produ.getId());
		
		//System.out.println("Aqui foi");
		
		ResultSet rs = ps.executeQuery();
		
		//System.out.println("Aqui não foi");
		
		while (rs.next()) {
			pro = new Produto(rs.getInt("id_produto"),rs.getString("nome_produto"),rs.getBoolean("status_produto"));
			ca = new Categoria(rs.getInt("id_cat"),rs.getString("nome_cat"),rs.getBoolean("status_cat"));
			ta = new Tamanho(rs.getInt("id_tamanho"),rs.getString("nome_tamanho"),rs.getBoolean("status_tamanho"));
			co = new Cor (rs.getInt("id_cor"),rs.getString("nome_cor"),rs.getBoolean("status_cor"));
			ge = new Genero(rs.getInt("id_genero"),rs.getString("nome_genero"),rs.getBoolean("status_genero"));
			
			ConstruirProduto prod = new ConstruirProduto(pro,ca,ta,ge,co);
			
			lista.add(prod);
		}
		
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
		
	}
	
	public void inserir_P_Cat (ConstruirProduto CP) {
		
		try {
			conectar();
			
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT_PRODUTO_CAT);	
		
		ps.setInt(1, CP.getCa().getId());
		ps.setInt(2, CP.getPro().getId());
			
		ps.executeUpdate();
		
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void inserir_P_Cor (ConstruirProduto CP) {		
		try {
			conectar();
			
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT_PRODUTO_COR);	
			
		ps.setInt(1, CP.getCor().getId());
		ps.setInt(2, CP.getPro().getId());
		
		ps.executeUpdate();
			
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void inserir_P_Tam (ConstruirProduto CP) {
		try {
			conectar();
			
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT_PRODUTO_TAM);	
			
		ps.setInt(1, CP.getTam().getId());
		ps.setInt(2, CP.getPro().getId());
		
		ps.executeUpdate();
			
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void inserir_P_Gen (ConstruirProduto CP) {
		try {
			conectar();
			
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT_PRODUTO_GENERO);	
			
		ps.setInt(1, CP.getGen().getId());
		ps.setInt(2, CP.getPro().getId());
		
		ps.executeUpdate();
			
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void inserir_P_Entrada (ConstruirProduto CP) {
		try {
			conectar();
			
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT_PRODUTO_ENTRADA);	
		
		ps.setInt(1, CP.getPro().getId());
		//ps.setInt(2, CP.getId_entrada().getId());
		
		ps.executeUpdate();
			
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void inserir_P_Baixa (ConstruirProduto CP) {
		try {
			conectar();
			
		PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT_PRODUTO_BAIXA);	
			
		ps.setInt(1, CP.getPro().getId());
		//ps.setInt(2, CP.getId_baixa());	
		
		ps.executeUpdate();
		
			desconectar();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
