package com.leonardo.cursojava.aulaEx;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		
		//Ex 7 - Faca um Programa que calcule a area de um quadrado, em seguida mostre
		 //o dobro desta area para o usuario.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a medida de um dos lados do quadrado: ");
		int medida = scan.nextInt();
		double area = Math.pow(medida, 2);
		
		System.out.println("A area do quadrado e: " + area);
		System.out.println("O dobro e: " + (area * 2));
		
		
		//Ex 8 - Faca um Programa que pergunte quanto voce ganha por hora e o numero de
		 //horas trabalhadas no mes. Calcule e mostre o total do seu salario no referido mes.
		
		System.out.println("Quanto voce ganha por hora: ");
		double ganha = scan.nextDouble();
		System.out.println("Quantas horas trabalhadas: ");
		double horas = scan.nextDouble();
		double salario = ganha * horas;
		System.out.println("Total do salario: " + salario);
		
		//Ex 9 - Faca um Programa que peca a temperatura em graus Fahrenheit, transforme e 
		 //mostre a temperatura em graus Celsius.
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahr = scan.nextDouble();
		double celsius = 5 * ((fahr - 32)/9);
		System.out.printf("Temperatura em graus Celsius: %2.1f \n", celsius);
		
		//Ex 10 - Faca um Programa que peca a temperatura em graus Fahrenheit, transforme e 
		 //mostre a temperatura em graus Celsius.
		
		System.out.println("Digite a temperatura em Celsius: ");
		double cels = scan.nextDouble();
		double fahrenheit = cels * 1.8 + 32;
		System.out.printf("Temperatura em graus Fahrenheit: %2.1f \n", fahrenheit);
		

	}

}
