package br.edu.unifacear.model;

import java.util.Date;

public class Saida {
	
	private int id_saida;
	private Date data_saida;
	private int qtda_saida;
	
	
	public Saida(int id_saida, Date data_saida, int qtda_saida) {
		super();
		this.id_saida = id_saida;
		this.data_saida = data_saida;
		this.qtda_saida = qtda_saida;
	}
	
	public int getId_saida() {
		return id_saida;
	}
	public void setId_saida(int id_saida) {
		this.id_saida = id_saida;
	}
	public Date getData_saida() {
		return data_saida;
	}
	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}
	public int getQtda() {
		return qtda_saida;
	}
	public void setQtda(int qtda_saida) {
		this.qtda_saida = qtda_saida;
	}
	
	

}
