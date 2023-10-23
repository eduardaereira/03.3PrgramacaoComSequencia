package controller;

import util.Teclado;

public class Questao01 {

	/*
	 * 1) Elaborar um programa de computador que pergunte ao usuário o valor do Raio
	 * de um círculo e calcule a área do referido círculo, apresentando o resultado
	 * deste cálculo.
	 *  Obs: A fórmula da área é � = ���. Considere o valor de � = �.
	 */
	public static void main(String[] args) {
		
		
		double r, a ;
		
		r = Teclado.lerDouble("Raio do circulo");

		a = Math.PI * Math.pow(r,2);
		
		System.out.println("A Area do circulo é " + a );
	}

}
