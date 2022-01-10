package com.leonardo.cursojava.aulaEx10HerancaPolimorfismo;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	
	
	@Override
	public String toString() {
		
		String s = "\n\"";
				
		s += "Nome do cliente: " + this.nomeCliente + "\n";
		s += " Numero da conta: " + this.numConta + "\n";
		s += " Saldo: " + this.saldo;
						
		return s + "\"";
	}


	public ContaBancaria(String nomeCliente, String numConta) {		
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = 0;
	}


	public boolean sacar(double saque) {
		
		if((this.saldo - saque) >= 0) {
			this.saldo -= saque;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public void depositar(double deposito) {
		
		this.saldo += deposito;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getNumConta() {
		return numConta;
	}


	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
