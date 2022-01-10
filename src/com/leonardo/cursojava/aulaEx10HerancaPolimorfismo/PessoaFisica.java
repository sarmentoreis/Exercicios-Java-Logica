package com.leonardo.cursojava.aulaEx10HerancaPolimorfismo;

public class PessoaFisica extends Contribuinte {


	private String cpf;

	
	
	public PessoaFisica(String nome, double rendaBruta, String cpf) {
		super.setNome(nome);
		super.setRendaBruta(rendaBruta);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		
		double renda = super.getRendaBruta();
		
		if(renda <= 1400) {
			return 0;
		}else if (renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		}else if (renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}else if (renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}else {
			return (renda * 0.3) - 700;
		}
	}
	
	@Override
	public String toString() {
		String s = "[";
		s+= " Pessoa: " + super.getNome();
		s+= " Renda Bruta: " + super.getRendaBruta();
		s+= " CPF: " + this.cpf;
		s+= "\n Imposto a ser pago: " + calcularImposto();
		
		return s + " ]\n";
	}
}
