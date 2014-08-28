package br.com.wendel.funcionalidades;

public class Caracteristica {
	
	protected String id;
	protected String nome;
	
	public Caracteristica(String id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	public String getId(){
		return this.id;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
}
