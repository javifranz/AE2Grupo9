package Principal;

import calculadora.Cociente;
import calculadora.Suma;

public class Principal {

	public static void main(String[] args) {
		
		Suma suma1 = new Suma();
	    System.out.println(suma1.suma(5, 2));	
	    
	    Suma suma2 = new Suma();
	    System.out.println(suma2.suma(5, 2, 4));
	    
	    Cociente cociente1 = new Cociente();
	    System.out.println(cociente1.dividir(20, 5));
	    
	    Cociente cociente2 = new Cociente();
        System.out.println(cociente2.raiz(64));

	}
}