package com.leonardo.cursojava.aula17;

import java.util.Iterator;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		for (int i = 5; i > 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		for(int i=0, j=10; i<=j; i++, j--) {
			System.out.println("i = "+ i +"; j = " + j);
		}
		
		//Somando e printando cada soma.
		int soma = 0;
		for(int i=1; i<5; soma += i++) {
			System.out.println("O valor da soma e: "+ soma);
		}
		
		//Soma, armazena e printa o final.
		int soma2 = 0;
		for(int i=1; i<5; soma2 += i++);
		System.out.println("Somatoria: "+ soma2);
		
	}

}
