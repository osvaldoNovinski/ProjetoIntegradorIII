package br.edu.unifacear.session;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.dao.ProdutoDAO;
import br.edu.unifacear.model.Produto;

public class ProdutoSession {

	private ProdutoDAO DAO;
	
	public ProdutoSession () {
		DAO = new ProdutoDAO();
	}
	
	public void inserirProduto (Produto p) {
		
		DAO.inserir(p);
	}
	
	public void atualizarProduto (Produto p ) {
		DAO.alterar(p);
	}
	
	public List <Produto> listarTodos () {
		return DAO.listarTodos();
	}
	
	public void excluirProduto (Produto p ) {
		DAO.excluir(p);
	}
	
	public Produto obterPorId(int id) {
		return DAO.listarTodosPorID(id);
		
	}
	
	public List <Produto> obterPorDescricao(String desc) {
		return DAO.listarTodosPorDesc(desc);
		
	}
	
	

}

