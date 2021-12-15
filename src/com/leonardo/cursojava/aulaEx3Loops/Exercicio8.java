package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

//		Ex 23
		System.out.println("Loja Quase Dois - Tabela de precos");
		double preco = 1.99;
		for(int i=0; i<50; i++) {
			System.out.println((i+1)+" - R$" + preco);
			preco += 1.99; 
		}
		
//		Ex 24
		Scanner scan = new Scanner(System.in);
		System.out.println("\nInforme o preco do pao: ");		
		double precoPao = scan.nextDouble();
		double totalPao = precoPao;
		System.out.println("Panificadora Pao de Ontem - Tabela de precos");
		
		for(int i=0; i<50; i++) {
			System.out.println((i+1)+" - R$" + totalPao);
			totalPao += precoPao;
		}
	}

}
