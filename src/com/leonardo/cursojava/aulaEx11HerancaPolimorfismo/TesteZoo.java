package com.leonardo.cursojava.aulaEx11HerancaPolimorfismo;

public class TesteZoo {

	public static void main(String[] args) {
		
		Animal[] zoo = new Animal[3];
		
		Mamifero camelo = new Mamifero("Camelo",150 , 4, "Amarelo", 2.0, null);
		Peixe tubarao = new Peixe("Tubarao", 300, 0, 1.5, "Barbatanas e cauda");
		Mamifero urso = new Mamifero("Urso-do-canada", 180, 4, "Vermelho", 0.5, "Mel");
		
		zoo[0] = camelo;
		zoo[1] = tubarao;
		zoo[2] = urso;
		
		System.out.println("Zoo:");
		System.out.println("-----------------------");
		
		for(Animal animal : zoo) {			
			System.out.println(animal.toString());
			System.out.println("-----------------------");
		}
		
		
	}

}
