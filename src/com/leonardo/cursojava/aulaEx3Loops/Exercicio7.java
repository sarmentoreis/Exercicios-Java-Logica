package com.leonardo.cursojava.aulaEx3Loops;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
//		Ex 21
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de turmas: ");
		int turmas = scan.nextInt();
		int aluno;
		int alunos = 0;
		double media;
		
		for(int i=0; i<turmas; i++) {
			System.out.println("Entre com a quantidade de alunos para a turma " + (i+1)+":");
			aluno = scan.nextInt();
			if(aluno>40) {
				System.out.println("O limite maximo de alunos e 40, digite novamente.");
				i--;
			}else {
				alunos+= aluno;
			}
		}
		
		media = alunos/turmas;
		System.out.println("O numero medio de alunos por turma e: " + media);
		
		
//		Ex 22
		
		System.out.println("\nInforme a quantidade de CD's: ");
		int qtdCd = scan.nextInt();
		double valorCd;
		double total = 0;
		
		for(int y=0; y<qtdCd; y++) {
			System.out.println("Digite o valor do CD " + (y+1));
			valorCd = scan.nextDouble();
			total += valorCd;
		}
		
		System.out.println("\nValor total gasto na colecao: R$" + total);
		System.out.println("Media do custo dos CD's: R$" + (total/qtdCd));
	}

}
