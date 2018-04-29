package br.edu.unifacear.model;

public class Unidade {
	
	private int id_un;
	private String nome_un;
	private boolean status_un;
	
	
	public Unidade(int id_un, String nome_un, boolean status_un) {
		super();
		this.id_un = id_un;
		this.nome_un = nome_un;
		this.status_un = status_un;
	}
	public Unidade () {
		
	}


	public int getId_un() {
		return id_un;
	}


	public void setId_un(int id_un) {
		this.id_un = id_un;
	}


	public String getNome_un() {
		return nome_un;
	}


	public void setNome_un(String nome_un) {
		this.nome_un = nome_un;
	}


	public boolean isStatus_un() {
		return status_un;
	}


	public void setStatus_un(boolean status_un) {
		this.status_un = status_un;
	}
	

}
