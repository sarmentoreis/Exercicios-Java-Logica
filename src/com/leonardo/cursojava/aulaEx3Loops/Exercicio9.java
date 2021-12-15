package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
//		Ex 25
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lojas Tabajara\n");
		boolean finalizar = false;
		int cont = 0;
		double precoProduto;
		double total = 0;
		double pagamento;
		double troco;
		String opcao;
		
		do {
			finalizar = false;
			cont = 0;
			precoProduto = 0;
			total = 0;
			while (!finalizar) {
				cont++;
				System.out.println("Digite o preco do produto "+cont+":" );
				precoProduto = scan.nextDouble();
				total += precoProduto;
				System.out.println("Produto "+cont+": R$ "+precoProduto);
				if (precoProduto == 0) {
					finalizar = true;
				}
			}
			System.out.println("\nTotal: R$" + total);
			System.out.println("Digite o pagamento: ");
			pagamento = scan.nextDouble();
			troco =  pagamento - total;
			System.out.println("Troco: R$ "+troco);
			System.out.println("\nDeseja iniciar uma nova compra? s/n ");
			opcao = scan.next();
			
		} while (opcao.equalsIgnoreCase("S"));
		
		
		
//		Ex 26
		
		System.out.println("\n---Fatorial---");
		System.out.println("Digite um numero:");
		int num = scan.nextInt();
		
		System.out.println("Fatorial de: "+num);
		System.out.print(num+"! = ");
		
		int fatorial = 1;
		
		for(int i=num; i>0; i--) {
			fatorial *= i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print(i+" . ");
			}
			
		}
		
		System.out.println(" = " + fatorial);
	}

}
