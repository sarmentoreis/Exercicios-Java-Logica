package com.leonardo.cursojava.aulaEx2;

import java.util.Scanner;

public class Exercicios7 {

	public static void main(String[] args) {
		
//		Ex 15
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro lado: ");
		int lado1 = scan.nextInt();
		System.out.println("Insira o segundo lado: ");
		int lado2 = scan.nextInt();
		System.out.println("Insira o terceiro lado: ");
		int lado3 = scan.nextInt();
		
		if ((lado1 + lado2 > lado3) ||
				(lado1 + lado3 > lado2)||
					lado2 + lado3 > lado1) {
			
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Triangulo Equilatero");
			}
			else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Isosceles");
			}
			else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triangulo Escaleno");
			}
			
		}else {
			System.out.println("Nao forma um triangulo.");
		}
		
		
//		Ex 16
		
			System.out.println("\nDigite o valor de A: ");
			int a = scan.nextInt();
			if(a == 0) {
				System.out.println("O valor de A e igual a 0, portanto nao e mais uma equacao de segundo grau.");
			}else {
				System.out.println("Digite o valor de B: ");
				int b = scan.nextInt();
				System.out.println("Digite o valor de C: ");
				int c = scan.nextInt();
				
							   //Ou (b*b)
				double delta = Math.pow(b, 2) - (4*a*c);
				if(delta < 0) {
					System.out.println("O valor de delta: " + delta + " e menor que 0, portanto nao possui raizes reais.");
				}else {
					
					double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
					double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
					System.out.println("Delta = " + delta);
					System.out.println("X1 = " + x1);
					System.out.println("X2 = " + x2);
				}
				
			}
						  
			
			
		
	}

}
