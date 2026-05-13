package org.cuatrovientos.jv;


import java.util.Objects;

public class Moneda {
    private String nombre;
    private double valor;

    public Moneda(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

  
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Moneda other = (Moneda) obj;
		return nombre.equalsIgnoreCase(other.nombre);
	}

	@Override
    public String toString() {
        return nombre + ": " + valor;
    }
    
}