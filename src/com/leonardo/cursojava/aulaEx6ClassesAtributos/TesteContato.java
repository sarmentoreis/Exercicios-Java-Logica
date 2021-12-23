package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		
		contato1.nome = "Dante";
		contato1.email = "dante@email.com";
		contato1.endereco = "Rua 1, 123 - Jd Java";
		contato1.telefones = new String[3];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "91234-4321";
		
		System.out.println("Nome: " + contato1.nome);
		System.out.println("Email: " + contato1.email);
		System.out.println("Endereco: " + contato1.endereco);
		System.out.println("Telefone 1: " + contato1.telefones[0]);
		System.out.println("Telefone 2: " + contato1.telefones[1]);
		
	}

}
