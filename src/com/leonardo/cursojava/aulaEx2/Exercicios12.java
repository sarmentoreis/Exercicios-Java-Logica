package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios12 {

	public static void main(String[] args) {
		
//		Ex 23
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha o tipo da carne: ");
		System.out.println("- File Duplo");
		System.out.println("- Alcatra");
		System.out.println("- Picanha");
		String tipoCarne = scan.nextLine();
		
		System.out.println("Qual sera a quantidade em KG's: ");
		double kg = scan.nextDouble();
		scan.nextLine();
		double preco = 0;
		String tipoPagamento = "";
		double desconto = 0;
		double total = 0;
		
		if(tipoCarne.equalsIgnoreCase("File Duplo")) {
			if(kg <= 5) {
				preco = kg * 4.90;
			}else {
				preco = kg * 5.80;
			}
			
			System.out.println("Qual sera a forma de pagamento: ");
			System.out.println("- Dinheiro");
			System.out.println("- Cartao Tabajara");
			tipoPagamento = scan.nextLine();
			
			if(tipoPagamento.equalsIgnoreCase("Cartao Tabajara")) {
				desconto = (preco/100) * 5;
				total = preco - desconto;
			}else {
				desconto = 0;
				total = preco;
			}
		}
		else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
			if(kg <= 5) {
				preco = kg * 5.90;
			}else {
				preco = kg * 6.80;
			}
			
			System.out.println("Qual sera a forma de pagamento: ");
			System.out.println("- Dinheiro");
			System.out.println("- Cartao Tabajara");
			tipoPagamento = scan.nextLine();
			
			if(tipoPagamento.equalsIgnoreCase("Cartao Tabajara")) {
				desconto = (preco/100) * 5;
				total = preco - desconto;
			}else {
				desconto = 0;
				total = preco;
			}
		}
		else if (tipoCarne.equalsIgnoreCase("Picanha")) {
			if(kg <= 5) {
				preco = kg * 6.90;
			}else {
				preco = kg * 7.80;
			}
			
			System.out.println("Qual sera a forma de pagamento: ");
			System.out.println("- Dinheiro");
			System.out.println("- Cartao Tabajara");
			tipoPagamento = scan.nextLine();
			
			if(tipoPagamento.equalsIgnoreCase("Cartao Tabajara")) {
				desconto = (preco/100) * 5;
				total = preco - desconto;
			}else {
				desconto = 0;
				total = preco;
			}
		}
		
		
		System.out.println("\nTipo da carne: " + tipoCarne);
		System.out.println("Quantidade comprada: " + kg +"Kg's");
		System.out.println("Preco total: R$ " + preco);
		System.out.println("Tipo de pagamento: " + tipoPagamento);
		System.out.println("Valor do desconto: R$ " + desconto);
		System.out.println("Total da compra: R$ " + total);
		
	}

}
