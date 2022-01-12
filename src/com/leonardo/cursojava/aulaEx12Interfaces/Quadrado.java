package com.leonardo.cursojava.aulaEx12Interfaces;

public class Quadrado extends Figura2D {

	private int lado;
	
	
	
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	  //return Math.pow(lado, 2);
	}
	
	@Override
	public String toString() {
		String retorno = "\nFigura: " + super.getNome();
		retorno += "\nCor: " + super.getCor();
		retorno += "\nLado: " + this.lado;
		retorno += "\nArea: " + calcularArea() + "\n";
		
		return retorno;
		
	}
	

}
