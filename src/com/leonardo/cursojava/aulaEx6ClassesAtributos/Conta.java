package com.leonardo.cursojava.aulaEx6ClassesAtributos;

public class Conta {
	
	private String numero;
	private double saldo = 300;
	private boolean especial;
	private double limite = 1000;
	
	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Conta(String numero, boolean especial) {
		super();
		this.numero = numero;
		this.especial = especial;
	}

	void saque(double valor) {		
		if(valor > saldo) {
			if(especial) {
				System.out.println("\nSaldo nao disponivel, utilizando cheque-especial.");
				if(valor > saldo+limite) {
					System.out.println("Limite maximo, operacao invalida.");
				}else {
					saldo -= valor;
					System.out.println("Saque: " + valor);					
	 			}
			}
			else {
				System.out.println("Sua conta nao possui cheque-especial.");
			}
		}else if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque: " + valor);
			
		}else {
			System.out.println("Limite maximo, operacao invalida.");
			
		}
	}
	
	void deposito(double valor) {
		saldo += valor;
		System.out.println("Valor depositado: " + valor);
		
	}
	
	void consulta() {
		System.out.println("Saldo disponivel: " + saldo);
	}
	
	boolean status() {
		return especial;
	}
	
	void consultaChequeEspecial() {
		if(especial) {
			if(saldo < 0) {
				System.out.println("Voce esta usando o cheque especial.");
			}else {
				System.out.println("Voce nao esta usando o cheque especial.");
			}
		}else {
			System.out.println("Voce nao possui essa modalidade.");
		}
	}
}
