package com.leonardo.cursojava.aulaEx8;

public class Agenda {
	
	private String nome;
	private Contato[] contatos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public Contato[] resize() {
		Contato[] novoVetor = new Contato[contatos.length*2];
		for(int i=0; i<contatos.length; i++) {
			novoVetor[i] = contatos[i];
		}	
		
		return novoVetor;
	}
	
	public Contato buscaContato(String nome) throws Exception {
		Contato retorno = null;
		if (contatos.length == 0) {
			throw new Exception("Lista vazia");
		}
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i].getNome().equals(nome)) {
				retorno = contatos[i];
			}
		}
		
		return retorno;
	}
	
	public String buscaTodos() throws Exception {
		String retorno = "----------------";
		if(contatos.length == 0) {
			throw new Exception("Lista vazia");
		}

		for(int i=0; i<this.contatos.length; i++) {
			if(contatos[i] == null) {
				break;
			}
			retorno += "\nContato: " + (i+1) + "\n" + 
						"Nome: "+contatos[i].getNome() +"\n"+
						"Fone: "+contatos[i].getTelefone() +"\n"+
						"Email: "+contatos[i].getEmail() + "\n";
		}
		
		retorno += "----------------";
				
		return retorno;
	}

	
}
