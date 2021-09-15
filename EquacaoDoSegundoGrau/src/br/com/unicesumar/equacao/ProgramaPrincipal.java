package br.com.unicesumar.equacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a, b, c;

		try {
			// início do trecho de código protegido
			System.out.print("a: ");
			a = ler.nextInt();

			System.out.print("b: ");
			b = ler.nextInt();

			System.out.print("c: ");
			c = ler.nextInt();

			System.out.println();
			System.out.printf("%s\n", toString(a, b, c));
			// fim do trecho de código protegido
		}
		// "InputMismatchException" ocorre se na entrada de dados
		// os valores para os coeficientes "a", "b" e "c" não
		// forem valores numéricos inteiros: nextInt()
		catch (InputMismatchException erro) {
			System.out.println();
			System.out.println("Erro: " + erro.toString());
		}
	}

	public static double delta(int a, int b, int c) {
		return (Math.pow(b, 2) - (4 * a * c));
	}

	public static String toString(int a, int b, int c) {
		String result;

		double d;
		d = delta(a, b, c);

		result = String.format("Coeficientes {a: %d; b: %d; c: %d}\n", a, b, c)
				+ String.format("Discriminante (delta): %.2f\n", d);

		if ((d < 0) || (a == 0))
			result = result + "não existem resultados reais\n";

		if ((d == 0) && (a != 0)) { // não haverá divisão por zero, porque está
			double x; // sendo verificada se "a" é diferente de zero
			x = -b / (2 * a);
			result = result + String.format("x' e x'' = %.2f\n", x);
		}

		if ((d > 0) && (a != 0)) { // não haverá divisão por zero, porque está
			double x1, x2; // sendo verificada se "a" é diferente de zero
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			result = result + String.format("x' = %.2f\n", x1) + String.format("x'' = %.2f\n", x2);
		}

		return (result);
	}

}
