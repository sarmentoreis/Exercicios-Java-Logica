package com.leonardo.cursojava.aulaEx5Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
//		Ex 04 e 05
		Scanner scan = new Scanner(System.in);
		boolean fim = false;
		byte selecao = -1;
		String[][][] compromissos = new String[12][31][8];
		int mes = 1;
		int dia = 1;
		int hora = 0;
		String nota = "";
		
		while (!fim) {
			
			
			System.out.println("\nAgenda");
			System.out.println("\n\n1 - Agendar compromisso\n"
							 + "2 - Consultar compromisso\n"
							 + "0 - Sair\n\n");
			
			selecao = scan.nextByte();
			
			
			
			if(selecao == 0) {
				fim = true;
				System.out.println("Ate logo!");
			}
			else if (selecao == 1) {
				
				boolean dataValida = false;
				while (!dataValida) {
					System.out.println("Digite o mes a ser acessado");
					mes = scan.nextInt();
					System.out.println("Digite o dia a ser acessado: ");
					dia = scan.nextInt();
					System.out.println("Digite a hora a ser acessada: ");
					hora = scan.nextInt();
					
					if((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12) && (hora >=0 && hora < 9)) {
						dataValida = true;
					}else {
						System.out.println("Data invalida!\n");
					}
				}

				System.out.println("Escreva o compromisso nessa data: ");
				scan.nextLine();
				nota = scan.nextLine();			
				compromissos[--mes][--dia][--hora] = nota;			
				
			}else if (selecao == 2) {
				System.out.println("Digite o mes a ser acessado");
				mes = scan.nextInt();
				System.out.println("Digite o dia a ser acessado: ");
				dia = scan.nextInt();
				System.out.println("Digite a hora a ser acessada: ");
				hora = scan.nextInt();
				
				if(compromissos[--mes][--dia][--hora] != null)
					System.out.println("\nMes: "+ (mes+1)
									+  "\nDia: "+ (dia+1) 
									+  "\nHora: "+ (hora+1)+ "h"
									+  "\nCompromisso: " + compromissos[mes][dia][hora]);
				else {
					System.out.println("\nMes: "+ mes
									+  "\nDia: "+ dia 
									+  "\nHora: "+ hora + "h"
									+  "\nCompromisso: Nao ha compromisso nessa data");
				}
			}else {
				System.out.println("Opcao invalida, digite novamente.");
			}
			
		}
	}

}
