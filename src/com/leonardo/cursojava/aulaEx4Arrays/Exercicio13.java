package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
//		Ex 25
		Scanner scan = new Scanner(System.in);		
		System.out.println("*Exercicio 25*");
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite o elemento " + i + " do vetor:");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] % 2 == 0) {
				vetorB[i] = 1;
			}else {
				vetorB[i] = 0;
			}
		}
		
		System.out.print("Vetor A: ");
		for(int a=0; a<vetorA.length; a++) {
			System.out.print(vetorA[a] + " ");
		}
		
		System.out.print("\nVetor B: ");
		for(int b=0; b<vetorB.length; b++) {
			System.out.print(vetorB[b] + " ");
		}
		
		
//		Ex 26
		System.out.println("\n\n*Exercicio 26*");
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[B.length];
		
		for(int i=0; i<A.length; i++) {
			System.out.println("Digite o elemento " + i + " do vetor A:");
			A[i] = scan.nextInt();
			System.out.println("Digite o elemento " + i + " do vetor B:");
			B[i] = scan.nextInt();
			
			if(A[i] > B[i]) {
				C[i] = 1;
			}else if (A[i] == B[i]) {
				C[i] = 0;
			}else if (A[i] < B[i]) {
				C[i] = -1;
			}
			
		}
		
		System.out.print("Vetor A: ");
		
		for(int a=0; a<A.length; a++) {
			System.out.print(A[a] + " ");
		}
		
		System.out.print("\nVetor B: ");
		for(int b=0; b<B.length; b++) {
			System.out.print(B[b] + " ");
		}
		
		System.out.print("\nVetor C: ");
		for(int c=0; c<C.length; c++) {
			System.out.print(C[c] + " ");
		}
		
	}

}
