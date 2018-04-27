package br.edu.unifacear.session;

import java.util.List;

import br.edu.unifacear.dao.ConstruirProdutoDAO;
import br.edu.unifacear.model.ConstruirProduto;
import br.edu.unifacear.model.Produto;

public class ConstruirProdutoSession {
	
	private ConstruirProdutoDAO DAO;
	
public ConstruirProdutoSession () {
	DAO = new ConstruirProdutoDAO();
}
public void inserir_cat_p (ConstruirProduto PC) {
	DAO.inserir_P_Cat(PC);
}

public void inserir_tam_p (ConstruirProduto PC) {
	DAO.inserir_P_Tam(PC);
}

public void inserir_gen_p (ConstruirProduto PC) {
	DAO.inserir_P_Gen(PC);
}

public void inserir_cor_p (ConstruirProduto PC) {
	DAO.inserir_P_Cor(PC);
}
public void inserir_entrada_p (ConstruirProduto PC) {
	DAO.inserir_P_Entrada(PC);
}
public void inserir_baixa_p (ConstruirProduto PC) {
	DAO.inserir_P_Baixa(PC);
}

public List <ConstruirProduto> listarProdutoCompletoId (Produto produ){
	return DAO.obterProdutoCompletoPorId(produ);
}



}
