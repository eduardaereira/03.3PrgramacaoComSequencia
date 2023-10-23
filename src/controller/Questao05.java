package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * 5) Fazer um algoritmo que calcule e apresente o valor do volume de uma lata
	 * de óleo, utilizando a fórmula v = pi r^2 h . 
	 * Onde v=Volume,  pi = 3. 14159265, r = raio e h = altura.
	 */
	public static void main(String[] args) {
		
		 double volume, raio, altura ;
		 raio = Teclado.lerDouble(" valor do raio ");
		 altura = Teclado.lerDouble(" valor da altura");
		 
		 volume = Math.PI * Math.pow(raio, 2) * altura ;
		 
		 System.out.println("O valor do volume da lata de óleo é:" + volume);

	}

}
