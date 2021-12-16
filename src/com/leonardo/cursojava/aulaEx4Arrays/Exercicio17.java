package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
//		Ex 33
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 33*");
		int[] vetorA = new int[5];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o elemento " + i + " do vetor: ");
			vetorA[i] = scan.nextInt();
		}
		
		boolean primo;
		String msg;
		System.out.println("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			
			primo = true;
			
			for(int j=2; j<vetorA[i];j++) {
				if(vetorA[i] % j == 0) {
					primo = false;	
					break;
				}
			}
			
			msg = "";
			if(primo) {
				msg = " E primo.";
			}else {
				msg = " Nao e primo.";
			}
			
			System.out.println(vetorA[i] + msg);
			
		}
		
		
//		Ex 34
		System.out.println("\n\n*Exercicio 34*");
		int[] vetor = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Entre com o elemento " + i +":");
			vetor[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetor.length; i++) {
			
			System.out.print(vetor[i] + ", Pares -> ");
			
			for(int j=2; j<vetor[i]; j++) {
				if(j % 2 == 0) {
					System.out.print(j + " ");
				}
			}
			
			System.out.println();
		}
	}

}
