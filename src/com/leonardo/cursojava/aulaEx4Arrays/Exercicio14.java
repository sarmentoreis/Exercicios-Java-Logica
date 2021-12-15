package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
//		Ex 27
		System.out.println("*Exercicio 27*");
		Scanner scan = new Scanner(System.in);	
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o elemento " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
				
			}else if (vetorA[i] == 7) {
				vetorB[i] = 'b';
				
			}else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
				
			}else if (vetorA[i] == 10) {
				vetorB[i] = 'd';
				
			}else if (vetorA[i] > 10) {
				vetorB[i] = 'e';
			}
		}
		
		System.out.print("Vetor A: ");
		for(int x=0; x<vetorA.length; x++) {
			System.out.print(vetorA[x] +" ");
		}
		
		System.out.print("\nVetor B: ");
		for(int x=0; x<vetorB.length; x++) {
			System.out.print(vetorB[x] +" ");
		}
		
		
		
//		Ex 28
		System.out.println("\n\n*Exercicio 28*");
		int[] progressivo = new int[10];
		int[] regressivo = new int[progressivo.length];
		
		
		for(int a=0, z=(regressivo.length-1); a<progressivo.length; a++,z--) {						
			System.out.println("Entre com o elemento " + a + ", vetor A: ");
			progressivo[a] = scan.nextInt();
			regressivo[z] = progressivo[a];			
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i<progressivo.length; i++) {
			System.out.print(progressivo[i] + " ");
		}
		
		System.out.print("\nVetor B: ");
		for(int i=0; i<progressivo.length; i++) {
			System.out.print(regressivo[i] + " ");
		}
	}

}
