package com.leonardo.cursojava.aulaEx7Static;

import java.text.DecimalFormat;

public class TesteConversaoVolume {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("1 litro para centimetros cubicos = " + df.format(ConversaoDeUnidadesDeVolume.litroToCm(1)));
		System.out.println("1 metro cubico para litros = " + df.format(ConversaoDeUnidadesDeVolume.metroToLitro(1)));
		System.out.println("1 metro cubico para pes cubicos = " + df.format(ConversaoDeUnidadesDeVolume.metroToPes(1)));
		System.out.println("1 galao americano para polegadas cubicas = " + df.format(ConversaoDeUnidadesDeVolume.galaoToPol(1)));
		System.out.println("1 galao americano para litros = " + df.format(ConversaoDeUnidadesDeVolume.galaoToLitro(1)));
	}

}
