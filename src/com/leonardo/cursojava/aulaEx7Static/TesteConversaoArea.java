package com.leonardo.cursojava.aulaEx7Static;

import java.text.DecimalFormat;

public class TesteConversaoArea {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat();
				
		System.out.println("236 Metros para Pes = " + df.format(ConversaoDeUnidadesDeArea.metrosToPes(236)));
		System.out.println("10 Acre para Pes =  " + df.format(ConversaoDeUnidadesDeArea.acreToPes(10)));
		System.out.println("200 Pes para Centimetros = " + df.format(ConversaoDeUnidadesDeArea.peToCm(200)));
		System.out.println("500 Milhas para Acre = " + df.format(ConversaoDeUnidadesDeArea.milhaToAcre(500)));
	}

}
