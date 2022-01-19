package com.leonardo.cursojava.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {
		
		int[] numeros = {4,8,5,16,32,21,64,128};
		int[] denominadores = {2,0,4,8,0,2,4};
		
		for(int i=0; i<numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {
					//Lancar a exception aqui
					throw new DivisaoNaoExata(numeros[i], denominadores[i]);
				}
				System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i]/denominadores[i]));
			}
			catch (ArithmeticException e) {
				System.err.println("Erro ao dividir por zero");
				e.printStackTrace();
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Posicao do array invalida");
				e.printStackTrace();
			}catch (DivisaoNaoExata e) {
				e.printStackTrace();
			}
		} 
	}

}
