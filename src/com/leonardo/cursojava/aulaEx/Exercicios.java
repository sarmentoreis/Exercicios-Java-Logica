package com.leonardo.cursojava.aulaEx;

import java.util.Scanner;
import java.util.zip.Deflater;

import org.omg.CORBA.INV_FLAG;

public class Exercicios {

	public static void main(String[] args) {
		
		//Ex 1 - Faca um Programa que mostre a mensagem "Alo mundo" na tela.
		
		System.out.println("Alo mundo");
		
		//Ex 2 - Faca um Programa que peca um numero e entao mostre a mensagem 
		  //O numero informado foi [numero].
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		System.out.println("Voce digitou o numero: " + numero);
		
		//Ex 3 - Faca um Programa que peca dois numeros e imprima a soma.
		
		System.out.println("Digite um numero: ");
		int val1 = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int val2 = scan.nextInt();
		int resultado = val1 + val2;
		System.out.println("A soma dos dois numeros e: " + resultado);
		
		//Ex 4 - Faca um Programa que peca as 4 notas bimestrais e mostre a media.
		
		System.out.println("Digite a primeira nota: ");
		val1 = scan.nextInt();
		System.out.println("Digite a segunda nota: ");
		val2 = scan.nextInt();
		System.out.println("Digite a terceira nota: ");
		int val3 = scan.nextInt();
		System.out.println("Digite a quarta nota: ");
		int val4 = scan.nextInt();
		double media = (double)(val1 + val2 + val3 + val4) /4;
		System.out.printf("A sua media e: %.2f \n", media);
		
		//Ex 5 - Faca um Programa que converta metros para centimetros
		
		System.out.println("Digite um valor em metros: ");
		double metros = scan.nextDouble();
		double cm = metros * 100;
		System.out.println("Valor em centimetros: " + cm);
		
		//Ex 6 - Faca um Programa que peca o raio de um circulo, calcule e mostre sua area.
		
		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		double diametro = Math.PI * Math.pow(raio, 2);
		System.out.printf("A area do circulo e: %.2f \n", diametro);
		
		
		

	}

}
