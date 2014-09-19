package br.com.wendel.funcionalidades;

public class Dialogo {

	public void id(){
		System.out.println("Infome um Id: ");
	}
	
	public void nome(){
		System.out.println("Infome um Nome: ");
	}
	
	public void descricao(){
		System.out.println("Infome uma Descrição: ");
		
	}
	
	public void principal(){
		System.out.println("\n========================================");
		System.out.println("Sistema de Gerenciamento de casos de uso");
		System.out.println("========================================\n");

		System.out.println("Informe um numero\n");
		System.out.println("[1] Adicionar um novo Caso de Uso");
		System.out.println("[2] Pesquisar um Caso de Uso");
		System.out.println("[3] sair");
	}
	
	public void fluxo(){
		System.out.println("\n==========");
		System.out.println("Novo Fluxo");
		System.out.println("==========\n");
	}
	
	public void passo(){
		System.out.println("\n==========");
		System.out.println("Novo Passo");
		System.out.println("==========\n");
	}
	
	public void novoPasso(){
		System.out.println("\nGostaria de Adicionar um novo Passo?");
		System.out.println("[1] SIM");
		System.out.println("[2] NAO");
	}

	public void novoCaso(){
		System.out.println("\n====================");
		System.out.println("Novo Caso De uso");
		System.out.println("====================\n");
	}
	
	public void novoFluxo(){
		System.out.println("\nGostaria de adcionar um novo Fluxo?");
		System.out.println("[1] SIM");
		System.out.println("[2] NAO");
	}
}
