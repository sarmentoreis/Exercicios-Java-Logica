package com.leonardo.cursojava.aulaEx10HerancaPolimorfismo;

public class PessoaJuridica extends Contribuinte {


	private String cnpj;

	
	
	public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
		super.setNome(nome);
		super.setRendaBruta(rendaBruta);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return super.getRendaBruta() * 0.1;
	}
	
	@Override
	public String toString() {
		String s = "[";
		s+= " Empresa: " + super.getNome();
		s+= " Renda Bruta: " + super.getRendaBruta();
		s+= " CNPJ: " + this.cnpj;
		s+= "\n Imposto a ser pago: " + calcularImposto();
		
		return s + " ]\n";
	}
}
