package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {

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
	void testSumaDoubleDouble() {
		Suma suma1 = new Suma();
		double resultadoEsperado = 5.4;
		double resultadoReal =suma1.suma(2.1,3.3);
		assertEquals (resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumaIntInt() {
		Suma suma1 = new Suma();
		int resultadoEsperado = 7;
		int resultadoReal =suma1.suma(2,5);
		assertEquals (resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumaDoubleDoubleDouble() {
		Suma suma1 = new Suma();
		double resultadoEsperado = 11.8;
		double resultadoReal =suma1.suma(2.1,3.3,6.4);
		assertEquals (resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumaDouble() {
		Suma suma1 = new Suma();
		double resultadoEsperado = 5.4;
		double resultadoReal =suma1.suma(2.1,3.3);
		assertEquals (resultadoEsperado, resultadoReal);
	}

}
