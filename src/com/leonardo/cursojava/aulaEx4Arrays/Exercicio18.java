package com.leonardo.cursojava.aulaEx4Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		
//		Ex 35
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 35*");

	
		int[] vetor = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Elemento " + i + ":");
			vetor[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetor.length; i++) {
			
			System.out.print(vetor[i]+": Divisores -> ");
			
			for(int j=1; j<vetor[i]; j++) {
				if(vetor[i] % j == 0) {
					System.out.print(j + " ");
				}
			}
			
			System.out.println(vetor[i]);
		}
		

		
//		Ex 36
		System.out.println("\n\n*Exercicio 36*");
		
		double[] vetorA = new double[11];
		
		for(int i=0; i<vetorA.length; i++) {
			
			vetorA[i] = Math.pow(2, i);
		}
		
		System.out.print("\nVetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		
//		Ex 37
		System.out.println("\n\n*Exercicio 37*");
		
		int[] array = new int[15];
		int[] arrayB = new int [array.length];
		double fatorial = 1;
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Elemento " + i +":");
			array[i] = scan.nextInt();
		}
		
		System.out.print("Vetor A: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n\n");
		
		for(int i=0; i<array.length; i++) {
			
			fatorial = 1;
			arrayB[i] = array[i];
			System.out.print(arrayB[i]+": Fatorial -> ");
			
			for(int j=arrayB[i]; j>0; j--) {
				if(j != 1) {
					System.out.print(j + " x ");
					fatorial *= j; 
				}else {
					System.out.print(j);
					fatorial *= j;
				}
			}
			
			System.out.println(" = " + df.format(fatorial));
		}
	}

}
