package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
//		Ex 4
		
		int a = 80000;
		int b = 200000;
		int cont = 0;
		
		while (a <= b) {
			
			a += (a/100) * 3;
			b += (b/100) * 1.5;
			cont++;
		}
		System.out.println("Populacao A: " + a);
		System.out.println("Populacao B: " + b);
		System.out.println("Qtd de anos: " + cont);
		
		
		
//		Ex 5
		
		Scanner scan = new Scanner(System.in);
		int valorA;
		int valorB;
		double porcA;
		double porcB;
		int i = 0;
		do {
			System.out.println("\nDigite a populacao do primeiro pais: ");
			valorA = scan.nextInt();
			System.out.println("Digite a populacao do segundo pais: ");
			valorB = scan.nextInt();
			if(valorA > valorB) {
				System.out.println("O primeiro pais precisa ser menor.");
			}
		} while (valorA > valorB);

		do {
			System.out.println("Qual a porcentagem de crescimento do primeiro pais: ");
			porcA = scan.nextDouble();
			System.out.println("Qual a porcentagem de crescimento do segundo pais: ");
			porcB = scan.nextDouble();
			
		} while (porcA >= 100 && porcB >= 100);
		
		
		
		while (valorA <= valorB) {
			
			valorA += (valorA/100) * porcA;
			valorB += (valorB/100) * porcB;
			i++;
		}
		System.out.println("Populacao A: " + valorA);
		System.out.println("Populacao B: " + valorB);
		System.out.println("Qtd de anos: " + i);
		
		
	}
		

}
