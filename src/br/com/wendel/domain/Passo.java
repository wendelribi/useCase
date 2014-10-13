package br.com.wendel.domain;

public class Passo {
	private String id;
	private String acao;
	private String condicao;
	private String resposta;

    public Passo(String id, String acao, String condicao, String resposta) {
        this.id = id;
        this.acao = acao;
        this.condicao = condicao;
        this.resposta = resposta;
    }
        
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public String getCondicao() {
		return condicao;
	}
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	
}