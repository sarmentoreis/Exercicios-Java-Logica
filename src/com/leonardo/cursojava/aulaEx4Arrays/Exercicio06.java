package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
//		Ex 10
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 10* \n");
		
		int[] vetorA = new int [5];
		int[] vetorB = new int [vetorA.length];
		
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite o elemento " + (i+1) +" do vetor A:");
			vetorA[i] = scan.nextInt();			
			vetorB[i] = vetorA[i] % 2;
			
		}
		
		System.out.print("Vetor A: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorA[y]+ " ");
		}
		System.out.print("\nVetor B: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorB[y]+ " ");
		}
		
//		Ex 11
		System.out.println("\n\n*Exercicio 11* \n");
		
		int[] vetorPares = new int [10];
		int[] pares = new int [vetorPares.length];
		int cont = 0;
		
		for(int i=0; i<vetorPares.length; i++) {
			System.out.println("Digite o elemento " + (i+1) +" do vetor:");
			vetorPares[i] = scan.nextInt();
		}

		for(int y=0; y<vetorPares.length; y++) {
			if (vetorPares[y] % 2 == 0) {
				pares[y] = vetorPares[y];
				cont++;
			}
		}
		
		System.out.println("Qtd de numeros pares: " + cont);
		System.out.println("Pares: ");
		for(int x=0; x<pares.length; x++) {
			System.out.print(pares[x] +" ");
		}
	}

}
