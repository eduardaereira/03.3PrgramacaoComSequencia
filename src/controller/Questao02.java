package controller;

import util.Teclado;

public class Questao02 {

	/*
	 *  Desenvolver um programa que calcule o salário líquido de um professor.
	 * Para elaborar o programa, é necessário possuir alguns dados, tais como: Valor
	 * da hora aula, número de horas trabalhadas no mês e percentual de desconto do
	 * INSS
	 */
	public static void main(String[] args) {
		double valorHoraAula, horasMes, percentualInss, salarioBruto, salarioLiquido, descontoInss;
		
		valorHoraAula = Teclado.lerDouble("Valor da hora/aula do professor:");
		horasMes = Teclado.lerDouble("Total horas trabalhadas por mes");
		percentualInss = Teclado.lerDouble("percentual de desconto do INSS:");
		
		
		salarioBruto =  valorHoraAula * horasMes ;
		descontoInss = salarioBruto * percentualInss / 100;
		salarioLiquido = salarioBruto - descontoInss;
		
		System.out.println("Salario Líquido:R$ " + salarioLiquido );
	}

}
