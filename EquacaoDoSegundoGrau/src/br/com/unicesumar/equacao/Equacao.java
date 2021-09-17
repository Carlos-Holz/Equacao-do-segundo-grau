package br.com.unicesumar.equacao;

public class Equacao {

	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public static double delta(int a, int b, int c) {
		return (Math.pow(b, 2) - (4 * a * c));
	}

	public String resultado(int a, int b, int c) {
		String result;

		double d;
		d = delta(a, b, c);

		result = String.format("Coeficientes [A= %d; B= %d; C= %d]\n", a, b, c)
				+ String.format("Discriminante (delta)= %.2f\n", d);

		try {
			if ((d < 0) || (a == 0))

				throw new DeltaException();

			if ((d == 0) && (a != 0)) {
				double x;
				x = -b / (2 * a);
				result = result + String.format("\nAs raízes são iguais!\n" + "x' e x'' = %.2f\n", x);
			}

			if ((d > 0) && (a != 0)) {
				double x1, x2;
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				result = result + String.format("\nAs raízes são diferentes!\n" + "x' = %.2f\n", x1) + String.format("x'' = %.2f\n", x2);
			}
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
		}

		return (result);
	}

}
