package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		Ex 4
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 4* \n");
		
		int[] vetorC = new int [15];
		int[] vetorD = new int [vetorC.length];
		
		for(int i=0; i<vetorC.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + " :");
			vetorC[i] = scan.nextInt();
			vetorD[i] = (int) Math.sqrt(vetorC[i]);
		}
		
		System.out.print("Vetor C: ");
		for(int y=0; y<vetorC.length; y++) {
			System.out.print(vetorC[y]+ " ");
		}
		System.out.print("\nVetor D: ");
		for(int y=0; y<vetorC.length; y++) {
			System.out.print(vetorD[y]+ " ");
		}
		
		
//		Ex 5
		System.out.println("\n\n*Exercicio 5* \n");
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [vetorA.length];
		
		for(int y=0; y<vetorA.length; y++) {
			System.out.println("Digite o elemento " + (y+1) + " :");
			vetorA[y] = scan.nextInt();
			vetorB[y] = vetorA[y] * y;
		}
		
		System.out.print("Vetor A: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorA[y]+ " ");
		}
		System.out.print("\nVetor B: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorB[y]+ " ");
		}
	}

}
