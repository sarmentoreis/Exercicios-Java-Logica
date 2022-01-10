package com.leonardo.cursojava.aulaEx10HerancaPolimorfismo;

public class TesteConta {
	
	public static void main(String[] args) {
		
		System.out.println("---Exercicio: Conta Bancaria---\n");
		ContaBancaria contaCorrente = new ContaBancaria("Leonardo","7752");
		
		System.out.println(contaCorrente);
		contaCorrente.depositar(500);
		System.out.println(contaCorrente);
		
		realizarSaque(contaCorrente, 60);
		realizarSaque(contaCorrente, 500);
		
		System.out.println("\n---Conta Poupanca---\n");
		ContaPoupanca contaPoupanca = new ContaPoupanca("Leonardo", "7752-1");
		contaPoupanca.setDiaRendimento(5);
		
		System.out.println(contaPoupanca);
		contaPoupanca.depositar(1000);
		System.out.println(contaPoupanca);
		
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Novo saldo com o rendimento aplicado " + contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje nao e o dia do rendimento, novo saldo " + contaPoupanca.getSaldo());
		}
		
		System.out.println("\n---Conta Especial---\n");
		ContaEspecial contaEspecial = new ContaEspecial("Leonardo", "5584", 1000);
		System.out.println(contaEspecial);
		
		if(contaEspecial.sacar(2000)) {
			System.out.println("Novo saldo: " + contaEspecial.getSaldo());
		}else {
			System.out.println("Saldo insuficiente: " + contaEspecial.getSaldo() +"\n"
							   +"Limite: " + contaEspecial.getLimite() );
		}
		
		
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("\nSaque efetuado com sucesso! Saldo: " + conta.getSaldo());
		}else {
			System.out.println("\nSaldo insuficiente para o saque de " + valor + ", saldo disponivel: " + conta.getSaldo());
		}
	}
}
