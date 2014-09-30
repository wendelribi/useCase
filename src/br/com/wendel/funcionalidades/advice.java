package br.com.wendel.funcionalidades;

public class advice extends CasoDeUso {
	
	private String tipo;
	private String pontocorte;
		
	public String getTipo() {
		return tipo;
	}
	public void setType(String tipo) {
		this.tipo = tipo;
	}	
	public String getPontoCorte(){
		return this.pontocorte;
	}
	
	public void setPontoCorte(String pontocorte){
		this.pontocorte = pontocorte;
	}
	
}
