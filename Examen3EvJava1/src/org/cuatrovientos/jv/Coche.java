package org.cuatrovientos.jv;

public class Coche extends Vehiculo {
	private boolean tieneAireAcondicionado;
	
	public Coche(String matricula, String marca, String modelo, double precioBase, boolean tieneAireAcondicionado) {
		super(matricula, marca, modelo, precioBase);
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}
	
	public double calcularPrecioFinal() {
		double precio = this.precioBase;
		if (this.tieneAireAcondicionado) {
			precio += 400;
		}
		return precio;
	}

	@Override
	public String toString() {
		String tieneAire;
		if (this.tieneAireAcondicionado) {
			tieneAire = "Sí";
		}else {
			tieneAire = "No";
		}
		return super.toString() + " [Coche - Aire: " + tieneAire + "]";
	}

	public boolean isTieneAireAcondicionado() {
		return tieneAireAcondicionado;
	}

	public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
		this.tieneAireAcondicionado = tieneAireAcondicionado;
	}	
}
