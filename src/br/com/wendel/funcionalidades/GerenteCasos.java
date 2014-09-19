package br.com.wendel.funcionalidades;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenteCasos {
	Scanner sc;
	protected ArrayList<CasoDeUso> listaDeCasos = new ArrayList<CasoDeUso>();
	Dialogo dialogo = new Dialogo();
	
	void menuInicial(){
		dialogo.principal();
		
		sc = new Scanner(System.in);
		int op = sc.nextInt();

		switch (op) {
			case 1:
				incluirCasoDeUso();
				break;

			case 2:
				System.out.println("Digite um nome: ");
				String nome = sc.next();
				pesquisarCasoDeUso(nome);
				break;
			
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Opção invalida");
				menuInicial();
				break;
		}
	}
	
	
	public Passo incluirPasso(){
		dialogo.passo();
		
		sc = new Scanner(System.in);
		Passo passo = new Passo();

		dialogo.id();
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
	
	public Fluxo criarFluxo(){
		sc = new Scanner(System.in);
		Fluxo fluxo = new Fluxo();
		
		dialogo.id();
		String id = sc.next();
		
		dialogo.nome();
		String nome = sc.next();
		
		dialogo.descricao();
		String descricao = sc.next();
		
		System.out.println("Infome uma toStep: ");
		String toStep = sc.next();
		
		System.out.println("Infome uma fromStep: ");
		String fromStep = sc.next();

		Boolean a = true;
		while (a){
			dialogo.novoPasso();
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
	
	public void pesquisarCasoDeUso(String nome){
		
		for(CasoDeUso cass : listaDeCasos){
			if (nome.equals(cass.getId())){
				System.out.println("O usuario Existe");
				System.out.println(cass.getId());
				System.out.println(cass.getDescricao());
				System.out.println(cass.getNome());
				System.out.println(cass.getFluxo());
				ArrayList<Fluxo> fl = cass.getFluxo();
				for (Fluxo fluxo : fl){
					fluxo.getId();
					fluxo.getNome();
					fluxo.getDescricao();
				}
				System.out.println();
			}
			
			

		}
		menuInicial();
	}
	
	public void incluirCasoDeUso(){
		
		dialogo.novoCaso();
		
		sc = new Scanner(System.in);
		CasoDeUso caso = new CasoDeUso();

		dialogo.id();
		String id = sc.next();
		
		dialogo.nome();
		String nome = sc.next();
		
		dialogo.descricao();
		String descricao = sc.next();
		
		
		Boolean a = true;
		
		while (a){
			dialogo.novoFluxo();
			int op = sc.nextInt();
			if (op == 1){
				Fluxo fl = criarFluxo();
				caso.setFluxo(fl);
			}
			else{
				a = false;
			}
		}
		caso.setId(id);
		caso.setNome(nome);
		caso.setDescricao(descricao);
		listaDeCasos.add(caso);
		menuInicial();
	
	}

}
