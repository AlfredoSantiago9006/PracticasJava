package com.netasystem.granja;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * @author alfre
 * Clase Parcela.
 */
public class Parcela {

	/** Lista parcela. */
	private static Queue<Maiz> parcela = new ArrayDeque<>(); //inicializacion de singletons
	
	/**
	 * Adds  maiz.
	 *
	 * @param maiz de maiz
	 */
	public synchronized static void addMaiz(Maiz maiz) {
		parcela.add(maiz);
	}
	
	/**
	 * Gets the maiz.
	 *
	 * @return the maiz
	 */
	public synchronized static Maiz getMaiz() {
		if(parcela.isEmpty()) {
			return null;
		}
		return parcela.poll();
	}
	
	
}
