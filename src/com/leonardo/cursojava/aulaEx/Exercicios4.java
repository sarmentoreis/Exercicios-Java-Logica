package com.leonardo.cursojava.aulaEx;

import java.util.Scanner;

import org.omg.CORBA.IRObject;

import javafx.scene.control.ProgressIndicator;

public class Exercicios4 {

	public static void main(String[] args) {
		
//		Ex 14 - Joao Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diario
//		de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca
//		do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. Joao precisa que voce
//		faaa um programa que leia a variavel peso (peso de peixes) e calcule o excesso. Gravar na variavel excesso a
//		quantidade de quilos alem do limite e na variavel multa o valor da multa que Joao devera pagar. Imprima os dados
//		do programa com as mensagens adequadas.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de KG's de peixe: ");
		int kg = scan.nextInt();
		
		if(kg > 50) {
			int excesso = kg - 50;
			double multa = 0;
			for(int i = 0; i < excesso; i++) {
				multa =+ multa + 4;
			}
			
			System.out.printf("Voce excedeu " + excesso + "KG's, sera cobrada uma multa"
							  + " de R$ %.2f \n", multa);
		}
		else {
			System.out.println("Voce nao excedeu o limite estabelecido.");
		}
		
//		Ex 15 - Faca um Programa que pergunte quanto voce ganha por hora e o numero de horas trabalhadas no mes. Calcule e 
//		mostre o total do seu salario no referido mes, sabendo-se que sao descontados 11% para o Imposto de Renda, 8% para o 
//		INSS e 5% para o sindicato, faca um programa que nos de:
//			salario bruto.
//			quanto pagou ao INSS.
//			quanto pagou ao sindicato.
//			o salario liquido.
//			calcule os descontos e o salario liquido, conforme a tabela abaixo
		
		
		System.out.println("\nQuanto voce ganha por hora: ");
		double ganha = scan.nextDouble();
		System.out.println("Quantas horas trabalhadas no mes: ");
		double horas = scan.nextDouble();
		double salario = ganha * horas;
		
		double ir 		 = 11.0 / 100.0;
		double inss 	 =  8.0 / 100.0;
		double sindicato =  5.0 / 100.0;
		
		double pagoIr = (ir * salario);
		double pagoInss = (inss * salario);
		double pagoSind = (sindicato * salario);
		double valorLiquido = salario - ((ir * salario) + (inss * salario) + (sindicato * salario));
		
		
		System.out.println("\nSalario Bruto: " + salario);
		System.out.println("IR: " + pagoIr);
		System.out.println("INSS: " + pagoInss);
		System.out.println("Sindicato: " + pagoSind);
		System.out.println("Salario Liquido: " + valorLiquido);
		
		

	}

}
