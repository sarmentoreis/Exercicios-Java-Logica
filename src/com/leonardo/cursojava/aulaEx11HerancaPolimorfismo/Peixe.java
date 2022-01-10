package com.leonardo.cursojava.aulaEx11HerancaPolimorfismo;

public class Peixe extends Animal {

	private String caracteristicas;
	
	public Peixe(String nome, int comprimento, int patas, double velocidade, String caracteristicas) {
		super(nome, comprimento, patas, "Cinzento", "Mar", velocidade);
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public String toString() {
		
		String s = "\n Animal: " + super.getNome();
		s+= "\n Comprimento: " + super.getComprimento() + " cm";
		s+= "\n Patas: " + super.getPatas();
		s+= "\n Cor: " + super.getCor();
		s+= "\n Ambiente: " + super.getAmbiente();
		s+= "\n Velocidade: " + super.getVelocidade() + " m/s";
		s+= "\n Caracteristica: " + this.caracteristicas + "\n";
		
		return s;
	}
	
	
}
