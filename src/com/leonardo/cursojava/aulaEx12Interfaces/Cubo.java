package com.leonardo.cursojava.aulaEx12Interfaces;

public class Cubo extends Figura3D {
	
	private int lado;

	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
		return 6 * Math.pow(lado, 2);
	}
	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}
	
	@Override
	public String toString() {
		String retorno = "\nFigura: " + super.getNome();
		retorno += "\nCor: " + super.getCor();
		retorno += "\nLado: " + this.lado;		
		retorno += "\nArea: " + calcularArea();
		retorno += "\nVolume: " + calcularVolume() + "\n";
		
		return retorno;
		
	}
	
	
}
