package com.leonardo.cursojava.aulaEx4Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
//		Ex 8
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 8* \n");
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [10];
		int[] vetorC = new int [vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Digite o elemento " + (i+1) +" do vetor A:");
			vetorA[i] = scan.nextInt();
			System.out.println("Digite o elemento " + (i+1) +" do vetor B:");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		System.out.print("Vetor A: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorA[y]+ " ");
		}
		System.out.print("\nVetor B: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorB[y]+ " ");
		}
		System.out.print("\nVetor C: ");
		for(int y=0; y<vetorA.length; y++) {
			System.out.print(vetorC[y]+ " ");
		}
		
		
//		Ex 9
		System.out.println("\n\n*Exercicio 9* \n");
		
		int[] vetorD = new int [10];
		int[] vetorE = new int [10];
		double[] vetorF = new double [vetorD.length];
		
		for(int i=0; i<vetorD.length; i++) {
			System.out.println("Digite o elemento " + (i+1) +" do vetor D:");
			vetorD[i] = scan.nextInt();
			System.out.println("Digite o elemento " + (i+1) +" do vetor E:");
			vetorE[i] = scan.nextInt();
			vetorF[i] = vetorD[i] / (vetorE[i]);
		}
		
		System.out.print("Vetor D: ");
		for(int y=0; y<vetorD.length; y++) {
			System.out.print(vetorD[y]+ " ");
		}
		System.out.print("\nVetor E: ");
		for(int y=0; y<vetorD.length; y++) {
			System.out.print(vetorE[y]+ " ");
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		System.out.print("\nVetor F: ");
		for(int y=0; y<vetorD.length; y++) {
			System.out.print(df.format(vetorF[y])+ " ");
		}
	}

}
