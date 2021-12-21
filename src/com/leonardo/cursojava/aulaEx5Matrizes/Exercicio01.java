package com.leonardo.cursojava.aulaEx5Matrizes;


public class Exercicio01 {

	public static void main(String[] args) {
		
//		Ex 01
		
		int[][] matriz = new int[4][4];
		
		for(int i=0; i<matriz.length; i++) {			
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 9);
						
			}
		}
		
		int maior = Integer.MIN_VALUE;
		int x = 0;
		int y = 0;
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Linha " + (i+1));
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(" Coluna " + (j+1) +" (" + matriz[i][j] + ")");
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];					
					y = j;
					x = i;
				}
			}
			System.out.println("\n");
		}
		
		System.out.println("\nMaior valor foi: "+ maior);
		System.out.println("Localizacao de X(Linha): " + (x+1));
		System.out.println("Localizacao de Y(Coluna): " + (y+1));			
	}

}
