package com.netasystems.calculadora.main;

import com.netasystems.calculadora.business.Calculadora;

public class Main {

	public static void main(String args[]) {
		
		Calculadora calc = new Calculadora();
		
		String primerArg = args[0];
		String segundoArgumento = args[1];
		String tercerArgumento = args[2];
		
		Double op1 = 0.0;
		Double op2 = 0.0;
		
		try {
			 op1 = Double.parseDouble(primerArg);
			op2 = Double.parseDouble(segundoArgumento);
		}catch(NumberFormatException ex) {
			System.out.println("No se ha podido realizar la conversion");
			System.out.println("Mensaje de error: " + ex.getMessage());
			System.exit(100);
		}
		
		
		
		double resultado;
		
		switch (tercerArgumento) {
		case "+":
			resultado = calc.suma(op1, op2);
			break;
		case "/":
			resultado = calc.divide(op1, op2);
			break;
		case "*" :
			resultado = calc.multiplica(op1, op2);
			break;
			
		case "-":
			resultado = calc.resta(op1, op2);
			break;
			default :
				resultado = -1;
			break;
		}
		System.out.println("El resultado es: " + resultado);
		
		
		
		
	}
}
