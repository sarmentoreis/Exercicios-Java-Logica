package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
//		Ex 27
		Scanner scan = new Scanner(System.in);
		System.out.println("---Temperaturas---");
		System.out.println("\nSelecione a quantidade temperaturas: ");
		int qtdTemp = scan.nextInt();
		double temp;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double total = 0;
		
		for(int i=0; i<qtdTemp; i++) {
			System.out.println("Digite a temperatura "+ (i+1));
			temp = scan.nextDouble();
			if(temp > maior) {
				maior = temp;
			}
			
			if(temp < menor) {
				menor = temp;
			}
			total += temp;
		}
		
		System.out.println("Maior temperatura registrada: " + maior);
		System.out.println("Menor temperatura registrada: " + menor);
		System.out.println("Media das temperaturas: " + (total/qtdTemp));
		
		
//		Ex 28
		
		System.out.println("\n---Numero Primo---");	
		System.out.println("Numeros primos ate...: ");
		int primo = scan.nextInt();
		boolean isPrimo;
		
		for(int i=1; i<primo; i++) {
			isPrimo = true;
			
			for(int y=2; y<i; y++) {
				if(i % y == 0) {
					isPrimo = false;
				}			
			}
			if(isPrimo) {
				System.out.println(i);
			}
		}
		
	}

}
