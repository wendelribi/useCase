package br.com.wendel.funcionalidades;
import java.util.ArrayList;

public class CasoDeUso{
	private String id;
	private String nome;
	private String descricao;
	private ArrayList<Fluxo> listaDeFluxo = new ArrayList<Fluxo>();
		
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
	public void incluirFluxo(Fluxo fluxo) {
		this.listaDeFluxo.add(fluxo);
	}
	

}
