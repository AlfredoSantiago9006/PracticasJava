package net.netasystems.domain;

import java.util.Date;

public class catTipoFabrica {

private long idTipoFabrica;
	
	/** The nombre. */
	private String nombre;
	
	/** The status. */
	private Character status;
	
	/** The fecha de modificacion. */
	private Date fechaDeModificacion;
	
	/** The id usuario. */
	private Long idUsuario;
	

	/**
	 * Instantiates a new cat tipo fabrica.
	 */
	public catTipoFabrica() {
		super();
	}
	
	
	/**
	 * Instantiates a new cat tipo fabrica.
	 *
	 * @param idTipoFabrica id del tipo de fabrica
	 * @param nombre nombre de la fabrica
	 * @param status el estatus de la fabrica
	 * @param fechaDeModificacion fecha de la modificacion
	 * @param idUsuario id del usuario
	 */
	public catTipoFabrica(long idTipoFabrica, String nombre, Character status, Date fechaDeModificacion, long idUsuario) {
		super();
		this.idTipoFabrica = idTipoFabrica;
		this.nombre = nombre;
		this.status = status;
		this.fechaDeModificacion = fechaDeModificacion;
		this.idUsuario = idUsuario;
	}
	
	
	/**
	 * getIdTipoFabrica obtiene el id de la fabrica
	 *
	 * @return el ide de la fabrica
	 */
	public long getIdTipoFabrica() {
		return idTipoFabrica;
	}
	
	
	/**
	 * Set del id
	 *
	 * @param idTipoFabrica the new id tipo fabrica
	 */
	public void setIdTipoFabrica(long idTipoFabrica) {
		this.idTipoFabrica = idTipoFabrica;
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
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Character getStatus() {
		return status;
	}
	
	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Character status) {
		this.status = status;
	}
	
	/**
	 * Gets the fecha de modificacion.
	 *
	 * @return the fecha de modificacion
	 */
	public Date getFechaDeModificacion() {
		return fechaDeModificacion;
	}
	
	/**
	 * Sets the fecha de modificacion.
	 *
	 * @param fechaDeModificacion the new fecha de modificacion
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * Gets the id usuario.
	 *
	 * @return the id usuario
	 */
	public long getIdUsuario() {
		return idUsuario;
	}
	
	/**
	 * Sets the id usuario.
	 *
	 * @param idUsuario the new id usuario
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaDeModificacion == null) ? 0 : fechaDeModificacion.hashCode());
		result = prime * result + (int) (idTipoFabrica ^ (idTipoFabrica >>> 32));
		result = prime * result + (int) (idUsuario ^ (idUsuario >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + status;
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
		catTipoFabrica other = (catTipoFabrica) obj;
		if (fechaDeModificacion == null) {
			if (other.fechaDeModificacion != null)
				return false;
		} else if (!fechaDeModificacion.equals(other.fechaDeModificacion))
			return false;
		if (idTipoFabrica != other.idTipoFabrica)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CatTipoFabrica [idTipoFabrica=" + idTipoFabrica + ", nombre=" + nombre + ", status=" + status
				+ ", fechaDeModificacion=" + fechaDeModificacion + ", idUsuario=" + idUsuario + "]";
	}
}
