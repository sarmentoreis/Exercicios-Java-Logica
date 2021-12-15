package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
//		Ex 18
		Scanner scan = new Scanner(System.in);
		System.out.println("*Exercicio 18*");
		
		int[] vetor = new int[10];
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int posMaior = 0;
		int posMenor = 0;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Entre com o elemento " + (i+1));
			vetor[i] = scan.nextInt();
			if(vetor[i] >= maior) {
				maior = vetor[i];
				posMaior = i;
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
				posMenor = i;
			}
		}
		
		System.out.print("Vetor: ");
		for(int y=0; y<vetor.length; y++) {
			if(y==(vetor.length -1)) {
				System.out.print(vetor[y]);
			}else {
				System.out.print(vetor[y] +" + ");
			}
		}
		
		System.out.println("\nMaior: " + maior + ", posicao: " + posMaior);
		System.out.println("Menor: " + menor + ", posicao: " + posMenor );
		
		
//		Ex 19
		System.out.println("*\nExercicio 19*");		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] results = new double[notas2.length];
		
		for(int x=0; x<notas1.length; x++) {
			System.out.println("Entre com a primeira nota do aluno " + (x+1));
			notas1[x] = scan.nextDouble();
			System.out.println("Entre com a segunda nota do aluno " + (x+1));
			notas2[x] = scan.nextDouble();
		}
		
		for(int z=0; z<notas1.length; z++) {
			results[z] = (notas1[z] + notas2[z]) / 2;			
		}
		
		for(int w=0; w<results.length; w++) {
			if(results[w] >= 7) {
				System.out.println("A media do aluno "+(w+1)+" foi "+ results[w]+", aprovado.");
			}else {
				System.out.println("A media do aluno "+(w+1)+" foi "+ results[w]+", reprovado.");
			}
		}
		
	}

}
