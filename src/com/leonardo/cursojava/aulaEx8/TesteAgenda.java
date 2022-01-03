package com.leonardo.cursojava.aulaEx8;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		
		int opcao = 9999;
		int slot = 0;
		int capacidade = 1;
		Contato[] contatos = new Contato[capacidade];
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		System.out.println("Entre com o nome da agenda: ");
		String nomeAgenda = scan.nextLine();
		agenda.setNome(nomeAgenda);
		
		while(opcao != 0) {
			
			do {
				if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0) {
					System.out.println("Nome da agenda - " + agenda.getNome());
					System.out.println("\n1 - Adicionar contato\n"
									 + "2 - Buscar contato\n"
									 + "3 - Listar contatos\n"
									 + "0 - Encerrar\n");
					opcao = scan.nextInt();
					if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 0) {
						System.out.println("\n--Opcao invalida--\n");
					}
					scan.nextLine();
				}

			} while (opcao <0 && opcao >3);


			if(opcao == 1) {	
				
				char add = 's';
				while (add != 'n' && add != 'N') {
						Contato contato = new Contato();
						System.out.print("\nDigite o nome do contato: ");
						String nome = scan.nextLine();
						System.out.print("\nDigite o telefone do contato: ");
						String telefone = scan.nextLine();
						System.out.print("\nDigite o email do contato: ");
						String email = scan.nextLine();					
						contato.setNome(nome);
						contato.setTelefone(telefone);
						contato.setEmail(email);
						contatos[slot] = contato;
						agenda.setContatos(contatos);
						slot++;
						if(capacidade >= contatos.length) {
							contatos = agenda.resize();
						}				
						capacidade++;
						opcao = -1;
						if(add == 's' || add == 'S') {
							do {
								System.out.println("\nGostaria de adicionar mais um contato? s/n");
								add = scan.next().charAt(0);	
								scan.nextLine();
							} while (add != 'n' && add != 'N' && add != 's' && add != 'S');
							 	
						}				
				}
				
			}
			if(opcao == 2) {
				char busca = 's';
				while (busca != 'n' && busca != 'N') {					
					System.out.println("Entre com o nome do contato para buscar: ");
					String nomeBusca = scan.nextLine();
					Contato retornoContato = null;
					opcao = -1;
					try {
						retornoContato = agenda.buscaContato(nomeBusca);
					} catch (Exception e) {
						System.err.println("\n**Lista vazia**\n");
					}
					if(retornoContato == null) {
						System.out.println("Contato inexistente.");
					}else {
						System.out.println("\n*-Contato-*\n");
						System.out.println("Nome: " + retornoContato.getNome());
						System.out.println("Fone: " + retornoContato.getTelefone());
						System.out.println("Email: " + retornoContato.getEmail());
					}
					if(busca == 's' || busca == 'S') {
						do {
								System.out.println("\nGostaria de buscar outro contato? s/n");
								busca = scan.next().charAt(0);
								scan.nextLine();
						} while(busca != 'n' && busca != 'N' && busca != 's' && busca != 'S');
					}						
				}
			}
			
			if(opcao == 3) {		
				String retornoLista = "";
				opcao = -1;
				try {
					retornoLista = agenda.buscaTodos();
				} catch (Exception e) {
					System.err.println("\n**Lista vazia**\n");
				}
				
				System.out.println(retornoLista);
			}
			
			if(opcao == 0) {
				System.out.println("Obrigado, ate logo!");
			}
		}
		
	}

}
