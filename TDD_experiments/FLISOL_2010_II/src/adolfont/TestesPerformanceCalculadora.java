package adolfont;

import org.junit.Test;

public class TestesPerformanceCalculadora {
	
	
	@Test(timeout=6) // 7 ou 8 OK!
	public void testaDesempenho(){
		for (int i=1; i<100000;i++){
			Calculadora.mult(i, i);
		}
	}

}
