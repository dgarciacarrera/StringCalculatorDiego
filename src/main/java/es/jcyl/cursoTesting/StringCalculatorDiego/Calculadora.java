package es.jcyl.cursoTesting.StringCalculatorDiego;

/**
 * Hello world!
 *
 */


public class Calculadora 
{

	
	private static String delimitadores = ",|;|\\n";
	public static int add(String numbers) {
		int suma = 0;
		
		if (numbers.equals("")) {
			suma = 0;
		} else {
			String[] lista = numbers.split(delimitadores);
			for (int i = 0; i < lista.length; i++) {
				int valor = Integer.parseInt(lista[i]);
				if (valor < 0 ) throw new IllegalArgumentException();
				if (valor < 1000 )
					suma+= valor;
			}
		}
		
		return suma;
	}
	
	
}
