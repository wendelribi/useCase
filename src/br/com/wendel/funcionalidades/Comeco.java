package br.com.wendel.funcionalidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Comeco {
		
	
	public static void main(String[] args) {
		System.out.println("Sistema de Gerenciamento de casos de uso");
		System.out.println("========================================");
		
		Menu menu = new Menu();
		menu.incluirCasoDeUso();
		System.out.println(menu);
		
		System.out.println("Terminou");
	}

}
