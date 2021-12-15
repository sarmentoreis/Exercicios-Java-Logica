package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
//		Ex 20/21
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 20/21*");
		double[] vetorA = new double[20];
		double cotacao = 0;
		
		System.out.println("Entre com a cotacao do dolar: ");
		cotacao = scan.nextDouble();
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " - ");
		}
		
//		Ex 22
		
		System.out.println("\n\n*Exercicio 22*");
		int[] vetor = new int[10];
		int qtd0 = 0;
		int qtd1 = 0;
		
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = (int)Math.round(Math.random() * 1);	
			
			if(vetor[i] == 0 ) {
				qtd0++;
			}else {
				qtd1++;
			}
		}
		
		double porc0 = (qtd0 * 100) / vetor.length;
		double porc1 = (qtd1 * 100) / vetor.length;
		
		System.out.print("Vetor: ");
		for(int x=0; x<vetor.length; x++) {
			System.out.print(vetor[x]+" ");
		}
		
		System.out.println("\nPorcentagem 0: " + porc0);
		System.out.println("Porcentagem 1: " + porc1);
		
		
	}

}
