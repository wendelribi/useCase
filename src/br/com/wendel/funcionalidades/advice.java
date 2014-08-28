package br.com.wendel.funcionalidades;

public class advice {
	
	private String id;
	private String tipo;
	private String descricao;
	private String pontocorte;
	
	
	public advice(String id, String tipo, String descricao, String pontocorte) {
		this.id = id;
		this.tipo = tipo;
		this.descricao = descricao;
		this.pontocorte = pontocorte;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setType(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getPontoCorte(){
		return this.pontocorte;
	}
	
	public void setPontoCorte(String pontocorte){
		this.pontocorte = pontocorte;
	}
	
}
