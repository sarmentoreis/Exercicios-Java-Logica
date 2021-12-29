package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("1234", true);
		Conta c2 = new Conta("4321", false);
		Conta c3 = new Conta("0000", true);
		
		
		System.out.println("Conta " + c1.getNumero() +":");
		c1.consulta();
		c1.deposito(300.52);
		c1.consulta();
		System.out.println("\n");
		System.out.println("C1 especial: " + c1.status());
		System.out.println("C2 especial: " + c2.status());
		
		c1.saque(1000);
		c1.consulta();
		System.out.println("\n");
		c2.saque(1000);
		c2.consulta();
		System.out.println("\n");
		
		c1.consultaChequeEspecial();
		c2.consultaChequeEspecial();
		c3.consultaChequeEspecial();
		
		
		
	}

}
