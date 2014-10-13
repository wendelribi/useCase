package br.com.wendel.domain;
import java.util.ArrayList;

public class CasoDeUso{
	protected String id;
	protected String nome;
	protected String descricao;
	protected ArrayList<Fluxo> listaDeFluxo = new ArrayList<Fluxo>();
	
        public CasoDeUso(String id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
        
	public CasoDeUso(String id, String nome, String descricao, Fluxo fluxo) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.listaDeFluxo.add(fluxo);
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

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Fluxo> getFluxo() {
		return listaDeFluxo;
	}
	public void setFluxo(Fluxo fluxo) {
		this.listaDeFluxo.add(fluxo);
	}
	

}
