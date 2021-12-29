package com.leonardo.cursojava.aulaEx7Static;

public class TesteContador {

	public static void main(String[] args) {
		
		Contador cont1 = new Contador();
		
		System.out.println("Retornar: " + cont1.retornar());
		cont1.incrementar(5);
		System.out.println("Incrementar: " + cont1.retornar());
		cont1.zerar();
		System.out.println("Zerar: " + cont1.retornar());
		
		Contador cont2 = new Contador();
		Contador cont3 = new Contador();
		
		System.out.println("cont2: " + cont2.retornar());
		System.out.println("cont3: " + cont2.retornar());
		

		
		
	}

}
