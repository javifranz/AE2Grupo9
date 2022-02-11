
package calculadora;

/**
 * Clase que representa la función cociente de una calculadora.
 * @author jfranz
 *
 */

public class Cociente {

	
	/**
	 * Este método divide dos números reales
	 * @param n1 es el primer número real a dividir
	 * @param n2 es el segundo número real a dividir
	 * @return devuelve el resultado de dividir n1 entre n2
	 */
	
	public double dividir (double n1, double n2) {
       return  n1/n2;
	}
	
	/**
	 * Este método divide dos números enteros
	 * @param n1 es el primer número real a dividir
	 * @param n2 es el segundo número real a dividir
	 * @return devuelve el resultado de dividir n1 entre n2
	 */
	
	public int dividir (int n1, int n2) {
		return n1/n2;
		
	}
	
	/**
	 * Esté método calcula el inverso de un número entero. Para ello, divide ese número entre 1
	 * @param inv1 es el número cuyo inverso queremos calcular.
	 * @return devuelve
	 *  el inverso de inv1
	 * Si es un número negativo, devolverá error.
	 * Si es cero, devolverá error.
	 */
	
	public double inverso (int inv1) {	
		return  1/inv1;
	}
	
	/**
	 * Este método calcula la raíz cuadrada de un número, raiz1. Para ello, se utiliza el método de Java Math.sqrt
	 * @param raiz1 Es el número cuya raíz cuadrada deseamos calcular.
	 * @return devuelve la raíz cuadrada de raiz1.
	 * 
	 * Si es un número negativo, devolverá error.
	 */
	
	public double raiz (double raiz1) {
		return Math.sqrt(raiz1);
	}
}

