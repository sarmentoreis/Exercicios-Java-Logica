package com.leonardo.cursojava.aula36;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Leonardo");
		//contato.setEndereco("Rua 1");
		//contato.setTelefone("11 99999-9999");
		
		
		//Criando objeto endereco.
		Endereco end = new Endereco();
		end.setLogradouro("Rua Paraiso");
		end.setNumero("S/N");
		end.setCidade("Metropolis");
		end.setEstado("Neo");
		end.setCep("99999-999");
		
		//Set endereco
		contato.setEndereco(end);
		
		//Criando objeto telefone.
		Telefone tel = new Telefone();
		tel.setTipo("Celular");
		tel.setDdd("11");
		tel.setNumero("99999-9999");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("Fixo");
		tel2.setDdd("11");
		tel2.setNumero("3232-3232");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		//Set telefone
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println("DDD: " + t.getDdd()+ "\nFone: " + t.getNumero());
			}
		}
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
	}

}
