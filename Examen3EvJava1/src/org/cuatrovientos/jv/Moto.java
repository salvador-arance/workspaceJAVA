package org.cuatrovientos.jv;

public class Moto extends Vehiculo {
	private int cilindrada;
	
	public Moto(String matricula, String marca, String modelo, double precioBase, int cilindrada) {
		super(matricula, marca, modelo, precioBase);
		this.cilindrada = cilindrada;
	}
	
	public double calcularPrecioFinal() {
		double precio = this.precioBase;
		if (this.cilindrada > 500) {
			precio += 200;
		}
		return precio;
	}

	@Override
	public String toString() {
		return super.toString() + " [Moto - Cilindrada: " + this.cilindrada + "cc]";
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
