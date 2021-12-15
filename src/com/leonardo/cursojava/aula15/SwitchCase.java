package com.leonardo.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Digite um dia da semana (1-7)");
		
		Scanner scan = new Scanner(System.in);
		
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1:
				System.out.println("Domingo");
			break;
		case 2:
				System.out.println("Segunda");
			break;
		case 3:
				System.out.println("Terca");
			break;
		case 4:
				System.out.println("Quarta");
			break;
		case 5:
				System.out.println("Quinta");
			break;
		case 6:
				System.out.println("Sexta");
			break;
		case 7:
				System.out.println("Sabado");
			break;
		default:
				System.out.println("Nao e um dia de semana valido");
			break;
		}
		
		switch (diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
				System.out.println("Dia util");
			break;
		case 1:
		case 7:
				System.out.println("Fim de semana");
			break;
		default:
				System.out.println("Nao e um dia de semana valido");
			break;
		}
		
	}

}
