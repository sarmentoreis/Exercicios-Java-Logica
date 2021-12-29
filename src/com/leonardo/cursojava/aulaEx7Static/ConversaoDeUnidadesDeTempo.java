package com.leonardo.cursojava.aulaEx7Static;

public class ConversaoDeUnidadesDeTempo {
	
	public static int minutoToSegundo(int minuto) {
		return minuto * 60;
	}
	
	public static int horaToMinuto(int hora) {
		return hora * 60;
	}
	
	public static int diaToHora(int dia) {
		return dia * 24;
	}
	
	public static int semanaToDia(int semana) {
		return semana * 7;
	}
	
	public static int mesToDias(int mes) {
		return mes * 30;
	}
	
	public static double anoToDias(double ano) {
		return ano * 365.25;
	}
}
