package org.cuatrovientos.jv;

import java.util.Objects;

public abstract class Vehiculo {
	private String matricula;
	protected String marca;
	protected String modelo;
	protected double precioBase;
	
	Vehiculo(String matricula, String marca, String modelo, double precioBase){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + ", Modelo: " + modelo + ", Precio Base: " + precioBase + "€.";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
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
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula.toLowerCase(), other.matricula.toLowerCase());
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
}
