package br.edu.unifacear.model;

import java.sql.Date;

public class Funcionario {
	private int matricula;
	private String nome;
	private String cargo;
	private float salarioFixo;
	private int cpf;
	private int ctps;
	private int pis;
	private Date dataNasc;
	private Date dataAdmissao;
	private String endereco;
	private boolean status;
	
	public Funcionario () {}
	public Funcionario(int matricula, String nome, String cargo, float salarioFixo, int cpf, int ctps, int pis,
			Date dataNasc, Date dataAdmissao, String endereco, boolean status) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salarioFixo = salarioFixo;
		this.cpf = cpf;
		this.ctps = ctps;
		this.pis = pis;
		this.dataNasc = dataNasc;
		this.dataAdmissao = dataAdmissao;
		this.endereco = endereco;
		this.status = status;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(float salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCtps() {
		return ctps;
	}
	public void setCtps(int ctps) {
		this.ctps = ctps;
	}
	public int getPis() {
		return pis;
	}
	public void setPis(int pis) {
		this.pis = pis;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
