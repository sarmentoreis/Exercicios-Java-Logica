package com.leonardo.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso &  // 1 &
				verdadeiro;
		boolean resultado2 = falso && // 2 && 
				verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);

	}

}
