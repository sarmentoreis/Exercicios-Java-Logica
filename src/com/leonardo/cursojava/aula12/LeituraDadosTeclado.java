package com.leonardo.cursojava.aula12;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Set locale, "," ou "."
		scan.useLocale(Locale.US);
		
		/*
		//Lendo a linha inteira
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Nome: " + nomeCompleto);
		
		//Lendo ate o primeiro espaco
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Primeiro nome: " + primeiroNome);
		
		//Lendo um inteiro
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Idade: " + idade);
		
		//Lendo um double
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Altura: " + altura);
		*/
		
		
		//Teste
		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem pet");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Possui pet?: " + temPet);
	}

}
