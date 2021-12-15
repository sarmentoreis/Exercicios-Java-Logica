package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios8 {

	public static void main(String[] args) {

//		Ex 17
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Esse ano e bissexto.");
		}else {
			System.out.println("Esse ano nao e bissexto.");
		}

//		Ex 18
		
		System.out.println("Digite um numero ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Numero PAR");
		}else {
			System.out.println("Numero IMPAR");
		}
		
		
//		Ex 19
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double num2 = scan.nextDouble();
		System.out.println("Qual a operacao desejada? (+,-,*,/)");
		char operacao = scan.next().charAt(0);
		double total = 0;
		boolean valida = true;
		
		switch (operacao) {
		case '+':
			total = num1 + num2;
			System.out.println("Resultado da operacao: " + total);
			break;
		case '-':
			total = num1 - num2;
			System.out.println("Resultado da operacao: " + total);
			break;
		case '*':
			total = num1 * num2;
			System.out.println("Resultado da operacao: " + total);
			break;
		case '/':
			total = num1 / num2;
			System.out.println("Resultado da operacao: " + total);
			break;
		default:
			System.out.println("Operacao invalida.");
			valida = false;
		
		}
		
		if(valida) {
			if(total % 2 == 0) {
				System.out.print("O numero e PAR");
			}
			else {
				System.out.print("O numero e IMPAR");
			}
			
			if (total >= 0) {
				System.out.println(" e POSITIVO");
			}
			else {
				System.out.println(" e NEGATIVO");
			}
		}
		
	}

}
