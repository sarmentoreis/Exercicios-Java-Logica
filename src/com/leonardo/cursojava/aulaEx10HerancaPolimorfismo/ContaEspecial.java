package com.leonardo.cursojava.aulaEx10HerancaPolimorfismo;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	
	
	
	
	public ContaEspecial(String nomeCliente, String numConta, double limite) {
		super(nomeCliente, numConta);
		this.limite = limite;
	}	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		
		String s = "\nConta Especial[";
		s += " Limite: " + this.limite;
		s += super.toString();
		s += "]\n";
		return s;
	}
	
	public boolean sacar(double saque) {
		
		double saldoComLimite = super.getSaldo() + this.limite;
		
		if((saldoComLimite - saque) >= 0) {
			super.setSaldo(super.getSaldo()- saque);
			return true;
		}
		return false;
		
	}
}
