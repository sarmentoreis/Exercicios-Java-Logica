package com.leonardo.cursojava.aulaEx9;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		
		//Objeto da classe Scanner
		Scanner scan = new Scanner(System.in);
		//Criando vetor de alunos
		Aluno[] alunos = new Aluno[3];
		//Criando vetor de notas dos alunos
		double[] notasAl1 = new double[4];	
		double[] notasAl2 = new double[4];	
		double[] notasAl3 = new double[4];	
		
		//Criando cada aluno.
		Aluno aluno1 = new Aluno();
			aluno1.setNome("Leonardo");
			aluno1.setMatricula("00001");			
			aluno1.setNotas(notasAl1);
		Aluno aluno2 = new Aluno();
			aluno2.setNome("Luiz");
			aluno2.setMatricula("00002");
			aluno2.setNotas(notasAl2);
		Aluno aluno3 = new Aluno();
			aluno3.setNome("Marcus");
			aluno3.setMatricula("00003");
			aluno3.setNotas(notasAl3);
		
		//Instanciando o vetor de alunos com cada aluno.
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		alunos[2] = aluno3;
			
		//Criando o professor.
		Professor prof = new Professor("Sergio", "Desenvolvimento de sistemas", "sergio@ti.com");
		
		//Instanciando o curso com o nome, horario, professor e alunos.
		Curso curso = new Curso("Programacao", "13:00h", prof, alunos);
		
		//Inicializacao do programa com o curso feito.
		
		System.out.println("Curso de " + curso.getNome());
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		
		for(int i=0; i<curso.getAlunos().length; i++) {
			System.out.println("\nEntre com as notas do aluno " + (i+1)+ " - " + curso.getAlunos()[i].getNome());
			System.out.print("\nNota 1: ");
			nota1 = scan.nextDouble();
			System.out.print("\nNota 2: ");
			nota2 = scan.nextDouble();
			System.out.print("\nNota 3: ");
			nota3 = scan.nextDouble();
			System.out.print("\nNota 4: ");
			nota4 = scan.nextDouble();
			
			curso.setNotas(i, nota1,nota2,nota3,nota4);
		}
		
		notasAl1 = curso.getNotas(1);
		notasAl2 = curso.getNotas(2);
		notasAl3 = curso.getNotas(3);		
		
		System.out.print("\nNotas de Leonardo: ");
		for(int i=0; i<notasAl1.length; i++) {
			if(i == (notasAl1.length -1)) {
				System.out.print(notasAl1[i]);
			}else {
				System.out.print(notasAl1[i] +", ");
			}
		}
		
		System.out.print("\nNotas de Luiz: ");
		for(int i=0; i<notasAl2.length; i++) {
			if(i == (notasAl2.length -1)) {
				System.out.print(notasAl2[i]);
			}else {
				System.out.print(notasAl2[i] +", ");
			}
		}
		
		System.out.print("\nNotas de Marcus: ");
		for(int i=0; i<notasAl3.length; i++) {
			if(i == (notasAl3.length -1)) {
				System.out.print(notasAl3[i]);
			}else {
				System.out.print(notasAl3[i] +", ");
			}
			
		}

		
		
		
		
		
		
		
		
		
	}

}
