package com.leonardo.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciencia da Computacao");
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciencia da Computacao");
		double[] notas2 = {5,6,2,1};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno);
		
		System.out.println(aluno.equals(aluno2));
		
		
	}

}
