package br.edu.unifacear.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.dao.ProdutoDAO;
import br.edu.unifacear.model.Produto;
import br.edu.unifacear.session.ProdutoSession;

public class ProdutoApp {

	public static void main(String[] args) {
		
		
		//Produto p = new Produto (001,"Calça",true);
		//Produto p1 = new Produto (002,"Meia",true);
		//Produto p2 = new Produto (003,"Saia",true);
		//Produto p3 = new Produto (004,"Camiseta",true);
		
		
		
		ProdutoSession ps = new ProdutoSession();
		//ProdutoDAO pd = new ProdutoDAO();
		
		List<Produto> lista = ps.listarTodos();
		
		for (Produto p: lista) {
			System.out.println(" id: "+p.getId()+ "\n Descrição: "+p.getDescricao()+"\n Status: "+p.isStatus());
			System.out.println("-----------------\n");
		}
		
		
		//Produto p2 = ps.obterPorId(2);
		
		//List<Produto> p3 = ps.obterPorDescricao("alç");
		
		//Produto p2 = pd.listarTodosPorID(3);
		//List<Produto> p3 = pd.listarTodosPorDesc("Calça");
		
		//System.out.println(" id: "+p2.getId()+ "\n Descrição: "+p2.getDescricao()+"\n Status: "+p2.isStatus());
		
		//for(Produto p: p3) {
		//System.out.println(" id: "+p.getId()+ "\n Descrição: "+p.getDescricao()+"\n Status: "+p.isStatus());
		
		//}
		
		
		///ps.inserirProduto(p);
		//ps.inserirProduto(p1);
		//ps.inserirProduto(p2);
		//ps.inserirProduto(p3);

	}

}
