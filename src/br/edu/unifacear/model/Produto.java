package br.edu.unifacear.model;

public class Produto {
	private int id_produto;
	private String nome_produto;
	private int qtda_produto;
	private Tamanho tamanho;
	private Cor cor;
	private Categoria categoria;
	private Genero genero;
	private boolean status_produto;
	private float volume;
	private float peso;
	private Unidade unidade;
	
	
	
	public Produto(int id_produto, String nome_produto, boolean status_produto,int qtda_produto,Categoria categoria, Cor cor, Genero genero, float volume, float peso, Unidade unidade, Tamanho tamanho) {
		super();
		this.id_produto = id_produto;
		this.nome_produto = nome_produto;
		this.status_produto = status_produto;
		this.qtda_produto = qtda_produto;
		this.categoria = categoria;
		this.cor = cor;
		this.genero = genero;
		this.volume = volume;
		this.peso = peso;
		this.unidade = unidade;
		this.tamanho = tamanho;
		
		
		
		
		
		
		
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public Tamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public boolean isStatus_produto() {
		return status_produto;
	}
	public void setStatus_produto(boolean status_produto) {
		this.status_produto = status_produto;
	}
	public int getQtda_produto() {
		return qtda_produto;
	}
	public void setQtda_produto(int qtda_produto) {
		this.qtda_produto = qtda_produto;
	}
	public Unidade getUnidade() {
		return unidade;
	}
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}	
}
