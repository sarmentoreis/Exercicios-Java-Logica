package com.leonardo.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		int[][] notasMatrizes = {{1,2},
								{3,4},
								 {5,6}};
		
		Random random = new Random();
		
		
		//Modo convencional para iterar vetores
		System.out.println("Modo convencional para iterar vetores:\n");
		for(int i=0; i<notas.length; i++) {
			notas[i] = random.nextInt(10);
			System.out.print(notas[i]);
		}
		
		//Modo ForEach para iterar vetores, lancado no Java 5.
		System.out.println("\n\nModo ForEach:\n");
		for(int nota : notas) {
			System.out.print(nota);
		}
		
		System.out.println("\n\nModo ForEach em matrizes:\n");
		for(int[] notasMatriz : notasMatrizes) {
			for(int notaMatriz : notasMatriz) {
				System.out.print(notaMatriz + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
