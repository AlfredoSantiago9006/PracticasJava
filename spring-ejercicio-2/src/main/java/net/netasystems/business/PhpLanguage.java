package net.netasystems.business;

/**
 * 
 * @author Neta Systems / Jose Alfredo Santiago
 *
 * Clase PhpLanguage implementa la interface Languaje 
 **/
public class PhpLanguage implements Languaje {

	/**
	 * Variables de la clase
	 */
	private String version;
	private String descriptionLanguage;
	
	/**
	 * Getter Obtiene el valor de la variable
	 * @param descriptionLanguage valor obtenido
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
