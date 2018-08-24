

/**
 * @author alfre
 * Clase Conversiones  
 */
public class Conversiones{
	
	/**
	 * Metodo para convertir pesos a dolares.
	 *
	 * @param pesos parametro en pesos para hacer la conversion a dolares
	 * @return the double
	 */
	public double dollarToPeso(double pesos){
		double dollars = pesos * 18.90;
		return dollars;
	}
	
	/**
	 * Metodo dollarToPeso para realizar la conversion de pesos a dolares recibiendo dos parametros.
	 *
	 * @param pesos para la conversion a pesos
	 * @param vc valor de cambio introducido por el usuario
	 * @return regresa una variable de tipo Double
	 */
	public double dollarToPeso(double pesos, double vc){
		double dollars = pesos * vc;
		return dollars;
	}
	
	/**
	 * Metodo dollarToPeso con tres parametros
	 *
	 * @param pesos Valor en Pesos para realizar la conversion
	 * @param vc Valor de cambio proporcionada por el cliente
	 * @param isCompra Variable para revisar si es compra o venta. Si es compra resta el 10% del resultado, si es venta incrementa 10% al resultado
	 * @return Devuelve el resultado de la conversion en una variable tipo Double
	 */
	public double dollarToPeso(double pesos, double vc, boolean isCompra){
		double dollars = pesos * vc;
		
		if(isCompra){
			dollars = dollars * .90;
		} else{
			dollars = dollars * 1.10;
		}
		return dollars;
	}
	
}

