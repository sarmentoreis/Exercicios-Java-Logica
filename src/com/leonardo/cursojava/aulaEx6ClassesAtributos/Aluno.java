package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class Aluno {
	
	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[] notas = new double[3];
	
	
	boolean isAprovado (int disciplina) {
		if(notas[disciplina] >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
}
