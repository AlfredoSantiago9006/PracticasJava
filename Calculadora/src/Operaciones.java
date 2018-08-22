
public class Operaciones {

	
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
