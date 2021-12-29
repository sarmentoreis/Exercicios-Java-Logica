package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class Lampada {
	
	private String marca;
	private String tipo;
	private double temperatura;
	private char classificacao;  //classificacao energetica.
	private String cor;
	private String potencia;
	private boolean isLigada;
	
	
	
	public Lampada(String marca, String tipo, double temperatura, char classificacao, String cor, String potencia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.temperatura = temperatura;
		this.classificacao = classificacao;
		this.cor = cor;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public char getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(char classificacao) {
		this.classificacao = classificacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public boolean isLigada() {
		return isLigada;
	}

	void ligarLampada() {
		isLigada = true;
		System.out.println("Lampada ligada: " + isLigada);
	}
	
	void desligarLampada() {
		isLigada = false;
		System.out.println("Lampada desligada: " + isLigada);
	}
	
}
