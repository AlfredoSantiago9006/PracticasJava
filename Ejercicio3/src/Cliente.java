

// TODO: Auto-generated Javadoc
/**
 * The Class Cliente.
 *
 * @author alfre
 */
public class Cliente {
	
	/** The nombre. */
	private String nombre;
	
	/** The num cliente. */
	private String numCliente;
	
	/**
	 * Instantiates a new cliente.
	 */
	public Cliente() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new cliente.
	 *
	 * @param nombre the nombre
	 * @param numCliente the num cliente
	 */
	public Cliente(String nombre, String numCliente) {
		super();
		this.nombre = nombre;
		this.numCliente = numCliente;
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the num cliente.
	 *
	 * @return the num cliente
	 */
	public String getNumCliente() {
		return numCliente;
	}
	
	/**
	 * Sets the num cliente.
	 *
	 * @param numCliente the new num cliente
	 */
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numCliente == null) ? 0 : numCliente.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numCliente == null) {
			if (other.numCliente != null)
				return false;
		} else if (!numCliente.equals(other.numCliente))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numCliente=" + numCliente + "]";
	}
	
}