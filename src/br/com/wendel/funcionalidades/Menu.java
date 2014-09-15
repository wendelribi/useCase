package br.com.wendel.funcionalidades;

import java.util.Scanner;

public class Menu {
	Scanner sc;
	
	void menuInicial(){
		System.out.println("\n==========================================");
		System.out.println("Sistema de Gerenciamento de casos de uso");
		System.out.println("Informe um numero");
		System.out.println("[1] Adicionar um novo Caso de Uso");
		System.out.println("[2] Pesquisar um Caso de Uso");
		System.out.println("[3] sair");
		
		sc = new Scanner(System.in);
		int op = sc.nextInt();
		Menu menu = new Menu();
		
		
		switch (op) {
			case 1:
				menu.incluirCasoDeUso();
				break;
			//TODO: Implementar metodo pesquisarCasoDeUso()
			//case 2:
				//menu.pesquisarCasoDeUso();
				//break;
			
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Opção invalida");
				menuInicial();
				break;
		}
	}
	
	
	Passo incluirPasso(){
		System.out.println("\n==========");
		System.out.println("Novo Passo");
		System.out.println("==========");
		
		sc = new Scanner(System.in);
		Passo passo = new Passo();

		System.out.println("Infome um Id: ");
		String id = sc.next();
		
		System.out.println("Infome uma ação: ");
		String acao = sc.next();
		
		System.out.println("Infome uma Condição: ");
		String condicao = sc.next();
		
		System.out.println("Infome uma Resposta: ");
		String resposta = sc.next();
		
		passo.setId(id);
		passo.setAcao(acao);
		passo.setCondicao(condicao);
		passo.setResposta(resposta);
		
		return passo;
	}
	
	Fluxo incluirFluxo(){
		sc = new Scanner(System.in);
		Fluxo fluxo = new Fluxo();
		
		System.out.println("\n==========");
		System.out.println("Novo Fluxo");
		System.out.println("==========");
		System.out.println("Infome um Id: ");
		String id = sc.next();
		
		System.out.println("Infome uma Nome: ");
		String nome = sc.next();
		
		System.out.println("Infome uma Descrição: ");
		String descricao = sc.next();
		
		System.out.println("Infome uma toStep: ");
		String toStep = sc.next();
		
		System.out.println("Infome uma fromStep: ");
		String fromStep = sc.next();

		Boolean a = true;
		while (a){
			System.out.println("Gostaria de Adicionar um novo Passo?");
			System.out.println("[1] SIM");
			System.out.println("[2] NAO");
			
			int op = sc.nextInt();
			
			if(op == 1){
				Passo passo = incluirPasso();
				fluxo.setListaDePassos(passo);
				int i  = fluxo.getListaDePassos();
				System.out.println(i);
			}
			else {
				a = false;
			}
		}
		fluxo.setId(id);
		fluxo.setNome(nome);
		fluxo.setDescricao(descricao);
		fluxo.setToStep(toStep);
		fluxo.setFromStep(fromStep);
		
		return fluxo;
	}
	
	
	CasoDeUso incluirCasoDeUso(){
		System.out.println("\n====================");
		System.out.println("Novo Caso De uso");
		System.out.println("====================");
		sc = new Scanner(System.in);
		CasoDeUso caso = new CasoDeUso();

		System.out.println("Infome um Id: ");
		String id = sc.next();
		
		System.out.println("Infome uma Nome: ");
		String nome = sc.next();
		
		System.out.println("Infome uma Descrição: ");
		String descricao = sc.next();
		
		
		Boolean a = true;
		
		while (a){
			System.out.println("Gostaria de incluir um novo Fluxo?");
			System.out.println("[1] SIM");
			System.out.println("[2] NAO");
			int op = sc.nextInt();
			if (op == 1){
				Fluxo fl = incluirFluxo();
				caso.incluirFluxo(fl);
			}
			else{
				a = false;
			}
		}
		caso.setId(id);
		caso.setNome(nome);
		caso.setDescricao(descricao);

		menuInicial();
		return caso;
	}
}
