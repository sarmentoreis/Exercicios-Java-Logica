package com.leonardo.cursojava.aulaEx12Interfaces;

public class TesteFigurasGeometricas {

	public static void main(String[] args) {
		
		//Figuras2D
			Quadrado  q1 = new Quadrado();
			Circulo   c1 = new Circulo();
			Triangulo t1 = new Triangulo();
		
		//Figuras3D
			Cubo cb1 	 = new Cubo();
			Cilindro cl1 = new Cilindro();
			Piramide pr1 = new Piramide();
		
		//Vetor Figuras
			FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		//Set valores - Figuras2D
			q1.setNome("Quadrado");
			q1.setCor("Azul");
			q1.setLado(4);
			
			c1.setNome("Circulo");
			c1.setCor("Preto");
			c1.setRaio(100);
			
			t1.setNome("Triangulo");
			t1.setCor("Verde");
			t1.setBase(30);
			t1.setAltura(50);
		
		//Set valores - Figuras3D
			cb1.setNome("Cubo");
			cb1.setCor("Laranja");
			cb1.setLado(12);
			
			cl1.setNome("Cilindro");
			cl1.setCor("Ciano");
			cl1.setAltura(100);
			cl1.setRaio(30);
			
			pr1.setNome("Piramide");
			pr1.setCor("Dourada");
			pr1.setBase(q1);
			pr1.setAltura(60);
			pr1.setApotema(50);
			pr1.setArestaBase(50);
			pr1.setNumPoligBase(4);
			
			
		//Iterando vetor.
			figuras[0] = q1;
			figuras[1] = c1;
			figuras[2] = t1;
			figuras[3] = cb1;
			figuras[4] = cl1;
			figuras[5] = pr1;
			
			for(FiguraGeometrica figura : figuras) {
				if(figura instanceof Figura2D) {
					System.out.println("*-Figura2D-*");
				}else {
					System.out.println("*-Figura3D-*");
				}
				System.out.println(figura);
			}
					
		
	}

}
