package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
//		Ex 14
		Scanner scan = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		int numeros;
		for(int z=0; z<10; z++) {
			System.out.println("Digite um numero: ");
			numeros = scan.nextInt();
			if(numeros % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		System.out.println("Quantidade de numeros pares: " + pares);
		System.out.println("Quantidade de numeros impares: " + impares);
		
//		Ex 15
		
		System.out.println("\n---Fibonacci---");
		System.out.println("Entre com o n-esimo termo da serie de fibonacci:");
		int termo = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.print(primeiro+",");
		System.out.print(segundo+",");
		
		for(int i=3; i<=termo; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.print(proximo+",");
		}
		
//		Ex 16
		
		System.out.println("\n---Fibonacci 2---");
		System.out.println("Entre com o n-esimo termo da serie de fibonacci:");
		int term = scan.nextInt();
		
		int first = 1;
		int second = 1;
		int next = 0;
		
		System.out.print(first+",");
		System.out.print(second+",");
		
		while (next <= 500) {
			next = first + second;
			first = second;
			second = next;
			
			System.out.print(next+",");
		}

		
	}

}
