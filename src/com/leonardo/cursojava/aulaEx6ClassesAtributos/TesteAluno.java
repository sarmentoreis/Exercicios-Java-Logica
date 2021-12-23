package com.leonardo.cursojava.aulaEx6ClassesAtributos;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.nome = "Leonardo";
		a1.matricula = "12546";
		a1.curso = "Desenvolvimento de sistemas";
		a1.disciplinas[0] = "Logica de programacao";
		a1.notas[0] = 7.5;
		a1.disciplinas[1] = "Banco de dados";
		a1.notas[1] = 9.0;
		a1.disciplinas[2] = "Estrutura de dados";
		a1.notas[2] = 5.0;
		
		a2.nome = "Dante";
		a2.matricula = "77456";
		a2.curso = "Desenvolvimento de sistemas";
		a2.disciplinas[0] = "Logica de programacao";
		a2.notas[0] = 10.0;
		a2.disciplinas[1] = "Banco de dados";
		a2.notas[1] = 7.0;
		a2.disciplinas[2] = "Estrutura de dados";
		a2.notas[2] = 9.0;
		
		String usuario = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		while (usuario == "") {
			System.out.println("Digite a matricula do aluno: ");
			String matricula = scan.nextLine();
			
			if(matricula.equals("12546")) {
				System.out.println("Bem vindo " + a1.nome);
				usuario = "a1";
			}else if (matricula.equals("77456")) {
				System.out.println("Bem vindo " + a2.nome);
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
				System.out.println("Disciplina selecionada: " + a1.disciplinas[opcao]);
				System.out.println("Nota: " + a1.notas[opcao]);
				if(resultado) {
					System.out.println("Aprovado!");
				}else {
					System.out.println("Reprovado!");
				}
			}else {
				resultado = a2.isAprovado(opcao);
				System.out.println("Disciplina selecionada: " + a2.disciplinas[opcao]);
				System.out.println("Nota: " + a2.notas[opcao]);
				if(resultado) {
					System.out.println("Aprovado!");
				}else {
					System.out.println("Reprovado!");
				}
			}
		}
		
		
	

	}

}
