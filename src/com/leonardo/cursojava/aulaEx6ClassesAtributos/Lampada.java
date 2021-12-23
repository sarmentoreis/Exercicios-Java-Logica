package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class Lampada {
	
	String marca;
	String tipo;
	double temperatura;
	char classificacao;  //classificacao energetica.
	String cor;
	String potencia;
	boolean isLigada;
	
	
	void ligarLampada() {
		isLigada = true;
		System.out.println("Lampada ligada: " + isLigada);
	}
	
	void desligarLampada() {
		isLigada = false;
		System.out.println("Lampada desligada: " + isLigada);
	}
	
}
