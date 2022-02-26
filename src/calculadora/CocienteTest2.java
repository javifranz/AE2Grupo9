package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocienteTest2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDividirDoubleDouble() {
		Cociente cociente1 = new Cociente();
		double resultadoEsperado = 2;
		double resultadoReal  = cociente1.dividir(8.8,4.4);
		assertEquals (resultadoEsperado, resultadoReal);
	}

	@Test
	void testDividirIntInt() {
		Cociente cociente1 = new Cociente();
		int resultadoEsperado = 3;
		int resultadoReal  = cociente1.dividir(9,3);
		assertEquals (resultadoEsperado, resultadoReal);
	}

	@Test
	void testInverso() {
		Cociente  cociente1 = new Cociente();

		double resultadoEsperado = 0.5;
		double resultadoReal  = cociente1.inverso(2);
		assertEquals (resultadoEsperado, resultadoReal);
	}

	
	void testInverso2() {
		Cociente  cociente1 = new Cociente();

		double resultadoEsperado = -1;
		double resultadoReal  = cociente1.inverso(0);
		assertEquals (resultadoEsperado, resultadoReal);
	}
	
	void testInverso3() {
		Cociente  cociente1 = new Cociente();

		double resultadoEsperado = -1;
		double resultadoReal  = cociente1.inverso(-2);
		assertEquals (resultadoEsperado, resultadoReal);
	}
	
	
	
	
	@Test
	void testRaiz() {
		Cociente cociente1 = new Cociente();

		double resultadoEsperado = 2;
		double resultadoReal  = cociente1.raiz(4);
		assertEquals (resultadoEsperado, resultadoReal);
	}

}
