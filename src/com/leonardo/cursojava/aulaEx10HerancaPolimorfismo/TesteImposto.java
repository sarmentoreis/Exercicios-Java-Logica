package com.leonardo.cursojava.aulaEx10HerancaPolimorfismo;

public class TesteImposto {

	public static void main(String[] args) {
		
		Contribuinte pj = new PessoaJuridica("Empresa 1", 10000 , "11.111.111/0001-11");
		Contribuinte pf = new PessoaFisica("Leonardo",1500 , "000.000.000-00");
		Contribuinte pj2 = new PessoaJuridica("Empresa 2", 100000 , "11.111.111/0001-12");
		Contribuinte pf2 = new PessoaFisica("Joao",10000 , "000.000.000-01");
		
		System.out.println(pf);
		System.out.println(pj);
		System.out.println(pf2);
		System.out.println(pj2);
	}

}
