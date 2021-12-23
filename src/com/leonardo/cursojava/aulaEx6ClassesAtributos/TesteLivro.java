package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class TesteLivro {

	public static void main(String[] args) {
		
		Livro divinaComedia = new Livro();
		
		divinaComedia.titulo = "Divina Comedia - Inferno";
		divinaComedia.autor = "Dante Alighieri";
		divinaComedia.editora = "Editora 34";
		divinaComedia.idioma = "Portugues";
		divinaComedia.qtdPaginas = 696;
		divinaComedia.capaDura = false;
		divinaComedia.isbn = "857326120X";
		
		System.out.println("Titulo: " + divinaComedia.titulo);
		System.out.println("Autor: " + divinaComedia.autor);
		System.out.println("Editora: " + divinaComedia.editora);
		System.out.println("Idioma: " + divinaComedia.idioma);
		System.out.println("Quantidade de paginas: " + divinaComedia.qtdPaginas);
		System.out.println("Capa dura: " + divinaComedia.capaDura);
		System.out.println("ISBN-10: " + divinaComedia.isbn);
	}

}
