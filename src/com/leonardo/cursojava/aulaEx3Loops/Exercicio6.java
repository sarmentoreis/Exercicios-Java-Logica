package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
//		Ex 17
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---Fatorial---");
		System.out.println("Digite um numero:");
		int num = scan.nextInt();
		
		System.out.println(num + "! = ");
		
		int fatorial = 1;
		
		for(int i=num; i>0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado: " + fatorial);
		
//		Ex 18
		
		System.out.println("\n---Numero Primo---");	
		System.out.println("Digite um numero para ver se e primo: ");
		int primo = scan.nextInt();
		boolean isPrimo = true;
		
		for(int i=2; i<primo; i++) {
			if(primo % i == 0) {
				System.out.println("Nao e primo - divisivel por: " + i);
				isPrimo = false;
			}
		}
		
		if (isPrimo) {
			System.out.println("O numero: "+primo+" e primo.");
		}
		
		
//		Ex 19
		
		System.out.println("\n---Media Aritmetica---");
		System.out.println("Entre com o numero de notas:");
		int notas = scan.nextInt();
		
		double soma=0;
		double media;
		double nota;
		
		for(int i=0; i<notas; i++) {
			System.out.println("Entre com a nota " + (i+1)+":");
			nota = scan.nextDouble();
			soma += nota;
		}
		media = soma/notas;
		
		System.out.println("Soma das notas: " + soma);
		System.out.println("Media das notas: " + media);
		
		
//		Ex 20
		
		System.out.println("\n---Media Aritmetica - 2---");
		System.out.println("Entre com o numero de pessoas:");
		int pessoas = scan.nextInt();
		
		int somaIdades=0;
		int mediaIdades;
		int idade;
		
		for(int i=0; i<pessoas; i++) {
			System.out.println("Digite a "+(i+1)+"a idade:" );
			idade = scan.nextInt();
			somaIdades += idade;
		}
		mediaIdades = somaIdades/pessoas;
		
		if (mediaIdades > 0 && mediaIdades <= 25) {
			System.out.println("A media de idades e: " + mediaIdades + ", JOVEM.");
		}
		else if (mediaIdades > 25 && mediaIdades <= 60) {
			System.out.println("A media de idades e: " + mediaIdades + ", ADULTA.");
		}
		else if (mediaIdades > 60) {
			System.out.println("A media de idades e: " + mediaIdades + ", IDOSA.");
		}
	}
}
