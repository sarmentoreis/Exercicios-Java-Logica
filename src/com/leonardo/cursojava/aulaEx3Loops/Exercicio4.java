package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
//		Ex 11
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		int num2 = scan.nextInt();
		int soma = 0;
		
		for(num1++;num1<num2;num1++) {
			
			System.out.println("Numero: " + num1);
			soma += num1;
		}
		System.out.println("Soma de todos os numeros: " + soma);
		
		
//		Ex 12
		
		System.out.println("\n---Tabuada---");
		System.out.println("Digite um numero para ver sua tabuada: ");
		int tabuada = scan.nextInt();
		int total;
		System.out.println("Tabuada de " + tabuada + ":");
		for(int i=1; i<=10; i++) {
			total = tabuada * i;
			System.out.println(tabuada+" X " + i +" = " + total);
			
		}
		
		
//		Ex 13
		
		System.out.println("Entre com a base:");
		int base = scan.nextInt();
		System.out.println("Entre com a potencia");
		int pot = scan.nextInt();
		
		int resultado = base;
		
		for(int i=1; i<pot; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);
		
		
	}

}
