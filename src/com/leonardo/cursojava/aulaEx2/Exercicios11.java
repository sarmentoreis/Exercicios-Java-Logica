package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios11 {

	public static void main(String[] args) {

//		Ex 22 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade (kg) de morango: ");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade (kg) de maca: ");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		double precoKgMaca = 0;
		
		if(qtdMorango <= 5) {
			precoKgMorango = 2.5;			
		}
		else {
			precoKgMorango = 2.2;
		}
		
		if(qtdMaca <= 5) {
			precoKgMaca = 1.8;
		}
		else {
			precoKgMaca = 1.5;
		}
		
		double totalMorango = qtdMorango * precoKgMorango;
		double totalMaca = qtdMaca * precoKgMaca;
		
		if((qtdMorango + qtdMaca) > 8 || totalMaca + totalMorango > 25.00) {
			double frutas = totalMaca + totalMorango;
			double desconto = frutas - (frutas /10);
			System.out.println("KG's de morango: " + qtdMorango);
			System.out.println("KG's de maca: " + qtdMaca );
			System.out.println("Valor total em morango: " + totalMorango);
			System.out.println("Valor total em maca: " + totalMaca);
			System.out.println("Valor final, com desconto: " + desconto);
		}else {
			double frutas = totalMaca + totalMorango;			
			System.out.println("KG's de morango: " + qtdMorango);
			System.out.println("KG's de maca: " + qtdMaca );
			System.out.println("Valor total em morango: " + totalMorango);
			System.out.println("Valor total em maca: " + totalMaca);
			System.out.println("Valor final, sem desconto: " + frutas);
		}
	}

}
