package br.edu.unifacear.session;

import java.util.List;

import br.edu.unifacear.dao.TamanhoDAO;
import br.edu.unifacear.model.Tamanho;

public class TamanhoSession {
	
	private TamanhoDAO DAO;
	
public TamanhoSession () {
	DAO = new TamanhoDAO();
}

public void inserirTamanho (Tamanho tamanho) {
	DAO.inserir(tamanho);
}

public void alterarTamanho (Tamanho tamanho) {
	DAO.alterar(tamanho);
}

public List<Tamanho> listarTamanhos (){
	return DAO.listarTodos();
}

public void excluirTamanho (Tamanho tamanho) {
	DAO.excluir(tamanho);
}

}
