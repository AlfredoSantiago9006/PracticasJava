/**
 * 
 * @author alfre
 *
 */
public class Main{
	
	/**
	 
	 * Metodo Main.
	 *
	 * @param args de argumenos recibidos
	 */
	public static void main(String args []){
		/**
		 * Creación de tres variables de tipo Double que envian diferentes parametros
		 */
		Conversiones conv = new Conversiones();
		double pesosPrimeros = conv.dollarToPeso(100);
		double pesosSegundos = conv.dollarToPeso(100, 15.50);
		double pesosTerceros = conv.dollarToPeso(100, 15.50, true);
		
		/**
		 * Imprime el resultado de cada variable según los parametros enviados
		 */
		System.out.println("Valor de mi primera conversión");
		System.out.println(pesosPrimeros);
		System.out.println("Valor de la segunda conversion");
		System.out.println(pesosSegundos);
		System.out.println("valor de la tercera conversion");
		System.out.println(pesosTerceros);
	}
}