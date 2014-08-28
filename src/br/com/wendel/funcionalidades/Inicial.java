package br.com.wendel.funcionalidades;
import java.util.Scanner;


public class Inicial {
	private Scanner sc;
	CasoDeUso nc;
	public Inicial(){
		sc = new Scanner(System.in);
	}

	public static void main(String[] args){
		System.out.println("=======================================");
		System.out.println("Sistema para gerenciamento de casos uso");
		System.out.println("=======================================");

		System.out.println("\n");
		
		Inicial pb = new Inicial();
		
		pb.menuP();
	}

	
	public void criarCasoTeste(){
		String id;
		nc = new CasoDeUso("F1", "nome", "descricao");
		System.out.println("Informe um ID:\n");
		id = sc.next();
		nc.setId(id);
		
		System.out.println("Informe um Nome:\n");
		id = sc.next();
		nc.setNome(id);
		
		System.out.println("Informe uma Descricao:\n");
		id = sc.next();
		nc.setDescricao(id);
		
		System.out.println(nc.getId());
		System.out.println(nc.getNome());
		System.out.println(nc.getDescription());
		menuCaso();
	}
	
	
	
	public void menuP(){
		System.out.println("Informe o valor da opção desejada:");
		System.out.println(" [1] Criar caso te teste");
		System.out.println(" [2] Pesquisar por caso de testes");
		System.out.println(" [3] Sair");
		try{
			int opcao = sc.nextInt();
			
			switch (opcao) {
				case 1:
					criarCasoTeste();
					break;
		//		case 2:
		//			pesquisarCasoTeste();
		//			break;
				case 3:
					System.out.println("Saindo");
					System.exit(0);
					break;
				default:
					System.out.println("Não existe essa opção\n");
					menuP();
					break;
			}
		}
		catch (Exception e) {
			System.out.println("O valor informado não é um numero inteiro, tente novamente.");
			Inicial ex = new Inicial();
			ex.menuP();
			
		}
	}

	public void menuCaso(){
		System.out.println("[1] Criar um fluxo");
		System.out.println("[2] Sair e salvar");
		int opcao = sc.nextInt();
		
		switch (opcao){
			case 1:
				Criar criar = new Criar();
				criar.fluxo();
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Opcao invalida");
				menuCaso();
				break;
		}
	}
}
