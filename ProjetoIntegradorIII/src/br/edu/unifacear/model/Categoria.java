package br.edu.unifacear.model;

public class Categoria {
	
	private int id;
	private String nome;
	private boolean status;
	
	
public Categoria (int id, String nome, boolean status) {
	super();
	this.id = id;
	this.nome = nome;
	this.status = status;
}

public Categoria () {
	
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
