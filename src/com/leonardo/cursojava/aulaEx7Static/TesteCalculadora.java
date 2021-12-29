package com.leonardo.cursojava.aulaEx7Static;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		System.out.println("Soma 5+13 = " + Calculadora.somar(5, 13));
		System.out.println("Subtrair 10-20 = " + Calculadora.subtrair(10, 20));
		System.out.println("Multiplicar 6x4 = " + Calculadora.multiplicar(6, 4));
		System.out.println("Dividir 10/2 = " + Calculadora.dividir(10, 2));
		System.out.println("Potencia 4a4 = " + Calculadora.potencia(4, 4));
		System.out.println("Fatorial 5 = " + Calculadora.fatorial(5));
		System.out.println("Fatorial 5 (Recursivo) = " + Calculadora.fatorialRecursivo(5));
		
		System.out.println("\nFibonacci\n");
		for(int i=0; i<30; i++) {
			System.out.println("("+ i + "):" + Calculadora.fibonacci(i) + "\t");
		}
		
		System.out.println("\nSoma Recursiva\n");
		System.out.println("Ate 20: " + Calculadora.somaRec(1, 20));
		
	}

}
