package calculadora;
/**
 * Clase para hacer las operaciones relacionadas a la resta
 * en una calculadora (metodo 1 y 2)
 * 
 * Las operaciones son resta de 2 números reales, 2 reales...
 * 
 * 
 * 
 * @author Roberto
 * 
 *
 */
public class Resta_1 {
	/**
	 * 
	 * Numeros enteros, seran los numeros (positivos y negativos sin decimales)
	 * Se usaran para 1 de las operaciones.
	 * 
	 */
		/**
		 * Numero entero 1
		 */
		private int num_ent1;
		/**
		 * Numero entero 2
		 */
		private int num_ent2;
		/**
		 * Numero entero 3
		 */
		private int num_ent3;
		/**
		 * Resultado de tipo entero
		 */
		
		
		private int resultado_entero;
		
		
		/**
		 * 
		 * Numeros reales, son todos los numeros (positivos, negativos y con decimales)
		 * Se usaran para el resto de las 3 operaciones
		 * 
		 */
		
		/**
		 * Numero real 1
		 */
		private double num_real1;
		/**
		 * Numero real 2
		 */
		private double num_real2;
		/**
		 * Numero real 3
		 */
		private double num_real3;
		/**
		 * Resultado de tipo real
		 */
		private double resultado_real;
		
		private double acumulado;
		
		
		
		/**
		 * Metodo que resta 2 numeros reales en base a 2 parametros introducidos
		 * 
		 * 
		 * @param num_real1 Primer parametro real introducido por el usuario
		 * @param num_real2 Segundo parametro real introducido por el usuario
		 * @return Devuelve el resultado de la resta de los 2 numeros reales
		 * introducidos por el usuario.
		 * Devuelve un numero negativo si el primer numero introducido es 0.
		 * Devuelve el numero introducido en primer lugar si el numero introducido
		 * en segundo lugar es 0.
		 * 
		 *
		 */
		
		
		public double restaReales (double num_real1, double num_real2) {
			
			resultado_real= num_real1-num_real2;
			return resultado_real;
			}
		
		/**
		 * Metodo para restar 2 numeros enteros introducidos por el usuario
		 * @param num_ent1 Primer numero entero introducido por el usuario
		 * @param num_ent2 Segundo numero entero introducido por el usuario
		 * 
		 * @return Retorna el resultado de la resta de los dos numeros enteros
		 * introducidos por el usuario.
		 * Devuelve un numero negativo si el primer numero introducido es 0.
		 * Devuelve el numero introducido en primer lugar si el numero introducido
		 * en segundo lugar es 0.
		 * 
		 */
		
		public int restaEnteros (int num_ent1, int num_ent2) {
			
			resultado_entero= num_ent1-num_ent2;
			return resultado_entero;
			}
		
		/**
		 * Método para restar tres números enteros
		 * @param num_ent1 Primer número a restar
		 * @param num_ent2 Segundo número a restar
		 * @param num_ent3 Tercer número a restar
		 * @return revuelve el resultado de restar los tres números
		 */
		
		
	public int restaEnteros (int num_ent1, int num_ent2, int num_ent3) {
			
			resultado_entero= num_ent1-num_ent2-num_ent3;
			return resultado_entero;
			}
	
    /**
     * Es método resta con valor valor acumulado
     * @param num_real1 es el número cuyo valor acumularemos
     * @return devuelve el valor acumulado
     */
    
	
   	public double resta (double num_real1) {
		acumulado = acumulado - num_real1;
   		return acumulado;
   	}
		
}


