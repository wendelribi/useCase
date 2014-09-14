package br.com.wendel.funcionalidades;

import java.util.Scanner;

public class Menu {
	
	Scanner sc;
	
	Passo incluirPasso(){
		System.out.println("\n Novo Passo\n");
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
		Boolean a = true;
		sc = new Scanner(System.in);
		Fluxo fluxo = new Fluxo();
		System.out.println("\n Novo Fluxo \n");
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
		System.out.println("\nNovo Caso De uso\n");
		sc = new Scanner(System.in);
		CasoDeUso caso = new CasoDeUso();

		System.out.println("Infome um Id: ");
		String id = sc.next();
		
		System.out.println("Infome uma Nome: ");
		String nome = sc.next();
		
		System.out.println("Infome uma Descrição: ");
		String descricao = sc.next();
		
		Fluxo fl = incluirFluxo();
		
		caso.setId(id);
		caso.setNome(nome);
		caso.setDescricao(descricao);
		caso.incluirFluxo(fl);;
		
		return caso;
	}
}
