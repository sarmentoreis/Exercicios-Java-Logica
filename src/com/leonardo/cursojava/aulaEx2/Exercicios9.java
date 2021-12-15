package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios9 {

	public static void main(String[] args) {

//		Ex 20
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vitima?");
		String resp1 = scan.next();
		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();
		System.out.println("Mora perto da vitima?");
		String resp3 = scan.next();
		System.out.println("Devia para a vitima?");
		String resp4 = scan.next();
		System.out.println("Ja trabalhou com a vitima?");
		String resp5 = scan.next();
		
		int classificacao = 0;
		
		if(resp1.equalsIgnoreCase("Sim") || resp1.equalsIgnoreCase("S")) {
			classificacao++;
		}
		if(resp2.equalsIgnoreCase("Sim") || resp2.equalsIgnoreCase("S")) {
			classificacao++;
		}
		if(resp3.equalsIgnoreCase("Sim") || resp3.equalsIgnoreCase("S")) {
			classificacao++;
		}
		if(resp4.equalsIgnoreCase("Sim") || resp4.equalsIgnoreCase("S")) {
			classificacao++;
		}
		if(resp5.equalsIgnoreCase("Sim") || resp5.equalsIgnoreCase("S")) {
			classificacao++;
		}
		
		switch (classificacao) {		
		case 2:
			System.out.println("\nSuspeita");
			break;
		case 3:
		case 4:
			System.out.println("\nCumplice");
			break;
		case 5:
			System.out.println("\nAssassino");
			break;
		default:
			System.out.println("\nInocente");
			break;
		}
	}

}
