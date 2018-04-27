package br.edu.unifacear.session;

import java.util.List;

import br.edu.unifacear.dao.GeneroDAO;
import br.edu.unifacear.model.Genero;

public class GeneroSession {
	
	private GeneroDAO DAO;
	
public GeneroSession() {
	DAO = new GeneroDAO();
}

public void inserirGenero(Genero gen) {
	DAO.inserir(gen);
}
public void atualizarGenro (Genero gen) {
	DAO.atualizar(gen);
}
public List <Genero> listarTodos(){
	return DAO.listarTodos();
}
public void excluirGenero (Genero gen) {
	DAO.excluir(gen);
}

}
