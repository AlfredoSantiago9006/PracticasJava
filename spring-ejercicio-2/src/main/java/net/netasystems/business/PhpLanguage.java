package net.netasystems.business;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Neta Systems / Jose Alfredo Santiago
 *
 * Clase PhpLanguage implementa la interface Languaje 
 **/
@Component
public class PhpLanguage implements Languaje {

	/**
	 * Variables de la clase
	 */
	private String version = "1.7";
	private String descriptionLanguage = "PHP baby!!!";
	
	/**
	 * Setter Asigna el valor a la variable
	 * @param descriptionLanguage valor asignado
	 */
	public void setDescriptionLanguage(String descriptionLanguage) {
		this.descriptionLanguage = descriptionLanguage;
	}

	/**
	 *  Setter asigna valor a la variable
	 * @param version valor asignado
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	public String description() {
		// TODO Auto-generated method stub
		return descriptionLanguage;
	}

	public String version() {
	
		return version;
	}
}
