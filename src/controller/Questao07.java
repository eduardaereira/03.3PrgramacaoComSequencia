package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * 7) Fazer um algoritmo que pergunte os valores dos catetos de um triângulo
	 * retângulo e apresente o valor da hipotenusa. Obs: A fórmula é hipotenusa2 =
	 * cateto1^2 + cateto2^2 ou, se preferir, hipotenusa = √( cateto1^2 + cateto2^2).
	 */
	public static void main(String[] args) {
		
		double cateto1, cateto2,  hipotenusa; 

		cateto1 = Teclado.lerDouble("Informe o valor do cateto adjacente: ");
		cateto2 = Teclado.lerDouble("Informe o valor do cateto oposto: ");
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2) );
	
		System.out.println("O valor da hipotenusa é " + hipotenusa);
	}

}
