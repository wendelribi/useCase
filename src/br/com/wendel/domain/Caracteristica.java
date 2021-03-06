package br.com.wendel.domain;

import java.util.ArrayList;

public class Caracteristica {
	
	private String id;
	private String nome;
	protected ArrayList<CasoDeUso> listaDeCasos = new ArrayList<CasoDeUso>();
	protected ArrayList<Aspecto> listaAspectos = new ArrayList<Aspecto>();
	
        public Caracteristica(){
        }
        
	public Caracteristica(String id, String nome){
		this.id = id;
		this.nome = nome;
	}
        
        public Caracteristica(String id, String nome, CasoDeUso caso){
		this.id = id;
		this.nome = nome;
                this.listaDeCasos.add(caso);
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

	public void setListaDeCasos(CasoDeUso caso) {
		this.listaDeCasos.add(caso);
	}

	public ArrayList<Aspecto> getListaAspectos() {
		return listaAspectos;
	}

	public void setListaAspectos(Aspecto aspecto) {
		this.listaAspectos.add(aspecto);
	}
	
	
	
	
}
