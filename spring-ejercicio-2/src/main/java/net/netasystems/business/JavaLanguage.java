package net.netasystems.business;
/**
 * 
 * @author Neta Systems / Jose Alfredo Santiago
 * Clase JavaLanguage implemeta la interface Language
 */
public class JavaLanguage implements Languaje {
	/**
	 * Variable version de tipo String
	 */
	public String version;
	
	/**
	 * Getter obtiene valor de la variable
	 * @return regresa valor de la variable
	 */
    public String getVersion() {
		return version;
	}
 /**
  * Setter asigna valor a la variable
  * @param version parametro del valor
  */
	public void setVersion(String version) {
		this.version = version;
	}

	public String description() {
        return "Java rules!!";
    }

	public String version() {
		// TODO Auto-generated method stub
		return "5";
	}
    
}
