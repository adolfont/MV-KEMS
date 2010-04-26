package adolfont;

public class Calculadora {

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int mult(int i, int j) {
		return i * j;
	}

	public static int div(int i, int j) {
		return i / j;
	}

	public static int sub(int i, int j) {
		return i - j;
	}

	public static int exp(int i, int j) {
		if (j >= 0)
			return (int) Math.pow(i, j);
		else
			throw new ArithmeticException("Expoentes negativos não são permitidos!");
	}
}
