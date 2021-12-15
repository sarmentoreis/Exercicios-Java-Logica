package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

//		Ex 16
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 16*");
		int[] vetor = new int[10];
		int soma = 0;
		int qtdQuinze = 0;
		int somaMed = 0;
		int media = 0;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Entre com o elemento " + (i+1) + " do vetor: ");
			vetor[i] = scan.nextInt();
		}
		for(int y=0; y<vetor.length; y++) {
			if(vetor[y] < 15) {
				soma += vetor[y];
			}else if (vetor[y] == 15) {
				qtdQuinze++;
			}else if (vetor[y] > 15) {
				somaMed += vetor[y];
				media++;
			}
		}
		
		System.out.print("Vetor: ");
		for(int y=0; y<vetor.length; y++) {
			if(y==(vetor.length -1)) {
				System.out.print(vetor[y]);
			}else {
				System.out.print(vetor[y] +" + ");
			}
		}
		
		System.out.println("\n\nSoma inferior a 15: " + soma);
		System.out.println("Iguas a 15: " + qtdQuinze);
		System.out.println("Media superior a 15: " + (somaMed/media));
		
		
//		Ex 17
		System.out.println("\n\n*Exercicio 17*");
		int[] vetorA = new int[10];
		int qtdIdade = 0;
		
		for(int x=0; x<vetor.length; x++) {
			System.out.println("Entre com o elemento " + (x+1) + " do vetor: ");
			vetorA[x] = scan.nextInt();
			if(vetorA[x] > 35) {
				qtdIdade++;
			}
		}
		
		System.out.print("Vetor: ");
		for(int y=0; y<vetorA.length; y++) {
			if(y==(vetorA.length -1)) {
				System.out.print(vetorA[y]);
			}else {
				System.out.print(vetorA[y] +" + ");
			}
		}
		
		System.out.println("\nQuantidade de pessoas com idade superior a 35 anos: " + qtdIdade);
		
	}

}
