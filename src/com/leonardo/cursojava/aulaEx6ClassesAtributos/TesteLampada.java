package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada L1 = new Lampada();
		
		L1.marca = "Elgin";
		L1.tipo = "LED";
		L1.temperatura = 60.5;
		L1.classificacao = 'A';
		L1.cor = "Fria";
		L1.potencia = "9W";
		
		System.out.println("Marca: "+ L1.marca);
		System.out.println("Tipo: "+ L1.tipo);
		System.out.println("Temperatura: "+ L1.temperatura);
		System.out.println("Classificacao: "+ L1.classificacao);
		System.out.println("Cor: "+ L1.cor);
		System.out.println("Potencia: "+ L1.potencia);
		
		System.out.println("\n");
		
		L1.ligarLampada();
		System.out.println("Estado da lampada: " + L1.isLigada);
		L1.desligarLampada();
		System.out.println("Estado da lampada: " + L1.isLigada);
		
		
	}
}
