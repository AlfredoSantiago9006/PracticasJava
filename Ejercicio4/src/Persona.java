import java.io.Serializable;

/**
 * 
 * @author alfre
 *
 *Clase Persona
 */
public class Persona implements Serializable{

	/**
	 * Atributos de la clase Persona nombre y correoEle
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String correoEle;
	
	/**
	 * Constructor de la clase Persona
	 * @param nombre recibido de la clase Main
	 * @param correoEle Recibido de la clase Main
	 */
	public Persona(String nombre, String correoEle) {
		
		super();
		this.nombre = nombre;
		this.correoEle = correoEle;
	}
	/**
	 * Getters y setters de los atributos de la clase Persona
	 * 
	 */
	public Persona() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreoEle() {
		return correoEle;
	}
	public void setCorreoEle(String correoEle) {
		this.correoEle = correoEle;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correoEle == null) ? 0 : correoEle.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (correoEle == null) {
			if (other.correoEle != null)
				return false;
		} else if (!correoEle.equals(other.correoEle))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", correoEle=" + correoEle + "]";
	}
	
}