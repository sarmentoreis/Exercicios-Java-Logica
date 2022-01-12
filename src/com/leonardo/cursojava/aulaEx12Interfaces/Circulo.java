package com.leonardo.cursojava.aulaEx12Interfaces;

public class Circulo extends Figura2D {

	private double raio;
	

	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		return Math.pow(raio, 2) * Math.PI;
	}
	
	@Override
	public String toString() {
		String retorno = "\nFigura: " + super.getNome();
		retorno += "\nCor: " + super.getCor();
		retorno += "\nRaio: " + this.raio;
		retorno += "\nArea: " + calcularArea() + "\n";
		
		return retorno;
		
	}
	
}
