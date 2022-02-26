package calculadora;

/**
 * Clase para hacer las operaciones relacionadas a la multiplicacion
 * en una calculadora
 * 
 * Las operaciones son multiplicacion entre 2 numeros enteros, entre 2 reales,
 * entre 3 reales, y potencia.
 * 
 * 
 * @author Roberto
 * 
 *
 */
public class Producto {
	

		
	/**
	 * 
	 * Numeros enteros, seran los numeros (positivos y negativos sin decimales)
	 * Se usaran para 1 de las operaciones.
	 * 
	 */
		/**
		 * numero entero 1
		 */
		private int num_ent1;
		/**
		 * numero entero 2
		 */
		private int num_ent2;
		/**
		 * resultado de tipo entero
		 */
		private int resultado_entero;
		
		
		/**
		 * 
		 * Numeros reales, son todos los numeros (positivos, negativos y con decimales)
		 * Se usaran para el resto de las 3 operaciones
		 * 
		 */
		
		/**
		 * numero real 1
		 */
		private double num_real1;
		/**
		 * numero real 2
		 */
		private double num_real2;
		/**
		 * numero real 3
		 */
		private double num_real3;
		/**
		 * Resultado de tipo real
		 */
		private double resultado_real;
		
		/**
		 * Metodo que multiplica 2 numeros reales en base a 2 parametros introducidos
		 * 
		 * 
		 * @param num_real1 el primer parametro real introducido por el usuario
		 * @param num_real2 el segundo parametro real introducido por el usuario
		 * @return devuelve el resultado de la multiplicacion de los 2 numeros reales
		 * introducidos por el usuario
		 * Devuelve 0 si uno de los dos parametros introducidos es 0
		 *
		 */
		
		public double productoReales (double num_real1, double num_real2) {
			
			resultado_real= num_real1*num_real2;
			return resultado_real;
			}
		
		/**
		 * Metodo para multiplicar 2 numeros enteros introducidos por el usuario
		 * @param num_ent1 Primero numero entero introducido por el usuario
		 * @param num_ent2 Segundo numero entero introducido por el usuario
		 * 
		 * @return retorna el resultado de la multiplicacion de los dos numeros enteros
		 * introducidos por el usuario
		 */
		
		
		public int productoEnteros (int num_ent1, int num_ent2) {
			
			resultado_entero= num_ent1*num_ent2;
			return resultado_entero;
			}
		
		
		/**
		 * Metodo para multiplicar 3 numeros reales introducidos por el usuario
		 * 
		 * este metodo multiplicara primero el primer parametro por el segundo
		 * y luego el resultado por el tercer parametro
		 * 
		 * @param num_real1 es el primer numero real introducido por el usuario
		 * @param num_real2 es el segundo numero real introducido por el usuario
		 * @param num_real3 es el tercero numero real introducido por el usuario
		 * @return devuelve el resultado de la multiplicacion de 3 numeros reales
		 * Devuelve 0 si alguno de los numeros introducidos es 0
		 * 
		 */
		public double productoTresReales (double num_real1, double num_real2, double num_real3) {
		
			resultado_real= (num_real1*num_real2)*num_real3;
			return resultado_real;
			}
		
			/**
			 * 
			 * Metodo para hallar la potencia de un numero introducido por el usuario
			 * elevado a  otro numero introducido por el usuario
			 * 
			 * 
			 * @param num_real1 es el numero introducido que sera la base de la potencia
			 * @param num_real2 es el numero introducido que sera el exponente de la potencia
			 * @return devuelve el resultado de la operacion de potencia entre 2 numeros
			 * introducidos por el usuario
			 * 
			 *En caso de que la potencia (el segundo valor) sea 0, el resultado sera 1 siempre
			 *En caso de que la potencia reciba numeros muy grandes los escribira como una 
			 *potencia de 10 (4.9 x 10^334 por ejemplo)
			 */
		
		public double potencia (double num_real1, double num_real2) {
		
			resultado_real = Math.pow(num_real1,num_real2);
			return resultado_real;
			}

			public Producto(int num_ent1, int num_ent2, int resultado_entero, double num_real1, double num_real2,
					double num_real3, double resultado_real) {
				super();
				this.num_ent1 = num_ent1;
				this.num_ent2 = num_ent2;
				this.resultado_entero = resultado_entero;
				this.num_real1 = num_real1;
				this.num_real2 = num_real2;
				this.num_real3 = num_real3;
				this.resultado_real = resultado_real;
			}

			public Producto() {
				super();
			}

			public int getNum_ent1() {
				return num_ent1;
			}

			public void setNum_ent1(int num_ent1) {
				this.num_ent1 = num_ent1;
			}

			public int getNum_ent2() {
				return num_ent2;
			}

			public void setNum_ent2(int num_ent2) {
				this.num_ent2 = num_ent2;
			}

			public int getResultado_entero() {
				return resultado_entero;
			}

			

			public double getNum_real1() {
				return num_real1;
			}

			public void setNum_real1(double num_real1) {
				this.num_real1 = num_real1;
			}

			public double getNum_real2() {
				return num_real2;
			}

			public void setNum_real2(double num_real2) {
				this.num_real2 = num_real2;
			}

			public double getNum_real3() {
				return num_real3;
			}

			public void setNum_real3(double num_real3) {
				this.num_real3 = num_real3;
			}

			public double getResultado_real() {
				return resultado_real;
			}

			
		
		
		
		
	}


