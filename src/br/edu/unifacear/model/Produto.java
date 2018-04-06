package br.edu.unifacear.model;

public class Produto {
	private int id;
	private String descricao;
	private boolean status;
	//private Marca marca;
	
	public Produto(int id, String descricao, boolean status) {
		super();
		
		this.id = id;
		this.descricao = descricao;
		this.status = status;
		//this.marca = marca ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	/*public Marca getMarca() {
		//new Marca(marca.getId(),marca.getDescricao(),marca.isStatus());
		return marca;
	}

	public void setMarca(Marca marca) {
		//new Marca(marca.getId(),marca.getDescricao(),marca.isStatus());
		this.marca = marca;
	}
	
	public Produto(int id, String descricao, boolean status) {
		super();
		
		this.id = id;
		this.descricao = descricao;
		this.status = status;
	}*/
	


		

}
