package Entidades;

import java.time.LocalDate;

public class Bandas {
	private int id;
	private String nombre;
	private String pais;
	private String escenario; 
	private String fecha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEscenario() {
		return escenario;
	}
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((escenario == null) ? 0 : escenario.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
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
		Bandas other = (Bandas) obj;
		if (escenario == null) {
			if (other.escenario != null)
				return false;
		} else if (!escenario.equals(other.escenario))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}
	public Bandas(int id, String nombre, String pais, String escenario, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.escenario = escenario;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Bandas [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", escenario=" + escenario + ", fecha="
				+ fecha + "]";
	}

}
