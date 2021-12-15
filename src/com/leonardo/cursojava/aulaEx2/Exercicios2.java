package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {

//		Ex 5 - Faca um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular
//		a media alcancada e apresentar:
//			A msg aprovado se a media alcancada for maior ou igual a 7.
//			A msg reprovado se a media for menor que 7.
//			A msg aprovado com distincao se a media for igual a 10.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) /2;
		System.out.println(media);
		
		if (media == 10) {
			System.out.println("Voce foi APROVADO COM DISTINCAO.");			
		}
		else if(media >= 7) {
			System.out.println("Voce foi APROVADO.");
		}
		else {
			System.out.println("Voce foi REPROVADO.\n");
		}
		
		
//		Ex 6 - Faca um programa que leia tres numeros e mostre o maior deles.
		
		System.out.println("Digite um numero: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int num2 = scan.nextInt();
		System.out.println("Digite o ultimo numero: ");
		int num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("O maior numero digitado foi: " + num1);
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println("O maior numero digitado foi: " + num2);
		}
		else {
			System.out.println("O maior numero digitado foi: " + num3);
		}
		
//		Ex 7 - Faca um programa que leia tres numeros e mostre o maior e o menor deles.
		
		System.out.println("\nDigite um numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int numero2 = scan.nextInt();
		System.out.println("Digite o ultimo numero: \n");
		int numero3 = scan.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
			System.out.println("O maior numero digitado foi: " + numero1);
			System.out.println("O menor numero digitado foi: " + numero3);
		}
		else if(numero1 > numero2 && numero1 > numero3 && numero2 < numero3) {
			System.out.println("O maior numero digitado foi: " + numero1);
			System.out.println("O menor numero digitado foi: " + numero2);
		}
		else if(numero2 > numero1 && numero2 > numero3 && numero1 > numero3){
			System.out.println("O maior numero digitado foi: " + numero2);
			System.out.println("O menor numero digitado foi: " + numero3);
		}
		else if(numero2 > numero1 && numero2 > numero3 && numero1 < numero3){
			System.out.println("O maior numero digitado foi: " + numero2);
			System.out.println("O menor numero digitado foi: " + numero1);
		}
		else if(numero1 < numero2){
			System.out.println("O maior numero digitado foi: " + numero3);
			System.out.println("O menor numero digitado foi: " + numero1);
		}
		else {
			System.out.println("O maior numero digitado foi: " + numero3);
			System.out.println("O menor numero digitado foi: " + numero2);
		}
		
	}

}
