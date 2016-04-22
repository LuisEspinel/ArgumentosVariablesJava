package logico;

/*
 * Esta clase implementa metodos que reciben un numero variable de parametros 
 * estos se tratan de Arreglos implicitos, por lo tanto se pueden tratar como tal.
 */

public class EjemploParametros {

	public void metodoParametrosString(String... cadenas){
		System.out.println("Numero de parametros que entró: "+cadenas.length);
		int contador=0;
		for(String cadena : cadenas){
			contador++;
			System.out.println("Parametro # "+contador+" -> "+cadena);
		}
	}
	
	public void metodoParametrosObject(Object... objetos){
		System.out.println("Numero de parametros que entró: "+objetos.length);
		int contador=0;
		for(Object objeto : objetos){
			contador++;
			System.out.println("Parametro # "+contador+" tipo -> "+objeto.getClass());
		}
	}	
	
}
