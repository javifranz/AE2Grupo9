
package calculadora;

/**
 * Clase que representa la funci�n cociente de una calculadora.
 * @author jfranz
 *
 */

public class Cociente {

	
	/**
	 * Este m�todo divide dos n�meros reales
	 * @param n1 es el primer n�mero real a dividir
	 * @param n2 es el segundo n�mero real a dividir
	 * @return devuelve el resultado de dividir n1 entre n2
	 */
	
	public double dividir (double n1, double n2) {
       return  n1/n2;
	}
	
	/**
	 * Este m�todo divide dos n�meros enteros
	 * @param n1 es el primer n�mero real a dividir
	 * @param n2 es el segundo n�mero real a dividir
	 * @return devuelve el resultado de dividir n1 entre n2
	 */
	
	public int dividir (int n1, int n2) {
		return n1/n2;
		
	}
	
	/**
	 * Est� m�todo calcula el inverso de un n�mero entero. Para ello, divide ese n�mero entre 1
	 * @param inv1 es el n�mero cuyo inverso queremos calcular.
	 * @return devuelve
	 *  el inverso de inv1
	 * Si es un n�mero negativo, devolver� error.
	 * Si es cero, devolver� error.
	 */
	
	public double inverso (int inv1) {	
		return  1/inv1;
	}
	
	/**
	 * Este m�todo calcula la ra�z cuadrada de un n�mero, raiz1. Para ello, se utiliza el m�todo de Java Math.sqrt
	 * @param raiz1 Es el n�mero cuya ra�z cuadrada deseamos calcular.
	 * @return devuelve la ra�z cuadrada de raiz1.
	 * 
	 * Si es un n�mero negativo, devolver� error.
	 */
	
	public double raiz (double raiz1) {
		return Math.sqrt(raiz1);
	}
}

