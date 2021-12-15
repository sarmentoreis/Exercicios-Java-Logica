package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
//		Ex 6
		for(int y = 1; y<=20; y++) {
			System.out.println(y);
		}
		for(int y = 1; y<=20; y++) {
			System.out.print(" "+ y);
		}
		
		
		
//		Ex 7
		
		Scanner scan = new Scanner(System.in);
		int num;
		int maior = Integer.MIN_VALUE;
		
		for(int i=0; i<5; i++) {
			System.out.println("\nEntre com um numero: ");
			num = scan.nextInt();
			
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.println("Maior valor: "+ maior);
		
		
//		Ex 8
		
		int soma = 0;
		double media;
		
		for(int x=0; x<5; x++) {
			System.out.println("\nDigite um numero: ");
			soma += scan.nextInt();			
			System.out.println("Valor da soma: " + soma);			
		}
		
		media = soma/5;
		System.out.println("Valor da media: "+media);
		
		
//		Ex 9
		
		int impar;
		for(int z=1; z<50; z++) {
			if((z % 2) != 0) {
				System.out.println("Numero: " + z);
			}
		}
				
	}

}
