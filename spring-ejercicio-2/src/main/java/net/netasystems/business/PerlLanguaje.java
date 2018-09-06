package net.netasystems.business;
/**
 * 
 * @author Neta Systems / Jose Alfredo Santiago
 *
 * Clase PearlLanguaje implementa los metodos de la clase Languaje
 */
public class PerlLanguaje implements Languaje {
	public String version;

	/**
	 * Getter obtiene el valor de la variable
	 * @return regresa un valor de version
	 */
    public String getVersion() {
		return version;
	}

    /**
     * Setter asigna valor a la variable
     * @param version parametro
     */
	public void setVersion(String version) {
		this.version = version;
	}

	private String descriptionLanguage;

	/**
	 * Getter obtiene el valor de la variable
	 * @return valor de la variable
	 */
    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    /**
     * Setter asigna valor a la variable
     * @param descriptionLanguage parametro
     */
    public void setDescriptionLanguage(String descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

    public String description() {
        return descriptionLanguage;
    }

	public String version() {
		// TODO Auto-generated method stub
		return null;
	}
}