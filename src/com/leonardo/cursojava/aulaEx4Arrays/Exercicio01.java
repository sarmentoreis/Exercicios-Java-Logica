package com.leonardo.cursojava.aulaEx4Arrays;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
//		Ex 1
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int [a.length];		
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Digite o elemento " + (i+1) + " :");
			a[i] = scan.nextInt();
			b[i] = a[i];
						
		}
		for(int y=0; y<a.length; y++) {
			System.out.println("Elementos A " + (y+1) +" :" + a[y]);			
		}
		System.out.println("");
		for(int y=0; y<a.length; y++) {
			System.out.println("Elementos B " + (y+1) +" :" + b[y]);
		}
	}

}
