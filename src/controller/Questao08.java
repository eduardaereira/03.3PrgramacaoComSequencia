package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * 8) Fazer um algoritmo que pergunte a base e a altura de um retângulo, e apresente: 
	 * a) O perímetro deste retângulo
	 * b) A área deste retângulo 
	 * c) A diagonal deste retângulo 
	 * Eis as fórmulas: perímetro = Soma de todos os lado do retângulo. 
	 * área = Base x Altura 
	 * diagonal2 = base2 + altura2 ou, se preferir, diagonal = √(base2 + altura2)
	 */
	public static void main(String[] args) {
		
		double altura, base, perimetro, area, diagonal;

		altura = Teclado.lerDouble("Base:");
		base = Teclado.lerDouble("Altura:");
		
		perimetro = (base * 2 ) + (altura * 2); 
		
		area = base * altura;
		
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.println("A - Perimetro será: " + perimetro);
		System.out.println("B - Area: "  + area);
		System.out.println("C - Diagonal: " + diagonal);
	}

}
