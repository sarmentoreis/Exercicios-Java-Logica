package com.leonardo.cursojava.aulaEx7Static;

public class Contador {
	
	private static int cont;
	
	
	public Contador() {
		Contador.cont++;
	}
	
	public void zerar() {
		Contador.cont = 0;
	}
	
	public void incrementar(int valor) {
		Contador.cont += valor;
	}
	
	public int retornar() {
		return cont;
	}
	
}
