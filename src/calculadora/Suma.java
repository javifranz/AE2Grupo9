package calculadora;

/**
 * Clase que representa la funci�n suma de una calculadora.
 * @author jfranz
 *
 */

public class Suma {
	
/**
 * valor acumulado
 */

	private double acumulado;
	
	/**
	 * Este m�todo suma dos n�meros reales
	 * @param n1 es el primer n�mero real a sumar
	 * @param n2 es el segundo n�mero real a sumar 
	 * @return devuelve el resultado de sumar n1 m�s n2
	 */

	public double suma (double n1, double n2) {
         return n1+n2;
		}
	
	/**
	 * Este m�todo suma dos n�meros enteros
	 * @param n1 es el primer n�mero entero a sumar
	 * @param n2 es el segundo n�mero entero a sumar
	 * @return devuelve el resultado de sumar n1 m�s n2
	 */
	
	
	public int suma (int n1, int n2) {
     	return n1+n2;
		}
	
	/**
	 * Este m�todo suma tres n�meros enteros
	 * @param n1 es el primer n�mero entero a sumar
	 * @param n2 es el segundo n�mero entero a sumar
	 * @param n3 es el tercer num�ro entero a sumar
	 * @return devuelve el resultado de sumar n1 m�s n2 m�s n3
	 */
	
    public double suma (double n1, double n2, double n3) {
        return n1+n2+n3;
			}
    
    /**
     * Es m�todo suma con valor valor acumulado
     * @param n1 es el n�mero cuyo valor acumularemos
     * @return devuelve el valor acumulado
     */
    
   	public double suma (double n1) {
		acumulado = acumulado + n1;
   		return acumulado;
   	}
	
	

}
