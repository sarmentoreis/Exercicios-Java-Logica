package com.leonardo.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		//So e possivel instanciar sendo classe nao-abstrata.
		//Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		professor.setCpf("000.000.000-00");
		
		Pessoa aluno2 = new Aluno();
		
		Pessoa professor2 = new Professor();
		
		//pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		System.out.println(Constantes.URL_GOOGLE);
		
	}

}
