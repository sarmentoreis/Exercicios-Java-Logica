package com.leonardo.cursojava.aulaEx6ClassesAtributos;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Leonardo", "12546", "Desenvolvimento de sistemas",
				   new String[] {"Logica de programacao","Banco de dados","Estrutura de dados"},
				   new double[] {7.5, 9.0, 5.0});
		
		
		Aluno a2 = new Aluno("Dante" , "77456", "Desenvolvimento de sistemas", 
				   new String[] {"Logica de programacao","Banco de dados","Estrutura de dados"},
				   new double[] {10.0, 7.0, 9.0});
		
		
		
		String usuario = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		while (usuario == "") {
			System.out.println("Digite a matricula do aluno: ");
			String matricula = scan.nextLine();
			
			if(matricula.equals("12546")) {
				System.out.println("Bem vindo " + a1.getNome());
				usuario = "a1";
			}else if (matricula.equals("77456")) {
				System.out.println("Bem vindo " + a2.getNome());
				usuario = "a2";
			}else {
				System.out.println("Aluno nao cadastrado.");
			}	
		}
		
		
		System.out.println("Digite a disciplina para verificar se esta aprovado: \n");
		System.out.println("1. Logica de programcao");
		System.out.println("2. Banco de dados");
		System.out.println("3. Estrutura de dados");
		
		int opcao = (scan.nextInt() - 1);
		boolean resultado;
		if(opcao < 0 || opcao >3) {
			System.out.println("Opcao invalida.");
		}else {
			if(usuario.equals("a1")) {
				resultado = a1.isAprovado(opcao);
				System.out.println("Disciplina selecionada: " + a1.getDisciplinas(opcao));
				System.out.println("Nota: " + a1.getNotas(opcao));
				if(resultado) {
					System.out.println("Aprovado!");
				}else {
					System.out.println("Reprovado!");
				}
			}else {
				resultado = a2.isAprovado(opcao);
				System.out.println("Disciplina selecionada: " + a2.getDisciplinas(opcao));
				System.out.println("Nota: " + a2.getNotas(opcao));
				if(resultado) {
					System.out.println("Aprovado!");
				}else {
					System.out.println("Reprovado!");
				}
			}
		}
		
		
	

	}

}
