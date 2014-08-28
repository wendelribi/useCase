package br.com.wendel.funcionalidades;

public class Passo {
	protected String id;
	protected String action;
	protected String response;
	public Passo(String id, String action, String response) {
		super();
		this.id = id;
		this.action = action;
		this.response = response;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
}
