package com.leonardo.cursojava.aula49;

public class TestandoFinally {

	public static void main(String[] args) {
		
		int[] numeros = {4,8,16,32,64,128};
		int[] denominadores = {2,0,4,8,0};
		
		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i]/denominadores[i]));
			}
			catch (ArithmeticException e) {
				System.err.println("Erro ao dividir por zero");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Posicao do array invalida");
			}
			finally {
				System.out.println("Essa linha e impressa sempre apos o try ou o catch.");
			}
		}
	}

}
