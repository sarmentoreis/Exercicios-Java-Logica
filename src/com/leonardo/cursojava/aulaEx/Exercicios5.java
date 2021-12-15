package com.leonardo.cursojava.aulaEx;

import java.util.Scanner;

public class Exercicios5 {

	public static void main(String[] args) {

//		Ex 16 - Faca um programa para uma loja de tintas. O programa devera pedir o tamanho em metros 
//		quadrados da area a ser pintada. Considere que a cobertura da tinta e de 1 litro para cada 3 metros
//		quadrados e que a tinta e vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuario a
//		quantidades de latas de tinta a serem compradas e o preco total.
//		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tamanho da area em metros²: ");
		int area = scan.nextInt();		
		double valor = 80;
		double litros = area/3;
		int capacidadeLata = 18;
		double latas = Math.ceil(litros/capacidadeLata);
		double total = latas * valor;
		
		System.out.println("Sera necessarios " + litros + " litros, " + latas + " latas, no total de R$ "  + total);
		
		
//		Ex 18 - Faca um programa que peca o tamanho de um arquivo para download (em MB) e a velocidade de um link de 
//		Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
		
		System.out.println("\nQual o tamanho do arquivo em MB: ");
		double tamMb = scan.nextInt();
		System.out.println("Qual a velocidade da internet em Mbps: ");
		double mbps = scan.nextInt();
		
		double tempo = tamMb / mbps;
		
		System.out.println("Tempo de download: " + tempo);
		
		
		

	}		
		
}
