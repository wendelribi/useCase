package br.com.wendel.funcionalidades;

import java.util.ArrayList;

public class Fluxo {
	
	private String id;
	private String nome;
	private String descricao;
	private String fromStep;
	private String toStep;
	private ArrayList<Passo> listaDePassos = new ArrayList<Passo>();
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFromStep() {
		return fromStep;
	}

	public void setFromStep(String fromStep) {
		this.fromStep = fromStep;
	}

	public String getToStep() {
		return toStep;
	}

	public void setToStep(String toStep) {
		this.toStep = toStep;
	}

	public int getListaDePassos() {
		return listaDePassos.size();
	}

	public void setListaDePassos(Passo passo) {
		this.listaDePassos.add(passo);
	}
	
	
}
