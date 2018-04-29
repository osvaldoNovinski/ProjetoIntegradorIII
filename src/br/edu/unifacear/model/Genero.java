package br.edu.unifacear.model;

public class Genero {
	
	private int id_gen;
	private String nome_gen;
	private boolean status_gen;
	
public Genero(int id_gen, String nome_gen, boolean status_gen) {
	super ();
	this.id_gen = id_gen;
	this.nome_gen = nome_gen;
	this.status_gen = status_gen;
}

public Genero () {
	
}

public int getId() {
	return id_gen;
}

public void setId(int id_gen) {
	this.id_gen = id_gen;
}

public String getNome() {
	return nome_gen;
}

public void setNome(String nome_gen) {
	this.nome_gen = nome_gen;
}

public boolean isStatus() {
	return status_gen;
}

public void setStatus(boolean status_gen) {
	this.status_gen = status_gen;
}



}
