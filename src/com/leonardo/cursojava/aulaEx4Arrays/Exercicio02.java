package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
//		Ex 2
		
		System.out.println("*Exercicio 2*\n");
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int [8];
		int[] vetorB = new int [vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + " :");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.print("Vetor A: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorA[y]+ " ");
		}
		System.out.print("\nVetor B: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorB[y]+ " ");
		}
		
		
//		Ex 3
		System.out.println("\n\n*Exercicio 3* \n");
		
		int[] vetorC = new int [15];
		int[] vetorD = new int [vetorC.length];
		
		for(int i=0; i<vetorC.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + " :");
			vetorC[i] = scan.nextInt();
			vetorD[i] = vetorC[i] * vetorC[i];
		}
		
		System.out.print("Vetor C: ");
		for(int y=0; y<vetorC.length; y++) {
			System.out.print(vetorC[y]+ " ");
		}
		System.out.print("\nVetor D: ");
		for(int y=0; y<vetorC.length; y++) {
			System.out.print(vetorD[y]+ " ");
		}
	}

}
