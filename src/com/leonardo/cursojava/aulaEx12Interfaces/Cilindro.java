package com.leonardo.cursojava.aulaEx12Interfaces;

public class Cilindro extends Figura3D {
	
	private int altura;
	private double raio;
	
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		
		double areaBase = Math.PI * Math.pow(raio, 2);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = (2 * areaBase) + areaLateral;
		
		return areaTotal;
	}
	@Override
	public double calcularVolume() {
		return (Math.PI * (Math.pow(raio, 2)) * altura);
	}
	
	@Override
	public String toString() {
		String retorno = "\nFigura: " + super.getNome();
		retorno += "\nCor: " + super.getCor();
		retorno += "\nAltura: " + this.altura;
		retorno += "\nRaio: " + this.raio;
		retorno += "\nArea: " + calcularArea();
		retorno += "\nVolume: " + calcularVolume() + "\n";
		
		return retorno;
		
	}
	
	
}
