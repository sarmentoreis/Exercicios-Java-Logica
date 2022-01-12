package com.leonardo.cursojava.aulaEx12Interfaces;

public class Triangulo extends Figura2D {
	
	private double base;
	private double altura;
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		return ((base*altura)/2);
	}
	
	@Override
	public String toString() {
		String retorno = "\nFigura: " + super.getNome();
		retorno += "\nCor: " + super.getCor();
		retorno += "\nBase: " + this.base;
		retorno += "\nAltura: " + this.altura;
		retorno += "\nArea: " + calcularArea() + "\n";
		
		return retorno;
		
	}
	
}
