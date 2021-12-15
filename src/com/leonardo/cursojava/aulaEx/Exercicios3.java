package com.leonardo.cursojava.aulaEx;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
//		Ex 11 - Faca um Programa que peca 2 numeros inteiros e um numero real. Calcule e mostre:
//			o produto do dobro do primeiro com metade do segundo.
//			a soma do triplo do primeiro com o terceiro.
//			o terceiro elevado ao cubo.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
			int primeiroNumero = scan.nextInt();
		System.out.println("Digite outro numero inteiro: ");
			int segundoNumero = scan.nextInt();
		System.out.println("Digite um numero real: ");
			double numeroReal = scan.nextDouble();
			
		int pontoUm = (primeiroNumero * 2) * (segundoNumero / 2);
		System.out.println("O produto do dobro do primeiro com metade do segundo e: " + pontoUm);
		
		double pontoDois = (primeiroNumero * 3) + numeroReal;
		System.out.println("A soma do triplo do primeiro com o terceiro e: " + pontoDois);
		
		double pontoTres = Math.pow(numeroReal, 3);
		System.out.println("O terceiro elevado ao cubo e: " + pontoTres);
		
		
		// Ex 12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule
		 // seu peso ideal, usando a seguinte formula: (72.7*altura) - 58
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal e: " + pesoIdeal);
		
//		Ex 13 - Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu 
//		peso ideal, utilizando as seguintes formulas:
//		Para homens: (72.7*h) - 58
//		Para mulheres: (62.1*h) - 44.7
		
		System.out.println("Digite sua altura: ");
		double h = scan.nextDouble();
		
		double pesoHomens = (72.7 * h) - 58;
		double pesoMulheres = (62.1 * h) - 44.7;
		
		System.out.print("Para homens o peso ideal e: ");
		System.out.println(pesoHomens);
		System.out.print("Para mulheres o peso ideal e: ");
		System.out.println(pesoMulheres);
		
		
		
	}

}
