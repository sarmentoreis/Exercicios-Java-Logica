package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
//		Ex 32
		Scanner scan = new Scanner(System.in);
		System.out.println("Especificao     - Codigo - Preco\n");
		System.out.println("Cachorro Quente - 100 - R$ 1,20\n"
						 + "Bauru Simples   - 101 - R$ 1,30\n"
						 + "Bauru com ovo   - 102 - R$ 1,50\n"
						 + "Hamburguer      - 103 - R$ 1,20\n"
						 + "Cheeseburguer   - 104 - R$ 1,30\n"
						 + "Refrigerante    - 105 - R$ 1,00");
		
		int codigo;
		int quantidade = 0;
		double total = 0;
		boolean sair = false;
		while (!sair) {
			System.out.println("\nDigite o codigo do item ou 0 para finalizar: ");
			codigo = scan.nextInt();
			if (codigo == 0) {
				sair = true;
				System.out.println("Total da compra: " + total);
			}
			if(sair==false) {
				System.out.println("Qual a quantidade desejada?");
				quantidade = scan.nextInt();
			}
			if(codigo == 100) {
				total += 1.20 * quantidade;
			}
			else if (codigo == 101) {
				total += 1.30 * quantidade;
			}
			else if (codigo == 102) {
				total += 1.50 * quantidade;
			}
			else if (codigo == 103) {
				total += 1.20 * quantidade;
			}
			else if (codigo == 104) {
				total += 1.30 * quantidade;
			}
			else if (codigo == 105) {
				total += 1.00 * quantidade;
			}
		}
		
//		Ex 33
		System.out.println("\nDigite o valor de n");
		int n = scan.nextInt();
		double soma = 0;
		
		for(int i =1, j=1; i<=n; i++, j+=2) {
			
			System.out.print(i + "/" + j  +" + ");
			
			soma += i/j;
		}
		System.out.println("\nSoma = " + soma);	
		
//		Ex 34
		
		System.out.println("\nDigite n termos:");
		int nTermos = scan.nextInt();
		double valor = 0 ;
		
		for (int n1=1; n1<=nTermos; n1++) {
			
			System.out.println("1/"+n1+" + ");
			
			valor += 1/n1;
		}
		
		System.out.println("Soma = " + (valor + 1));
	}

}
