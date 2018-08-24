package com.netasystems.calculadora.business;

/**
 * 
 * @author alfre
 * 
 * Clase Calculadora
 *
 */
public class Calculadora {
/**
 * 
 * @param op1 obtenido de la clase Main
 * @param op2 obnetido de la clase MAin
 * @return
 * 
 * Metodos suma, resta, multiplicacion y division. Realizan la operacion correspondiente a los parametros recibidos y devuelven el resultado
 */
	public double suma (double op1, double op2) {
		return op1 + op2;
	}
	
	public double resta (double op1, double op2) {
		return op1 - op2;
	}
	
	public double multiplica (double op1, double op2) {
		return op1 * op2;
	}
	
	public double divide (double op1, double op2) {
		if (op2 == 0) {
			return 0;
		}
		return op1 / op2;
	}
	
	
}
