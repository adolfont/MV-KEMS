package adolfont;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestesCalculadora {

	@Test
	public void testaAdicao() {
		assertEquals("Resultado da soma de 3 e 4 é 7", 7, Calculadora
				.soma(3, 4));
	}

	@Test
	public void testaMultiplicacao() {
		assertEquals("Resultado da multiplicação de 3 e 4 é 12", 12,
				Calculadora.mult(3, 4));
	}

	@Test
	public void testaDivisao() {
		assertEquals("Resultado da divisão inteira de 4 por 3 é 1", 1,
				Calculadora.div(4, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testaDivisaoPorZero() {
		assertEquals("Resultado da divisão inteira de 4 por 0 é indefinido", 0,
				Calculadora.div(4, 0));
	}

	@Test
	public void testaSubtração() {
		assertEquals("Resultado da subtração de 1 por 2 é -1", -1, Calculadora
				.sub(1, 2));
	}

	@Test
	public void testaExponenciacao() {
		assertEquals(1, Calculadora.exp(1, 0));
		assertEquals(4, Calculadora.exp(2, 2));
		assertEquals(27, Calculadora.exp(3, 3));
		assertEquals(0, Calculadora.exp(0, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testaExponenciacaoExpoentesNegativos() {
		assertEquals(0, Calculadora.exp(2, -3));
		assertEquals(0, Calculadora.exp(0, -3));
	}
}
