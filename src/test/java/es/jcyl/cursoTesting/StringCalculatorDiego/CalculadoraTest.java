package es.jcyl.cursoTesting.StringCalculatorDiego;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class CalculadoraTest 
{
	

	@Test
	public void cadenaVaciaDebeDevolverCero() {
		
		assertEquals(0, Calculadora.add(""));
	}

	
	@Test
	@Parameters({"23,23", "60,60"})
	public void cadenaUnNumeroDebeDevolverNumero(String param, int valorEsperado) {
		
		assertEquals(valorEsperado, Calculadora.add(param));
	}

	
	
	@Test
	public void cadenaVariosNumerosDebeDevolverSuma() {
		
		assertEquals(9, Calculadora.add("4,5"));
	}

	@Test (expected= NumberFormatException.class)
	public void cadenaSinNumeros() {
		
		Calculadora.add("1,A,3");
	}

	
	
	@Test
	public void cadenaVariosNumerosRetornoDebeDevolverSuma() {
		
		int resultado = Calculadora.add("1\n2,3");
		assertEquals(6, resultado);
	}

	@Test
	public void cadenaVariosNumerosRetornoDelimitador2DebeDevolverSuma() {
		
		int resultado = Calculadora.add("1\n2;3");
		assertEquals(6, resultado);
	}

	@Test (expected= IllegalArgumentException.class)
	public void cadenaNegativosRetornoDelimitador2DebeDevolverSuma() {
		
		Calculadora.add("-1\n2;3");
	}

	@Test
	public void ignorarMillaresDebeDevolverSuma() {
		
		int resultado = Calculadora.add("2;2000");
		assertEquals(2, resultado);
	}

	
	
}
