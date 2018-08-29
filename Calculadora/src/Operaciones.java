
// TODO: Auto-generated Javadoc
/**
 * The Class Operaciones.
 */
public class Operaciones {

	
	/**
	 * Resta.
	 *
	 * @param i the i
	 * @param j the j
	 * @return the double
	 */
	public double resta(String i,String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p-s;
		}catch (NumberFormatException e) {
			System.out.println("Sólo puedes ingresar números");
		}catch(NullPointerException e) {
			System.out.println("No se pudo realizar la operación");
		}
		return r;
	}
	
	
	/**
	 * Suma.
	 *
	 * @param i the i
	 * @param j the j
	 * @return the double
	 */
	public double suma (String i,String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p+s;
		}catch (NumberFormatException e) {
			System.out.println("Sólo puedes ingresar números");
		}catch(NullPointerException e) {
			System.out.println("No se pudo realizar la operación");
		}
		return r;
	}

	/**
	 * Division.
	 *
	 * @param i the i
	 * @param j the j
	 * @return the double
	 */
	public double division(String i, String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p/s;
		}catch (NumberFormatException e) {
			System.out.println("Sólo puedes ingresar números");
		}catch(NullPointerException e) {
			System.out.println("No se pudo realizar la operación");
		}catch (ArithmeticException e) {
			System.out.println("Error");
		}
		return r;
	}
	
	
	/**
	 * Multiplicacion.
	 *
	 * @param i the i
	 * @param j the j
	 * @return the double
	 */
	public double multiplicacion(String i,String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p*s;
		}catch (NumberFormatException e) {
			System.out.println("Sólo puedes ingresar números");
		}catch(NullPointerException e) {
			System.out.println("No se pudo realizar la operación");
		}
		return r;
	}
}
