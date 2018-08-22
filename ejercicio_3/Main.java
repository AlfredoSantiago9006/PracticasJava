package ejercicio_3;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Cliente c0 = new Cliente ("Alfredo","12356");
		Cliente c1 = new Cliente ("Ramon","14852");
		Cliente c2 = new Cliente ("Monica","17852");
		Cliente c3 = new Cliente ("Arlethe","97456");
		
		Set setClient = new HashSet();
		
		setClient.add(c0);
		setClient.add(c1);
		setClient.add(c2);
		setClient.add(c3);
		
		for(Object o : setClient) {
			Cliente c = (Cliente) o;
			System.out.println("Cliente Obtenido: "+ c);
		}
	}

}
