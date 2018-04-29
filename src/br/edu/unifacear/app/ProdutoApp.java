package br.edu.unifacear.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.dao.*;
import br.edu.unifacear.model.*;
import br.edu.unifacear.session.*;

public class ProdutoApp {

	public static void main(String[] args) {
		
		
		ProdutoSession ps = new ProdutoSession();		
		/*
		//alimentar tabela categoria
		CategoriaSession cs = new CategoriaSession();
		
		Categoria c = new Categoria (001, "Camisa", true);
		Categoria c2 = new Categoria (002, "Calça", true);
		Categoria c3 = new Categoria (003, "Meia", true);
		Categoria c4 = new Categoria (004, "Calção", true);
		
		cs.inserirCategoria(c);
		cs.inserirCategoria(c2);
		cs.inserirCategoria(c3);
		cs.inserirCategoria(c4);
		
		
		////alimentar tabela genero
		GeneroSession gs = new GeneroSession ();
		
		Genero g = new Genero (001, "Femenino",true);
		Genero g2 = new Genero (002, "Masculino",true);
		Genero g3 = new Genero (003, "Infantil",true);
		
		gs.inserirGenero(g);
		gs.inserirGenero(g2);
		gs.inserirGenero(g3);
		
		
		//alimentar tabela tamanho
		TamanhoSession ts = new TamanhoSession();
		
		Tamanho t = new Tamanho (001, "P",true);
		Tamanho t2 = new Tamanho (003, "M",true);
		Tamanho t3 = new Tamanho (002, "G",true);
		
		ts.inserirTamanho(t);
		ts.inserirTamanho(t2);
		ts.inserirTamanho(t3);
		
		
		////alimentar tabela cor
		CorSession cors = new CorSession();
		
		Cor cor = new Cor (001,"Azul", true);
		Cor cor2 = new Cor (002,"Vermelho", true);
		Cor cor3 = new Cor (003,"Amarelo", true);
		Cor cor4 = new Cor (004,"Preto", true);
		
		cors.inserirCor(cor);
		cors.inserirCor(cor2);
		cors.inserirCor(cor3);
		cors.inserirCor(cor4);
		
		
		//alimentar unidades de medida
		UnidadeSession uni = new UnidadeSession();
		Unidade un = new Unidade(001,"cm3",true);
		Unidade un2 = new Unidade(002,"polegada",true);
		Unidade un3 = new Unidade(003,"alquere",true);
		
		uni.inserirUnidade(un);
		uni.inserirUnidade(un2);
		uni.inserirUnidade(un3);
		*/
		
		
		
		//alimentar tabela produto
		
		Categoria ca = new Categoria();
		ca.setId(001);
		Cor co = new Cor();
		co.setId(001);
		Genero ge = new Genero();
		ge.setId(001);
		Unidade un = new Unidade();
		un.setId_un(001);
		Tamanho tam = new Tamanho();
		tam.setId(001);
		
		
		Produto p = new Produto (001,"Laicra",true,0,ca,co,ge,2,1,un,tam);
		
		ps.inserirProduto(p);
		
	

	}

}
