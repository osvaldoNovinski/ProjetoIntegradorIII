package br.edu.unifacear.session;

import java.util.List;

import br.edu.unifacear.dao.CategoriaDAO;
import br.edu.unifacear.model.Categoria;

public class CategoriaSession {
	
	private CategoriaDAO DAO;
	
	
public CategoriaSession () {
	DAO = new CategoriaDAO();
}

public void inserirCategoria(Categoria cat) {
	DAO.inserir(cat);
}

public void alterarCategoria (Categoria cat) {
	DAO.alterar(cat);
}

public List<Categoria> listarTodosCategoria (){
	return DAO.listarTodos();
}

public void excluirCategoria(Categoria cat) {
	DAO.excluir(cat);
}

}
