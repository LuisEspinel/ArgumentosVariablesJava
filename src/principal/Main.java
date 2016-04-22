package principal;

import logico.EjemploParametros;

public class Main {
	
	public static void main(String args[]){
		EjemploParametros ejemplo=new EjemploParametros();
		
		// Modo 1 de llamar al metodo 
		String vectorString[]={"Hola","Mundo","Fin"};
		ejemplo.metodoParametrosString(vectorString);				
		System.out.println("_______________________________");		
		// Modo 2 
		ejemplo.metodoParametrosString("Hola","Mundo","Fin");		
		System.out.println("_______________________________");
		
		// Sin parametro alguno
		ejemplo.metodoParametrosString();
	}

}
