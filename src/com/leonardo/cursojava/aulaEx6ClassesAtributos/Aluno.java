package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private double[] notas = new double[3];
	
	
	
	public double getNotas(int opcao) {
		return notas[opcao];
	}



	public void setNotas(double[] notas) {
		this.notas = notas;
	}



	public String getDisciplinas(int opcao) {
		return disciplinas[opcao];
	}



	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}



	boolean isAprovado (int disciplina) {
		if(notas[disciplina] >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
}
