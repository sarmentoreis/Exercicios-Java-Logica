package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios6 {

	public static void main(String[] args) {
		
//		Ex 12 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQuanto voce ganha por hora: ");
		double valorHoras = scan.nextDouble();
		System.out.println("Quantas horas trabalhadas no mes: ");
		double qtdHoras = scan.nextDouble();
		double salarioBruto = valorHoras * qtdHoras;
		int percentualIR = 0;
		
		
		if (salarioBruto <= 900.00) {
			percentualIR = 0;
		}
		else if (salarioBruto > 900.00 && salarioBruto <= 1500.00) {
			percentualIR = 5;
		}
		else if (salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
			percentualIR = 10;
		}
		else if (salarioBruto > 2500.00) {
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto /100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto: (" + valorHoras + " * " + qtdHoras + "): " + salarioBruto);
		System.out.println("IR (" + percentualIR + "%): " + ir);
		System.out.println("INSS (10%): " + inss);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salario Liquido " + salarioLiquido);
		
		
//		Ex 14
		
		System.out.println("\nDigite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2) / 2;
		char conceito = 0;
		String msg = "";
		
		if(media >= 9.0 && media <= 10.0) {
			conceito = 'A';
			msg = "APROVADO";
		}
		else if (media >= 7.5 && media < 9.0) {
			conceito = 'B';
			msg = "APROVADO";
		}
		else if (media >= 6.0 && media < 7.5) {
			conceito = 'C';
			msg = "APROVADO";
		}
		else if (media >= 4.0 && media < 6.0) {
			conceito = 'D';
			msg = "REPROVADO";
		}
		else if (media >= 0 && media < 4.00) {
			conceito = 'E';
			msg = "REPROVADO";
		}
		
		
		
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println(msg);
		
	}

}
