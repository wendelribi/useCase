package br.com.wendel.domain;


public class Aspecto extends CasoDeUso {
	private String pontodecorte;
	private String tipo;
	
	public Aspecto(String id, String nome, String descricao, String pontodecorte, String tipo) {
		super(id, nome, descricao);
		this.pontodecorte = pontodecorte;
		this.tipo = tipo;
	}
	
	public Aspecto(String id, String nome, String descricao, String pontodecorte, String tipo, Fluxo fluxo) {
		super(id, nome, descricao, fluxo);
		this.pontodecorte = pontodecorte;
		this.tipo = tipo;
	}

	public String getPontodecorte() {
		return pontodecorte;
	}

	public void setPontodecorte(String pontodecorte) {
		this.pontodecorte = pontodecorte;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
