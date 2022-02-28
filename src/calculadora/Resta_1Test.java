package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Resta_1Test {

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
	void testRestaReales() {
		Resta_1 restaA = new Resta_1();
		double resultadoEsperado = 2.5;
		double resultadoReal = restaA.restaReales(10.7, 8.2);
		assertEquals (resultadoEsperado, resultadoReal);
	}

	@Test
	void testRestaEnteros() {
		Resta_1 restaB = new Resta_1();
		int resultadoEsperado = 5;
		int resultadoReal = restaB.restaEnteros(15, 10);
		assertEquals (resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testRestaEnterosDoubleDoubleDouble() {
		Resta_1 restaC = new Resta_1();
		int resultadoEsperado = 5;
		int resultadoReal = restaC.restaEnteros(18, 7, 6);
		assertEquals (resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testresta() {
		Resta_1 restaD = new Resta_1();
		double resultadoEsperado = 22;
		double resultadoReal = restaD.resta(10);
		assertEquals (resultadoEsperado, resultadoReal);
	}

	

}
