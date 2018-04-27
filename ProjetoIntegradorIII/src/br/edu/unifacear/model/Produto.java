package br.edu.unifacear.model;

public class Produto {
	private int id_produto;
	private String nome_produto;
	private boolean status_produto;

	
	public Produto(int id_produto, String nome_produto, boolean status_produto) {
		super();
		
		this.id_produto = id_produto;
		this.nome_produto = nome_produto;
		this.status_produto = status_produto;
	
	}

	public Produto() {
		
	}

	public int getId() {
		return id_produto;
	}

	public void setId(int id) {
		this.id_produto = id;
	}

	public String getDescricao() {
		return nome_produto;
	}

	public void setDescricao(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public boolean isStatus() {
		return status_produto;
	}

	public void setStatus(boolean status_produto) {
		this.status_produto = status_produto;
	}
		

}
