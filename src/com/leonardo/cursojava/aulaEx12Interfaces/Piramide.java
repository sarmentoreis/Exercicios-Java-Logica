package com.leonardo.cursojava.aulaEx12Interfaces;

public class Piramide extends Figura3D {

	
	private double altura;
	private double arestaBase;
	private double apotema;	
	private int numPoligBase;
	private Figura2D base;
	
	
	
	public void setNumPoligBase(int numPoligBase) {
		this.numPoligBase = numPoligBase;
	}
	public int getNumPoligBase() {
		return numPoligBase;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArestaBase() {
		return arestaBase;
	}
	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public Figura2D getBase() {
		return base;
	}
	public void setBase(Figura2D base) {
		this.base = base;
	}
	@Override
	public double calcularArea() {
		if(base != null) {
			return (numPoligBase * ((arestaBase * apotema) /2)) + base.calcularArea();
		}
		return 0;	
	}
	@Override
	public double calcularVolume() {
		if(base != null) {
			return (base.calcularArea() * altura)/3;
		}
		return 0;	
	}
	
	@Override
	public String toString() {
		String retorno = "\nFigura: " + super.getNome();
		retorno += "\nCor: " + super.getCor();
		retorno += "\nAltura: " + this.altura;	
		retorno += "\nAresta Base: " + this.arestaBase;
		retorno += "\nApotema: " + this.apotema;
		retorno += "\nNumero de poligono base: " + this.numPoligBase;
		retorno += "\nBase: " + this.base.getNome();
		retorno += "\nArea: " + calcularArea();
		retorno += "\nVolume: " + calcularVolume() + "\n";
		
		return retorno;
		
	}
	
}
