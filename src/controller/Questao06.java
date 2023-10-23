package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * 6) Fazer um algoritmo que pergunte dois valores a e b, efetue a troca dos
	 * valores, de forma que a variável a passe a possuir o valor da variável b, e
	 * que a variável b passe a possuir o valor da variável a, e apresente os
	 * valores trocados.
	 */
	public static void main(String[] args) {
	
		int a, b ;
		
		a = Teclado.lerInt("Insira o primeirp valor ");
		b = Teclado.lerInt("Insira o segundo ");
		
		System.out.println("Seu valor A é : " + b + " e o seu valor B é: " + a );
		
	}

}
