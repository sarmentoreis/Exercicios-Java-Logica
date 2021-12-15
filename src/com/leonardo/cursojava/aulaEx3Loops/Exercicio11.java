package com.leonardo.cursojava.aulaEx3Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
//		Ex 30
		Scanner scan = new Scanner(System.in);
		System.out.println("---Tabuada!---");
		System.out.println("Digite um numero para ver sua tabuada: ");
		int tabuada = scan.nextInt();
		System.out.println("Montar a tabuada de: "+tabuada);
		int inicio = 0;
		int fim = -1;
		int total;
		while(inicio > fim) {
			System.out.println("Digite o valor inicial: ");
			inicio = scan.nextInt();
			System.out.println("Digite o valor final: ");
			fim = scan.nextInt();
		}
		System.out.println("\nComecar por: " + inicio);
		System.out.println("Terminar em: " + fim+"\n");
		for(int i=inicio; i<=fim; i++) {
			total = (tabuada * i);
			System.out.println(tabuada+" X "+i+" = "+ total);
		}
		
		
//		Ex 31/32
		
		System.out.println("\nDigite o salario inicial: ");
		double salarioInicial = scan.nextDouble();
		double porcentagem = 1.5;
		double salario = 0;
		salario = salarioInicial + (salarioInicial * (porcentagem/100));
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		for(int i = 1997; i<=2021; i++) {

			porcentagem *= 2;
			salario += salario * (porcentagem/100);
			System.out.println("Salario ano: "+i+", "+porcentagem+"%" + " = "+ format.format(salario));
		}
	}

}
