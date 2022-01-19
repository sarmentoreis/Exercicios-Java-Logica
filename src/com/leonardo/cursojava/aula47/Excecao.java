package com.leonardo.cursojava.aula47;

public class Excecao {
	
	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto nao sera impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.err.println("Excecao ao acessar um indice do vetor que nao existe");
		}
		
		System.out.println("Esse texto sera impresso apos a exception");
		
	}
}
