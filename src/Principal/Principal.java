package Principal;

import calculadora.Cociente;
import calculadora.Producto;
import calculadora.Resta_1;
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
        
        Producto producto1 = new Producto();
        System.out.println(producto1.productoEnteros(6, 8));
        
        Resta_1 resta1 = new Resta_1();
        System.out.println(resta1.restaEnteros(10, 5));
        
    

	}
}