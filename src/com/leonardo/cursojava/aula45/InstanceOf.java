package com.leonardo.cursojava.aula45;
import com.leonardo.cursojava.aula44.*;

public class InstanceOf {

	public static void main(String[] args) {
		
		Cachorro canino = new Cachorro();
		Gato felino = new Gato();
		Cavalo equino = new Cavalo();
		
		if(canino instanceof Cachorro) {
			System.out.println("Objeto do tipo Cachorro");
		}
		
		if(felino instanceof Gato) {
			System.out.println("Objeto do tipo Gato");
		}
		
		if(equino instanceof Cavalo) {
			System.out.println("Objeto do tipo Cavalo");
		}
	}

}
