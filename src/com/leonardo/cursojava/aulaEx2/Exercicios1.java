package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

import javax.swing.UIManager;

import org.omg.CosNaming.NamingContextExt;

import javafx.scene.PerspectiveCamera;
import javafx.scene.shape.ObservableFaceArray;

public class Exercicios1 {
	
	public static void main(String[] args) {
//		Ex 1 - Faca um programa que peca dois numeros e imprima o maior deles.
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int primeiro = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int segundo = scan.nextInt();
		
		if(primeiro > segundo) {
			
			System.out.println("O maior numero foi: " + primeiro);
		}
		else {
			System.out.println("O maior numero foi: " + segundo);
		}
		
//		Ex 2 - Faca um programa que peca um valor e mostre na tela se o valor e positivo ou negativo.
 		
		System.out.println("Digite um numero: ");
		int valor = scan.nextInt();
		
		if (valor >= 0) {
			System.out.println("O valor e positivo.");
		}
		else {
			System.out.println("O valor e negativo.");
		}
		
//		Ex 3 - Faca um programa que verifique se uma letra digitada e 'F' ou 'M'. Conforme a letra escrever:
//			F - Feminino, M - Masculino, Sexo Invalido.
		
		System.out.println("Digite seu sexo - (F, M): ");
		char sexo = scan.next().charAt(0);
		
		if (sexo == 'M' || sexo == 'm') {
			System.out.println("Selecionado: " + sexo + " - Masculino.");
		}
		else if (sexo == 'F' || sexo == 'f') {
			System.out.println("Selecionado: " + sexo + " - Feminino.");
		}
		else {
			System.out.println("Sexo invalido.");
		}
		
		
//		Ex 4 - Faca um programa que verifique se uma letra digitada e vogal ou consoante.
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
		|| letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
			System.out.println("A letra digitada e uma VOGAL.");
		}
		else {
			System.out.println("A letra digitada e uma CONSOANTE.");
		}
		
		//Versao com switch
		
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": 
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("A letra digitada e uma VOGAL.");
			break;		
		default:
			System.out.println("A letra digitada e uma CONSOANTE.");			
		}
		
 	}

}
