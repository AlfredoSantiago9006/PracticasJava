
public class Operaciones {

	
	public double resta(String i,String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p-s;
		}catch (NumberFormatException e) {
			System.out.println("S�lo puedes ingresar n�meros");
		}catch(NullPointerException e) {
			System.out.println("No se pudo realizar la operaci�n");
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
			System.out.println("S�lo puedes ingresar n�meros");
		}catch(NullPointerException e) {
			System.out.println("No se pudo realizar la operaci�n");
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
			System.out.println("S�lo puedes ingresar n�meros");
		}catch(NullPointerException e) {
			System.out.println("No se pudo realizar la operaci�n");
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
			System.out.println("S�lo puedes ingresar n�meros");
		}catch(NullPointerException e) {
			System.out.println("No se pudo realizar la operaci�n");
		}
		return r;
	}
}
