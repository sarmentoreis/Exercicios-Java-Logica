package com.leonardo.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Fiat","Uno",(byte)5,40.0,10.0);
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getNumPassageiros());
		System.out.println(carro.getCapCombustivel());
		System.out.println(carro.getConsumoCombustivel());
	}

}
