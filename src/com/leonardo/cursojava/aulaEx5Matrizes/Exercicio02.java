package com.leonardo.cursojava.aulaEx5Matrizes;

public class Exercicio02 {

	public static void main(String[] args) {
		
//		Ex 02
		
		int[][] matriz = new int[10][10];
		
		for(int i=0; i<matriz.length; i++) {			
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 9);								
			}
		}
		
		int maiorX = Integer.MIN_VALUE;
		int menorX = Integer.MAX_VALUE;
		int maiorY = Integer.MIN_VALUE;
		int menorY = Integer.MAX_VALUE;
		
		for(int i=0; i<matriz.length; i++) {			
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] > maiorY && j == 6) {
					maiorY = matriz[i][j];					
				}
				if(matriz[i][j] < menorY && j == 6) {
					menorY = matriz[i][j];					
				}
				if(matriz[i][j] > maiorX && i == 4) {
					maiorX = matriz[i][j];
				}
				if(matriz[i][j] < menorX && i == 4) {
					menorX = matriz[i][j];
				}
			}
		}
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Linha " + (i+1));
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(" Coluna " + (j+1) +" (" + matriz[i][j] + ")");
			}
			System.out.println("\n");
		}
		
		System.out.println("\nMaior valor na linha 5: "+ maiorX);
		System.out.println("Menor valor na linha 5: "+ menorX);
		System.out.println("Maior valor na coluna 7: "+ maiorY);
		System.out.println("Menor valor na coluna 7: "+ menorY);

	}

}
