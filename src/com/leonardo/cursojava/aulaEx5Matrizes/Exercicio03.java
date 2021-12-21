package com.leonardo.cursojava.aulaEx5Matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
//		Ex 03
		Scanner scan = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int par = 0;
		int impar = 0;
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Linha "+ (i+1));
			for(int j=0; j<matriz[i].length; j++) {
				System.out.println("Entre com o elemento da coluna " + (j+1));
				matriz[i][j] = scan.nextInt();
				if(matriz[i][j] % 2 == 0) {
					par++;
				}else {
					impar++;
				}
			}
		}
		
		System.out.println("\n*--Resultado--*\n");
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Linha " + (i+1));
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(" Coluna " + (j+1) +" (" + matriz[i][j] + ")");
			}
			System.out.println("\n");
		}
		
		System.out.println("Qtd de par: "+ par);
		System.out.println("Qtd de impar: "+ impar);
		
	}

}
