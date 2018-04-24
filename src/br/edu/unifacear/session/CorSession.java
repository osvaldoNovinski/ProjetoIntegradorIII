package br.edu.unifacear.session;

import java.util.List;

import br.edu.unifacear.dao.CorDAO;
import br.edu.unifacear.model.Cor;


public class CorSession {
	
	private CorDAO DAO;
	
	
public CorSession() {
	DAO = new CorDAO();
}

public void inserirCor (Cor cor) {
	DAO.inserir(cor);
}

public void atualizarCor (Cor cor){
	DAO.atualizar(cor);
}

public void excluirCor (Cor cor) {
	DAO.excluir(cor);
	
}

public List<Cor> listarCor (Cor cor){
	return DAO.ListarTodas(cor);
}

}
