package br.com.wendel.funcionalidades;
import java.util.ArrayList;
import java.util.Scanner;

public class Criar {
	private Scanner sc;
	private int h=0;
	
	public void fluxo(){
		
		String[][] flow = new String[10][4];
		
		Fluxo step = new Fluxo("id", "Nome", "descricao", "fromStep", "toStep");
		
		sc = new Scanner(System.in);		
		
		System.out.println("Informe o id:");
		flow[h][0] = sc.next();
		System.out.println("Informe o nome:");
		flow[h][1] = sc.next();
		System.out.println("Informe a Descrição:");
		flow[h][2] = sc.next();
		System.out.println("Informe o setup:");		
		flow[h][3] = sc.next();
		
		step.setId(flow[h][0]);
		step.setNome(flow[h][1]);
		step.setDescricao(flow[h][2]);
		step.setSetup(flow[h][3]);
		h+=1;
		this.passo();
		
	}
	public void passo(){

		String[][] passos = new String[h][3];
		
		System.out.println("============================");
		System.out.println("Criar um passos para o fluxo");
		System.out.println("============================\n");
		
		Passo ps = new Passo("id", "action", "response");
		sc = new Scanner(System.in);
		
		System.out.println("Informe o id:");
		passos[h][0] = sc.next();
		
		System.out.println("Informe uma acao:");
		passos[h][1] = sc.next();
		
		System.out.println("Informe uma resposta:");
		passos[h][2] = sc.next();
		
		ps.setId(passos[h][0]);
		ps.setAction(passos[h][1]);
		ps.setResponse(passos[h][2]);
		System.out.println("Informe uma opção\n===================\n");
		System.out.println("[1] Criar um novo passo");
		System.out.println("[2] Salvar e sair");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			passo();
			break;
		case 2:
			System.exit(0);
		default:
			break;
		}
		
	}
}
