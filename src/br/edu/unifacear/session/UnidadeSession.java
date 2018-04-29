package br.edu.unifacear.session;

import java.util.List;

import br.edu.unifacear.dao.UnidadeDAO;
import br.edu.unifacear.model.Unidade;

public class UnidadeSession {
	
	private UnidadeDAO DAO;
	
	
	public UnidadeSession () {
		DAO = new UnidadeDAO();
	}

	
	public void inserirUnidade (Unidade uni) {
		DAO.inserir(uni);
	}
	public void atualizarUnidade (Unidade uni) {
		DAO.atualizar(uni);
	}
	public List<Unidade> listarTodos(){
	return DAO.listarTodos();
	}
	public void excluirUnidade(Unidade uni) {
		DAO.delete(uni);
	}
	public List<Unidade>listarUnidadePorNome(String nome){
		return DAO.listarPorNome(nome);
	}
}
