package com.leonardo.cursojava.aulaEx9;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	
	
	public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
		
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
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
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
	
	public double calculaMedia(int aluno) {
		
		double mediaRetorno = 0;
		double[] notas = new double[4];
		
		notas = getNotas(aluno);
		
		for(int i=0; i<notas.length; i++) {
			mediaRetorno += notas[i];
		}
		
		mediaRetorno = mediaRetorno/4;
		
		return mediaRetorno;
		
	}
	
	public double calculaMediaTurma() {
		
		double mediaTurma = 0;
		
		double aluno1 = calculaMedia(1);
		double aluno2 = calculaMedia(2);
		double aluno3 = calculaMedia(3);
		
		mediaTurma = (aluno1 + aluno2 + aluno3) / 3;
		
		return mediaTurma;
	}
	 	
}
