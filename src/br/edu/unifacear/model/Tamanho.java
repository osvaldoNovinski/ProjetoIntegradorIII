package br.edu.unifacear.model;

public class Tamanho {
	
	private int id_tam;
	private String nome_tam;
	private boolean status_tam;
	
	
public Tamanho (int id_tam, String nome_tam, boolean status_tam) {
	super ();
	this.id_tam = id_tam;
	this.nome_tam = nome_tam;
	this.status_tam = status_tam;
}

public Tamanho() {
	
}

public int getId() {
	return id_tam;
}

public void setId(int id_tam) {
	this.id_tam = id_tam;
}

public String getNome() {
	return nome_tam;
}

public void setNome(String nome_tam) {
	this.nome_tam = nome_tam;
}

public boolean isStatus() {
	return status_tam;
}

public void setStatus(boolean status_tam) {
	this.status_tam = status_tam;
}



}
