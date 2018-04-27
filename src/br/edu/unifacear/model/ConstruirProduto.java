package br.edu.unifacear.model;

public class ConstruirProduto {
	
	private Produto pro;
	private Categoria ca;
	private Tamanho tam;
	private Genero gen;
	private Cor cor;
	

	public ConstruirProduto(Produto pro, Categoria ca, Tamanho tam, Genero gen, Cor cor) {
		super();
		this.pro = pro;
		this.ca = ca;
		this.tam = tam;
		this.gen = gen;
		this.cor = cor;
	}


	public Produto getPro() {
		return pro;
	}







	public void setPro(Produto pro) {
		this.pro = pro;
	}







	public Categoria getCa() {
		return ca;
	}







	public void setCa(Categoria ca) {
		this.ca = ca;
	}







	public Tamanho getTam() {
		return tam;
	}







	public void setTam(Tamanho tam) {
		this.tam = tam;
	}







	public Genero getGen() {
		return gen;
	}







	public void setGen(Genero gen) {
		this.gen = gen;
	}







	public Cor getCor() {
		return cor;
	}







	public void setCor(Cor cor) {
		this.cor = cor;
	}







	public ConstruirProduto () {
		
	}


}
