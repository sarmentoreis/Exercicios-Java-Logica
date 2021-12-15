package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
//		Ex 23
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 23*");
		int[] vetorA = new int[10];
		boolean todosPar = true;
		
		
		for(int i=0; i<vetorA.length; i++) {
			if (todosPar) {
				System.out.println("Entre com o elemento " + (i+1) + ":");
				vetorA[i] = scan.nextInt();
				if(vetorA[i] % 2 != 0) {
					todosPar = false;
				}
			}
		}
		
		System.out.print("Vetor: ");
		for(int x=0; x<vetorA.length; x++) {
			System.out.print(vetorA[x] + " ");
		}
		
		
//		Ex 24
		
		System.out.println("*\n\nExercicio 24*");
		int[] vetor = new int[10];
		boolean isPalindromo = false;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Entre com o valor do elemento " + (i+1) +" ->");
			vetor[i] = scan.nextInt();
		}
		
		
		for(int a=0, z=(vetor.length-1); a<vetor.length; a++,z--) {						
			if(vetor[a] == vetor[z]) {
				isPalindromo = true;
			}else {
				isPalindromo = false;
				break;
			}
			
		}
		System.out.print("Vetor: ");
		for(int d=0; d<vetor.length; d++) {
			System.out.print(vetor[d]+" ");
		}
		
		if (isPalindromo) {
			System.out.println("\nO vetor e palindromo.");
		}else {
			System.out.println("\nO vetor nao e palindromo.");
		}
		
		
	}

}
