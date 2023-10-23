package controller;

import util.Teclado;

public class Questao03 {

	/* 3) Fazer um programa que pergunte dois valores reais e apresente o primeiro
	  com acréscimo de 30% e o segundo com desconto de 25%.
	 */
	public static void main(String[] args) {
		
		double num1, num2, acrescimo, desconto ;
		
		num1 = Teclado.lerDouble("Insira um valor real ");
		num2 = Teclado.lerDouble("Insira outro numero real ");
		
		acrescimo = num1 + (num1 * 30 / 100);
		desconto = num2 - (num2 * 25 / 100);
		
		System.out.println(num1 +" Com acrescimo de 30% = " + acrescimo);
		System.out.println(num2 + " Com desconto de 25% = " + desconto);
	}

}
