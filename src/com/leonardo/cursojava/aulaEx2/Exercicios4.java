package com.leonardo.cursojava.aulaEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Exercicios4 {

	public static void main(String[] args) throws IOException {
		
//		Ex 10 - Faca um programa que pergunte em que turno voce estuda. Peca para digitar M-Matutino,
//		V-Vespertino ou N-Noturno. Imprima a msg: Bom dia, Boa tarde, Boa noite ou valor invalido.
		
		InputStream entrada = System.in;
		InputStreamReader leitorInput = new InputStreamReader(entrada);
		BufferedReader teclado = new BufferedReader(leitorInput);
		
		System.out.println("Em qual turno voce estuda(M,V,N)? ");
		String turno = teclado.readLine();
		
		if(turno.equalsIgnoreCase("m")) {
			System.out.println("\nBom dia!");
		}
		else if(turno.equalsIgnoreCase("v")) {
			System.out.println("\nBoa tarde!");
		}
		else if(turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Valor invalido.");
		}
		
//		Ex 11 - As Organizacoes Tabajara resolveram dar um aumento de salario aos seus colaboradores e lhe contrataram para desenvolver 
//		o programa que calculara os reajustes.
//		- Faca um programa que recebe o salario de um colaborador e o reajuste segundo o seguinte critério, baseado no salario atual:
//			- salarios de ate R$ 280,00 (incluindo): aumento de 20%.
//			- salarios entre R$ 280,00 e R$ 700,00: aumento de 15%.
//			- salarios entre R$ 700,00 e R$ 1.500,00: aumento de 10%.
//			- salarios de R$ 1.500,00 em diante: aumento de 5%. Após o aumento ser realizado, informe na tela:
//			--O salario antes do reajuste;
//			--O percentual de aumento aplicado;
//			--O valor do aumento;
//			--O novo salario, apos o aumento.
		
		
		System.out.println("Digite o salario do colaborador: ");
		double salarioInicial = Double.parseDouble(teclado.readLine());
		double percentual = 0;
		
		if(salarioInicial <= 280.00) {
			percentual = 20.0 / 100.0;
		}
		else if (salarioInicial > 280.00 && salarioInicial <= 700.00) {
			percentual = 15.0 / 100.0;
		}
		else if (salarioInicial > 700.00 && salarioInicial <= 1500.00) {
			percentual = 10.0 / 100.0;
		}
		else {
			percentual = 5.0 / 100.0;
		}
		
		double salarioAtualizado = salarioInicial + (percentual * salarioInicial);
		double valorAumento = percentual * salarioInicial;
		
		System.out.println("O salario inicial era: " + salarioInicial + " foi aplicado um percentual de"
				+ " " + percentual*100 + "%, teve um aumento de R$ " + valorAumento + " e o salario final ficou: "+salarioAtualizado);
	}

}
