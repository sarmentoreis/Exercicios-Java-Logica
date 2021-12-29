package com.leonardo.cursojava.aula29;

public class Carro {

	
	private String marca;
	private String modelo;
	private byte numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	Carro(String marca, String modelo, byte numPassageiros, double capComb, double consComb ){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capComb;
		this.consumoCombustivel = consComb;
	}
	
	
		
		
	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public byte getNumPassageiros() {
		return numPassageiros;
	}




	public void setNumPassageiros(byte numPassageiros) {
		this.numPassageiros = numPassageiros;
	}




	public double getCapCombustivel() {
		return capCombustivel;
	}




	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}




	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}




	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}




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
