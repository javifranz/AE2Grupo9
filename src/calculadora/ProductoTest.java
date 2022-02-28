package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

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
	void testProductoReales() {
		Producto proReal = new Producto();
		double resEsperado = 7.26;
		double resReal = proReal.productoReales(2.2, 3.3);
		assertEquals(resEsperado, resReal);
	}

	@Test
	void testProductoEnteros() {
		Producto proEntero = new Producto();
		int resEsperado = 15;
		int resReal = proEntero.productoEnteros(3, 5);
		assertEquals(resEsperado,resReal);
	}

	@Test
	void testProductoTresReales() {
		Producto proTri = new Producto();
		double resEsperado = 159.72;
		double resReal = proTri.productoTresReales(4.4, 5.5, 6.6);
		assertEquals(resEsperado, resReal);
	}

	@Test
	void testPotencia() {
		Producto pot = new Producto ();
		double resEsperado = 343;
		double resReal = pot.potencia(7, 3);
		assertEquals(resEsperado,resReal);
	}

}
