package br.com.wendel.funcionalidades;

import java.util.ArrayList;

public class Caracteristica {
	
	private String id;
	private String nome;
	protected ArrayList<CasoDeUso> listaDeCasos = new ArrayList<CasoDeUso>();
	protected ArrayList<Aspecto> listaAspectos = new ArrayList<Aspecto>();
	
	public Caracteristica(String id, String nome){
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<CasoDeUso> getListaDeCasos() {
		return listaDeCasos;
	}

	public void setListaDeCasos(CasoDeUso casos) {
		this.listaDeCasos.add(casos);
	}

	public ArrayList<Aspecto> getListaAspectos() {
		return listaAspectos;
	}

	public void setListaAspectos(Aspecto aspecto) {
		this.listaAspectos.add(aspecto);
	}
	
	
	
	
}
