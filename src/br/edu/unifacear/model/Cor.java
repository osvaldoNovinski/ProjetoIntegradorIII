package br.edu.unifacear.model;

public class Cor {
	
	private int id_cor;
	private String nome_cor;
	private boolean status_cor;
	
public Cor (int id_cor, String nome_cor, boolean status_cor) {
	
	super();
	
	this.id_cor = id_cor;
	this.nome_cor = nome_cor;
	this.status_cor = status_cor;
	
}

public Cor () {
	
}
	public int getId() {
		return id_cor;
	}
	public void setId(int id_cor) {
		this.id_cor = id_cor;
	}
	public String getNome() {
		return nome_cor;
	}
	public void setNome(String nome_cor) {
		this.nome_cor = nome_cor;
	}

	public boolean isStatus() {
		return status_cor;
	}

	public void setStatus(boolean status_cor) {
		this.status_cor = status_cor;
	}
	
	
	

}
