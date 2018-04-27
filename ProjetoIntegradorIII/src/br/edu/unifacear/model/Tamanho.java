package br.edu.unifacear.model;

public class Tamanho {
	
	private int id;
	private String nome;
	private boolean status;
	
	
public Tamanho (int id, String nome, boolean status) {
	super ();
	this.id = id;
	this.nome = nome;
	this.status = status;
}

public Tamanho() {
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}



}
