package br.edu.unifacear.model;

public class Categoria {
	
	private int id_cat;
	private String nome_cat;
	private boolean status_cat;
	
	
public Categoria (int id_cat, String nome_cat, boolean status_cat) {
	super();
	this.id_cat = id_cat;
	this.nome_cat = nome_cat;
	this.status_cat = status_cat;
}

public Categoria () {
	
}

public int getId() {
	return id_cat;
}

public void setId(int id_cat) {
	this.id_cat = id_cat;
}

public String getNome() {
	return nome_cat;
}

public void setNome(String nome_cat) {
	this.nome_cat = nome_cat;
}

public boolean isStatus() {
	return status_cat;
}

public void setStatus(boolean status_cat) {
	this.status_cat = status_cat;
}

}
