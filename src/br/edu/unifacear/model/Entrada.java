package br.edu.unifacear.model;

import java.util.Date;

public class Entrada {
	
	private int id_entrada;
	private Date data_entrada;
	private int qtda_entrada;
	
	
	public Entrada(int id_entrada, Date data_entrada, int qtda_entrada) {
		super();
		this.id_entrada = id_entrada;
		this.data_entrada = data_entrada;
		this.qtda_entrada = qtda_entrada;
	}
	
	public Entrada () {
		
	}
	
	
	public int getId_entrada() {
		return id_entrada;
	}


	public void setId_entrada(int id_entrada) {
		this.id_entrada = id_entrada;
	}


	public Date getData_entrada() {
		return data_entrada;
	}


	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}


	public int getQtda() {
		return qtda_entrada;
	}


	public void setQtda(int qtda_entrada) {
		this.qtda_entrada = qtda_entrada;
	}	

}
