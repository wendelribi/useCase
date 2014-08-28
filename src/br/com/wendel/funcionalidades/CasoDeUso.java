package br.com.wendel.funcionalidades;

public class CasoDeUso extends Caracteristica{
	protected String Descricao;
	protected String setup;
	
	public CasoDeUso(String id, String nome, String descricao){
		super(id, nome);
		this.Descricao = descricao;
	}
	
	public CasoDeUso(String id, String nome, String descricao, String setup) {
		super(id, nome);
		this.Descricao = descricao;
		this.setup = setup;
	}
	public String getDescription() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		this.Descricao = descricao;
	}
	public String getSetup() {
		return setup;
	}
	public void setSetup(String setup) {
		this.setup = setup;
	}

	
}
