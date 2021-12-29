package com.leonardo.cursojava.aulaEx7Static;

public class Calculadora {
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double potencia(double num1, double num2) {
		double result = num1;
		for(int i=1; i<num2; i++) {
			result *= num1;
		}
		
		return result;
	}
	
	public static int fatorial(int num) {
		int fat = 1;
		for(int i=num; i>0; i--) {
			fat *= i;
		}
		
		return fat;
	}
	
	public static int fatorialRecursivo(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * fatorialRecursivo(num-1);
	}
	
	public static int fibonacci(int num) {
		
		if(num < 2) {
			return num;
		}else {
			return fibonacci(num-1) + fibonacci(num-2);
		}
	}
	
	public static int somaRec(int inicio, int fim) {
		
		if(inicio == fim) {
			return inicio;
		}
		
		return inicio += somaRec(inicio+1, fim);
	}
}
