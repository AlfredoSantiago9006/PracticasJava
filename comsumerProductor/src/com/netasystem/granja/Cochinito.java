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
	 * Método que va alimentando a los cochinitos conforme van llegando
	 * Sí no hay alimento se manda llamar al objeto Agricultor para que traiga más maíz
	 */
	public void consumeMaiz() {
		Maiz maizParaConsumir = Parcela.getMaiz();
		if(maizParaConsumir == null) {
			/**
			 * Condicionante if que en caso de no existir maíz manda un mensaje
			 */
			System.out.println("Oye... No hay maíz...");
			try {
				/**
				 * "Duerme" al Cochinito 2000 milis antes de volver a revisar
				 */
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/**
			 * Pasadas las 2000 milis el hilo activo vuelve a revisar, sí ya hay maíz, toma uno
			 */
			System.out.println("Revisaré si ya hay... Sí, ya hay");
			maizParaConsumir = Parcela.getMaiz();
			System.out.println(maizParaConsumir == null ? "Todavía no hay" : "Olvídalo... ya encontré más");
		}else {
			/**
			 * En caso de haber maíz simplemente lo toma y come
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

