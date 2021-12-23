package com.leonardo.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	byte numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
		
		
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro e: " + capCombustivel * consumoCombustivel + " km.");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}

}
