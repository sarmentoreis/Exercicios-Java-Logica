package com.leonardo.cursojava.aulaEx7Static;

public class TesteConversaoTempo {

	public static void main(String[] args) {
		
		System.out.println("60 minutos em segundos = " + ConversaoDeUnidadesDeTempo.minutoToSegundo(60));
		System.out.println("24 horas em minutos = " + ConversaoDeUnidadesDeTempo.horaToMinuto(24));
		System.out.println("7 dias em horas = " + ConversaoDeUnidadesDeTempo.diaToHora(7));
		System.out.println("4 semanas em dias = " + ConversaoDeUnidadesDeTempo.semanaToDia(4));
		System.out.println("3 meses em dias = " + ConversaoDeUnidadesDeTempo.mesToDias(3));
		System.out.println("2 anos em dias = " + ConversaoDeUnidadesDeTempo.anoToDias(2));
	}

}
 