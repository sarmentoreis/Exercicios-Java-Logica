package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 14*");
		
		int[] vetor = new int[10];
		double impar = 0;
		int media = 0;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + ":");
			vetor[i] = scan.nextInt();
			if(vetor[i] % 2 !=0) {
				impar += vetor[i];
				media++;
			}
		}
		
		double resultado = impar / media;
		
		System.out.print("Vetor: ");
		for(int y=0; y<vetor.length; y++) {
			if(y==(vetor.length -1)) {
				System.out.print(vetor[y]);
			}else
				System.out.print(vetor[y] +" + ");	
		}
		System.out.println("\nResultado media aritmetica (impar): " + resultado);
		
		
//		Ex 15		
		System.out.println("\n\n*Exercicio 15*");
		
		int[] vetorA = new int[10];
		int valImpar = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + ":");
			vetorA[i] = scan.nextInt();
			if(vetor[i] % 2 !=0) {
				valImpar++;
			}
		}
		
		int valPar = vetorA.length - valImpar;
		double porcPar = (valPar * 100)/ vetorA.length;
		double porcImpar = 100 - porcPar;
		
		System.out.print("Vetor: ");
		for(int y=0; y<vetorA.length; y++) {
			if(y==(vetorA.length -1)) {
				System.out.print(vetorA[y]);
			}else {
				System.out.print(vetorA[y] +" + ");
			}
		}
		System.out.println("\nPorcentagem pares: " + porcPar);
		System.out.println("Porcentagem impares: " + porcImpar);
		
	}

}
