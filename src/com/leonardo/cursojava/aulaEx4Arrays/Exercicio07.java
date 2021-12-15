package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
//		Ex 12
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 12*");
		
		int[] vetor = new int[3];
		int soma = 0;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + ":");
			vetor[i] = scan.nextInt();
			soma += vetor[i];
		}
		
		System.out.print("Vetor: ");
		for(int y=0; y<vetor.length; y++) {
			if(y==(vetor.length -1)) {
				System.out.print(vetor[y]);
			}else
				System.out.print(vetor[y] +" + ");	
		}
		System.out.println("\nSoma: " + soma);
		
		
//		Ex 13
		System.out.println("\n\n*Exercicio 13*");
		
		int[] vetorMultiplo = new int[10];
		int somaMultiplo = 0;
		
		for(int i=0; i<vetorMultiplo.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + ":");
			vetorMultiplo[i] = scan.nextInt();
			if(vetorMultiplo[i] % 5 == 0) {
				somaMultiplo += vetorMultiplo[i];
			}
		}
		
		System.out.print("Vetor: ");
		for(int y=0; y<vetorMultiplo.length; y++) {
			if(y==(vetorMultiplo.length -1)) {
				System.out.print(vetorMultiplo[y]);
			}else {
				System.out.print(vetorMultiplo[y] +" + ");
			}
		}
		System.out.println("\nSoma multiplos de 5: " + somaMultiplo);
		
	}

}
