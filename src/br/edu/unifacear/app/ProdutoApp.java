package br.edu.unifacear.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.dao.ProdutoDAO;
import br.edu.unifacear.model.Categoria;
import br.edu.unifacear.model.ConstruirProduto;
import br.edu.unifacear.model.Cor;
import br.edu.unifacear.model.Genero;
import br.edu.unifacear.model.Produto;
import br.edu.unifacear.model.Tamanho;
import br.edu.unifacear.session.CategoriaSession;
import br.edu.unifacear.session.ConstruirProdutoSession;
import br.edu.unifacear.session.CorSession;
import br.edu.unifacear.session.GeneroSession;
import br.edu.unifacear.session.ProdutoSession;
import br.edu.unifacear.session.TamanhoSession;

public class ProdutoApp {

	public static void main(String[] args) {
		
		
		ProdutoSession ps = new ProdutoSession();		
		/*
		Produto p = new Produto (001,"Laicra",true);
		Produto p1 = new Produto (002,"Soquete",true);
		Produto p2 = new Produto (003,"Polo",true);
		Produto p3 = new Produto (004,"Manga Longa",true);		
		
		ps.inserirProduto(p);
		ps.inserirProduto(p1);
		ps.inserirProduto(p2);
		ps.inserirProduto(p3);
		
		CategoriaSession cs = new CategoriaSession();
		
		Categoria c = new Categoria (001, "Camisa", true);
		Categoria c2 = new Categoria (002, "Calça", true);
		Categoria c3 = new Categoria (003, "Meia", true);
		Categoria c4 = new Categoria (004, "Calção", true);
		
		cs.inserirCategoria(c);
		cs.inserirCategoria(c2);
		cs.inserirCategoria(c3);
		cs.inserirCategoria(c4);
		
		GeneroSession gs = new GeneroSession ();
		
		Genero g = new Genero (001, "Femenino",true);
		Genero g2 = new Genero (002, "Masculino",true);
		Genero g3 = new Genero (003, "Infantil",true);
		
		gs.inserirGenero(g);
		gs.inserirGenero(g2);
		gs.inserirGenero(g3);
		
		TamanhoSession ts = new TamanhoSession();
		
		Tamanho t = new Tamanho (001, "P",true);
		Tamanho t2 = new Tamanho (003, "M",true);
		Tamanho t3 = new Tamanho (002, "G",true);
		
		ts.inserirTamanho(t);
		ts.inserirTamanho(t2);
		ts.inserirTamanho(t3);
		
		CorSession cors = new CorSession();
		
		Cor cor = new Cor (001,"Azul", true);
		Cor cor2 = new Cor (002,"Vermelho", true);
		Cor cor3 = new Cor (003,"Amarelo", true);
		Cor cor4 = new Cor (004,"Preto", true);
		
		cors.inserirCor(cor);
		cors.inserirCor(cor2);
		cors.inserirCor(cor3);
		cors.inserirCor(cor4);
		*/
		
		Produto pro = new Produto();
		pro.setId(1);
		Categoria ca = new Categoria();
		ca.setId(2);
		Tamanho ta = new Tamanho();
		ta.setId(3);
		Cor co = new Cor ();
		co.setId(2);
		Genero ge = new Genero();
		ge.setId(2);
		
		
		ConstruirProdutoSession CPS = new ConstruirProdutoSession();
		/*
		
		ConstruirProduto CP = new ConstruirProduto();
		CP.setCa(ca);
		CP.setPro(pro);
		
		CPS.inserir_cat_p(CP);
		
		
		ConstruirProduto Pcor = new ConstruirProduto();
		Pcor.setCor(co);
		Pcor.setPro(pro);
		
		CPS.inserir_cor_p(Pcor);
		
		ConstruirProduto Ptam = new ConstruirProduto();
		Ptam.setTam(ta);
		Ptam.setPro(pro);
		
		CPS.inserir_tam_p(Ptam);
		
		ConstruirProduto Pgen = new ConstruirProduto();
		Pgen.setGen(ge);
		Pgen.setPro(pro);
		
		CPS.inserir_gen_p(Pgen);
		
		*/
		
		List <ConstruirProduto> lista = CPS.listarProdutoCompletoId(pro);
		
		//lista = CPS.listarProdutoCompletoId(pro);
		
		for (ConstruirProduto d: lista ) {
			System.out.println(d.getCa().getNome()+" - "+d.getPro().getDescricao()+" - "+d.getCor().getNome()+" - "+d.getGen().getNome()+" - "+d.getTam().getNome());
		}
		
		
		/*
		List<Produto> lista = ps.listarTodos();
		
		for (Produto p: lista) {
			System.out.println(" id: "+p.getId()+ "\n Descrição: "+p.getDescricao()+"\n Status: "+p.isStatus());
			System.out.println("-----------------\n");
		}
		*/
		
		//Produto p = new Produto (001,"Shorts",true);
		//ps.atualizarProduto(p);
		
		//Produto p = new Produto (001,"Shorts",true);
		//ps.excluirProduto(p);
		

	}

}
