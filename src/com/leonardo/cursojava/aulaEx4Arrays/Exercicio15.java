package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
//		Ex 29
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 29*");
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length + vetorB.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o elemento " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
			System.out.println("Entre com o elemento " + i + " do vetor B: ");
			vetorB[i] = scan.nextInt();
			
		}
		
		
		for(int x=0; x<vetorA.length; x++) {
			vetorC[x] = vetorA[x];
		}
		for(int x=0,z=vetorA.length; x<vetorB.length; x++,z++) {
			vetorC[z] = vetorB[x];
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("\nVetor B: ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.print("\nVetor C: ");
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
	
		
//		Ex 30
		System.out.println("\n\n*Exercicio 30*");
		int[] A = new int[20];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		int posB = 0;
		int posC = 0;
		for(int i=0; i<A.length; i++) {
			System.out.println("Entre com o elemento " + i + " do vetor ->");
			A[i] = scan.nextInt();
			if(A[i] % 2 == 0) {
				B[posB] = A[i];
				posB++;
			}else {
				C[posC] = A[i];
				posC++;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.print("\nVetor B: ");
		for(int i=0; i<posB; i++) {
			System.out.print(B[i] + " ");
		}
		
		System.out.print("\nVetor C: ");
		for(int i=0; i<posC; i++) {
			System.out.print(C[i] + " ");
		}
		
	}

}
