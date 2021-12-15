package com.leonardo.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue2 {

	public static void main(String[] args) {
		
//		Continue
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for(int i=num; i<=max; i++) {
			if(i % 7 == 0) {				
				continue;
			}
			
			System.out.println("O valor de i e: " + i);
		}
	}

}
