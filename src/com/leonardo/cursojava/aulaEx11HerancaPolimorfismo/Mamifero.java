package com.leonardo.cursojava.aulaEx11HerancaPolimorfismo;

public class Mamifero extends Animal {
	
	private String alimento;
	

	public Mamifero(String nome, int comprimento, int patas, String cor, double velocidade, String alimento) {
		super(nome, comprimento, patas, cor, "Terra", velocidade);
		this.alimento = alimento;
	}


	public String getAlimento() {
		return alimento;
	}


	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		
		String s = "\n Animal: " + super.getNome();
		s+= "\n Comprimento: " + super.getComprimento() + " cm";
		s+= "\n Patas: " + super.getPatas();
		s+= "\n Cor: " + super.getCor();
		s+= "\n Ambiente: " + super.getAmbiente();
		s+= "\n Velocidade: " + super.getVelocidade() + " m/s";
		s+= "\n Alimento: " + this.alimento + "\n";
		
		return s;
	}
	
}
