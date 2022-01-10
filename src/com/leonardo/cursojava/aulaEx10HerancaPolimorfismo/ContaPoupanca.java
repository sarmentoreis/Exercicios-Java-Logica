package com.leonardo.cursojava.aulaEx10HerancaPolimorfismo;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	
	
	public ContaPoupanca(String nomeCliente, String numConta) {
		super(nomeCliente, numConta);
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "\nConta Poupanca[";
		s += " diaRendimento: " + this.diaRendimento;
		s += super.toString();
		s += "]\n";
		return s;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			super.setSaldo(super.getSaldo() + (super.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
	
	
	
	
		
}
