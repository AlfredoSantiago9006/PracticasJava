package com.netasystem.granja;

import java.io.Serializable;


/**
 * 
 * @author alfre
 * Clase Cochinito
 *
 */
public class Cochinito implements Runnable {

	/**
	 * Consume maiz.
	 * M�todo que va alimentando a los cochinitos conforme van llegando
	 * S� no hay alimento se manda llamar al objeto Agricultor para que traiga m�s ma�z
	 */
	public void consumeMaiz() {
		Maiz maizParaConsumir = Parcela.getMaiz();
		if(maizParaConsumir == null) {
			/**
			 * Condicionante if que en caso de no existir ma�z manda un mensaje
			 */
			System.out.println("Oye... No hay ma�z...");
			try {
				/**
				 * "Duerme" al Cochinito 2000 milis antes de volver a revisar
				 */
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/**
			 * Pasadas las 2000 milis el hilo activo vuelve a revisar, s� ya hay ma�z, toma uno
			 */
			System.out.println("Revisar� si ya hay... S�, ya hay");
			maizParaConsumir = Parcela.getMaiz();
			System.out.println(maizParaConsumir == null ? "Todav�a no hay" : "Olv�dalo... ya encontr� m�s");
		}else {
			/**
			 * En caso de haber ma�z simplemente lo toma y come
			 */
			System.out.println("Estoy consumiendo : "+maizParaConsumir.toString());	
		}
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while(true) {
			consumeMaiz();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Exception de interrupcion");
			}
		}
	}
	
}

