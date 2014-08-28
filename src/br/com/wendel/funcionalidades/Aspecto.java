package br.com.wendel.funcionalidades;

public class Aspecto {
	protected String id;
	protected String nome;
	public Aspecto(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	
}
