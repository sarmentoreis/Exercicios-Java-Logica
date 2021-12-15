package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios10 {

	public static void main(String[] args) {

//		Ex 21
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos litros serao abastecidos: ");
		double litros = scan.nextDouble();
		System.out.println("Qual sera o combustivel (A ou G): ");
		char combustivel = scan.next().toUpperCase().charAt(0);
		double alcool = 5.07;
		double gasolina = 6.25;
		int percentualDesconto = 0;
		double total = 0;
		double desconto = 0;
		
		
		if(combustivel == 'A') {
			if(litros <= 20) {
				percentualDesconto = 3;
			}else {
				percentualDesconto = 5;
			}
			
			total = litros * alcool;
		}
		else if (combustivel == 'G') {
			if(litros <= 20) {
				percentualDesconto = 4;
			}else {
				percentualDesconto = 6;
			}
			
			total = litros * gasolina;
		}
		
		desconto = (total /100) * percentualDesconto;
		
		double aPagar = total - desconto;
		
		System.out.println("Litros abastecidos: " + litros);
		System.out.println("Combustivel: " + combustivel);
		System.out.println("Percentual concedido: " + percentualDesconto +"%");
		System.out.println("Valor total S/desconto: " + total);
		System.out.println("Valor total C/desconto: "+ aPagar);
		
		
	
		
	}

}
