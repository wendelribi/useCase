package br.com.wendel.funcionalidades;

public class Fluxo extends CasoDeUso{
	
	protected String fromStep;
	protected String toStep;
	
	public Fluxo(String id, String nome, String descricao, String fromStep, String toStep) {
		super(id, nome, descricao);
		this.fromStep = fromStep;
		this.toStep = toStep;
		
	}



}
