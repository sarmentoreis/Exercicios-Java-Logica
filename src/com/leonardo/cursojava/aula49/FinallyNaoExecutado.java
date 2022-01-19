package com.leonardo.cursojava.aula49;

public class FinallyNaoExecutado {

	public static void main(String[] args) {

		int[] numeros = {4,8,16,32,64,128};
		int[] denominadores = {0,0,4,8,0};

		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i]/denominadores[i]));
			}
			catch (ArithmeticException e) {
				System.err.println("Erro ao dividir por zero");
				System.exit(0); // Devido essa linha, o finally nao sera executado. o sistema tera sido terminado
			}
			finally {
				System.out.println("Essa linha nao sera executada.");
			}
		}
	}
}
