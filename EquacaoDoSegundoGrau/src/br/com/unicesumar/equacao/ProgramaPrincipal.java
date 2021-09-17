package br.com.unicesumar.equacao;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		Equacao equacao = new Equacao();

		System.out.print("Informe o valor de A: ");
		equacao.setA(tec.nextInt());

		System.out.print("Informe o valor de B: ");
		equacao.setB(tec.nextInt());

		System.out.print("Informe o valor de C: ");
		equacao.setC(tec.nextInt());
		
		System.out.println("\n" + equacao.resultado(equacao.getA(), equacao.getB(), equacao.getC()));
		
		tec.close();
	}
}