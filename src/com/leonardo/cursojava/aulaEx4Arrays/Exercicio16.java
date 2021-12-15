package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

	
//		Ex 31
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 31*");
	
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o elemento " + i + " do vetor: ");
			vetorA[i] = scan.nextInt();
		}
		
		int posB = 0;
		
		for(int x=0; x<vetorA.length; x++) {
			if(vetorA[x] % 2 == 0) {
				vetorB[posB] = vetorA[x];
				posB++;
			}
		}
		
		for(int x=0; x<vetorA.length; x++) {
			if(vetorA[x] % 2 != 0) {
				vetorB[posB] = vetorA[x];
				posB++;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.print("\nVetor B: ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		
		
//		Ex 32
		System.out.println("\n\n*Exercicio 32*");
		int[] valores = new int[5];
		int[] tabuada = new int[10];
		
		for(int i=0; i<valores.length; i++) {
			System.out.println("Entre com o elemento " + i + " do vetor:");
			valores[i] = scan.nextInt();			
		}
		
		System.out.println("\n--Tabuada--\n");
		
		for(int x = 0; x<valores.length; x++) {
			
			for(int y=0; y<tabuada.length; y++) {
				tabuada[y] = valores[x] * (y+1);
				System.out.println(valores[x] + " X " + (y+1) + " = "+ tabuada[y]);
			}
			System.out.println("-------------------------");
		}
	}

}
