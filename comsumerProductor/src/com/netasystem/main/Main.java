package com.netasystem.main;

import com.netasystem.granja.Agricultor;
import com.netasystem.granja.Cochinito;


/**
 * @author alfre
 * The Class Main.
 */
public class Main {

	/**
	 * @author alfre
	 * método main
	 *
	 * @param args the arguments
	 * @throws InterruptedException the interrupted exception
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Ejemplo de productor-consumidor");
		Agricultor agricultor = new Agricultor();
		Cochinito hugo = new Cochinito();
		/**
		 * Creando los hilos
		 */
		Thread ag1 = new Thread(agricultor);
		ag1.start();
		Thread.sleep(8000);
		Thread coch1 = new Thread(hugo);
		Thread coch2 = new Thread(hugo);
		Thread coch3 = new Thread(hugo);
		Thread coch4 = new Thread(hugo);
		
		//Como evito las excepciones cuando multiples cochinitos cosumen maiz
		
		/**
		 * Ejecuta los hilos
		 */
		coch1.start();
		coch2.start();
		coch3.start();
		coch4.start();

	}
	
}
