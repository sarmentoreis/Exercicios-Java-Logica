package com.leonardo.cursojava.aulaEx3Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
//		Ex 1
		
		Scanner scan = new Scanner(System.in);
		int nota = -1;
		while(nota < 0 || nota > 10) {			
			System.out.println("Digite uma nota de 0 a 10: ");
			nota = scan.nextInt();
		}
		System.out.println("Nota digitada foi: " + nota);
		
		
		
			
//		Ex 2
		boolean iguais;
		String usuario;
		String senha;
		do {
			System.out.println("\nDigite o nome do usuario: ");
			usuario = scan.next();
			System.out.println("Digite sua senha: ");
			senha = scan.next();
			iguais = usuario.equalsIgnoreCase(senha);
			if(iguais) {
				System.out.println("O usuario e a senha nao podem ser iguais!");
			}
		} while (iguais);
		System.out.println("\nUsuario: "+ usuario);
		System.out.println("Senha: " + senha);
		
		
//		Ex 3
		InputStream entrada = System.in;
		InputStreamReader leitorInput = new InputStreamReader(entrada);
		BufferedReader teclado = new BufferedReader(leitorInput);
		String nome;
		int idade;
		double salario;
		char sexo;
		char estadoCivil;		
		boolean isNome = false;
		boolean isIdade = false;
		boolean isSalario = false;
		boolean isSexo = false;
		boolean isEstadoCivil = false;
		
		while(!isNome || !isIdade || !isSalario || !isSexo || !isEstadoCivil) {
			
			System.out.println("\nQual o seu nome? ");
			nome = teclado.readLine();
			System.out.println("Qual a sua idade? ");
			idade = Integer.parseInt(teclado.readLine());	
			System.out.println("Digite seu salario: ");
			salario = Double.parseDouble(teclado.readLine());
			System.out.println("Qual o seu sexo? ");
			sexo = (char)teclado.read();
			teclado.readLine();
			System.out.println("Qual o seu estado civil(s,c,v,d)? ");
			estadoCivil = (char)teclado.read();
			teclado.readLine();
			
			if(nome.length() <=3 ) {
				System.out.println("O nome precisa ter mais de 3 caracteres.");
				isNome = false;
			}else {
				isNome = true;
			}
			
			if (idade < 0 || idade > 150) {
				System.out.println("Sua idade precisa estar entre 0 a 150.");
				isIdade = false;
			}else {
				isIdade = true;
			}
			
			if (salario < 0.0) {
				System.out.println("O salario precisa ser maior que 0");
				isSalario = false;
			}else {
				isSalario = true;
			}
			
			if ((sexo != 'f') && (sexo != 'm') && (sexo != 'F') && (sexo != 'M')) {
				System.out.println("O sexo precisa ser F ou M");
				isSexo = false;
			}else {
				isSexo = true;
			}
			
			if ((estadoCivil != 's') && (estadoCivil != 'c') && (estadoCivil != 'v') && (estadoCivil != 'd')
			 && (estadoCivil != 'S') && (estadoCivil != 'C') && (estadoCivil != 'V') && (estadoCivil != 'D')) {
				System.out.println("Digite um estado civil valido.");
				isEstadoCivil = false;
			}else {
				isEstadoCivil = true;
			}		
		}
		
		System.out.println("Validacoes efetuadas.");
		

	}
		
}
