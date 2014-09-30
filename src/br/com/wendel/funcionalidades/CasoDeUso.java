package br.com.wendel.funcionalidades;
import java.util.ArrayList;

public class CasoDeUso{
	protected String id;
	protected String nome;
	protected String descricao;
	protected ArrayList<Fluxo> listaDeFluxo = new ArrayList<Fluxo>();
		
//	public CasoDeUso() {
//		this.id = null;
//		this.nome = null;
//		this.descricao = null;
//		this.listaDeFluxo = null;
//	}
	
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
