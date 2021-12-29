package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada L1 = new Lampada("Elgin", "LED", 60.5, 'A', "Fria", "9W");
		
		System.out.println("Marca: "+ L1.getMarca());
		System.out.println("Tipo: "+ L1.getTipo());
		System.out.println("Temperatura: "+ L1.getTemperatura());
		System.out.println("Classificacao: "+ L1.getClassificacao());
		System.out.println("Cor: "+ L1.getCor());
		System.out.println("Potencia: "+ L1.getPotencia());
		
		System.out.println("\n");
		
		L1.ligarLampada();
		System.out.println("Estado da lampada: " + L1.isLigada());
		L1.desligarLampada();
		System.out.println("Estado da lampada: " + L1.isLigada());
		
		
	}
}
