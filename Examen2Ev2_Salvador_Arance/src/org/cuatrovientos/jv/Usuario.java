package org.cuatrovientos.jv;

import java.util.Objects;

public class Usuario {
	private String id;
	private String nombre;

	
	public Usuario(String id) {
		super();
		this.id = id;
	}
	
	public Usuario(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String imprimir() {
		String idNombre = "ID: " + this.id + " | Nombre: " + this.nombre;
		return idNombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Usuario other = (Usuario) obj;
		return Objects.equals(id.toLowerCase(), other.id.toLowerCase());
	}
	
}
