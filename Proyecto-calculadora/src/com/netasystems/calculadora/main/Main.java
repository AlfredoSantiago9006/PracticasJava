package com.netasystems.calculadora.main;

import com.netasystems.calculadora.business.Calculadora;


/**
 * @author alfre
 * Clase Main.
 */
public class Main {

	/**
	 * Metodo main
	 *
	 * @param args sa
	 */
	public static void main(String args[]) {
		/**
		 * Crea un objeto de la clase Calculadora
		 */
		Calculadora calc = new Calculadora();
		/**
		 * Define las variables
		 */
		String primerArg = args[0];
		String segundoArgumento = args[1];
		String tercerArgumento = args[2];
		
		Double op1 = 0.0;
		Double op2 = 0.0;
		/**
		 * Castea a Double las variables op1 y op2. Si no corresponde a un numero manda un mensaje de error
		 */
		try {
			 op1 = Double.parseDouble(primerArg);
			op2 = Double.parseDouble(segundoArgumento);
		}catch(NumberFormatException ex) {
			System.out.println("No se ha podido realizar la conversion");
			System.out.println("Mensaje de error: " + ex.getMessage());
			System.exit(100);
		}
		
		
		
		double resultado;
		/**
		 * Define la accion a realizar dependiendo el signo recibido para la variable tercerArgumento
		 */
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
				/**
				 * Si recibe un simbolo no valido regresa un -1 como error
				 */
				resultado = -1;
			break;
		}
		/**
		 * Imprime el resultado
		 */
		System.out.println("El resultado es: " + resultado);
		
		
		
		
	}
}
