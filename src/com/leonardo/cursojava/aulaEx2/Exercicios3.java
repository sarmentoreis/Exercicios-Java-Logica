package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
		
//		Ex 8 - Faca um programa que pergunte o preco de tres produtos e informe qual produto
//		voce deve comprar, sabendo que a decisao e sempre pelo mais barato.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preco do primeiro produto: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o preco do segundo produto: ");
		double num2 = scan.nextDouble();
		System.out.println("Digite o preco do terceiro produto: ");
		double num3 = scan.nextDouble();
		
		if(num1 <= num2 && num1 <= num3) {			
			System.out.println("O menor preco foi o primeiro produto. " + num1);
		}
		else if (num2 <= num1 && num2 <= num3) {
			System.out.println("O menor preco foi o segundo produto. " + num2);
		}
		else if(num3 <= num1 && num3 <= num2) {
			System.out.println("O menor preco foi o terceiro produto; " + num3);
		}
		
		
//		Ex 9 - Faca um programa que leia tres numeros e mostre-os em ordem decresente.
		
		System.out.println("Digite num1: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite num2 ");
		double n2 = scan.nextDouble();
		System.out.println("Digite num3: ");
		double n3 = scan.nextDouble();
		
		if(n1 <= n2 && n1 <= n3 && n2 <= n3) {
			System.out.println(n3 + " - " + n2 + " - " + n1);
		}
		else if(n1 <= n2 && n1 <= n3 && n3 <= n2) {
			System.out.println(n2 + " - " + n3 + " - " + n1);
		}
		else if(n2 <= n1 && n2 <= n3 && n1 <= n3) {
			System.out.println(n3 + " - " + n1 + " - " + n2);
		}
		else if(n2 <= n1 && n2 <= n3 && n3 <= n1) {
			System.out.println(n1 + " - " + n3 + " - " + n2);
		}
		else if (n3 <= n1 && n3 <= n2 && n1 <= n2) {
			System.out.println(n2 + " - " + n1 + " - " + n3);
		}
		else if (n3 <= n1 && n3 <= n2 && n2 <= n1) {
			System.out.println(n1 + " - " + n2 + " - " + n3);
		}
		
	}

}
