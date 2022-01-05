package com.leonardo.cursojava.aulaEx9;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	
	
	
	public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
		super();
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessores() {
		return professor;
	}
	public void setProfessores(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public void setNotas(int aluno, double nota1, double nota2, double nota3, double nota4) {
		this.alunos[aluno].getNotas()[0] = nota1;
		this.alunos[aluno].getNotas()[1] = nota2;
		this.alunos[aluno].getNotas()[2] = nota3;
		this.alunos[aluno].getNotas()[3] = nota4;
	}
	
	public double[] getNotas(int aluno) {
		
		double[] retorno = new double[4];
		
		retorno[0] = getAlunos()[aluno - 1].getNotas()[0];
		retorno[1] = getAlunos()[aluno - 1].getNotas()[1];
		retorno[2] = getAlunos()[aluno - 1].getNotas()[2];
		retorno[3] = getAlunos()[aluno - 1].getNotas()[3];
		
		return retorno;
		
		
	}
	 	
}
