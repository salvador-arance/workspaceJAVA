package org.cuatrovientos.jv;
import java.util.ArrayList;

public class GestorConcesionario {
	private ArrayList<Vehiculo> vehiculos;
	
	public GestorConcesionario() {
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	public String añadirVehiculo(Vehiculo v) {
		if (vehiculos.contains(v)) {
			return "El vehículo ya está en el sistema.";
		}
		
		vehiculos.add(v);
		return "El vehículo ha sido añadido con éxito.";
	}
	
	public void mostrarCatalogo() {
		System.out.println("--- CATÁLOGO DE VEHÍCULOS ---");
		for (Vehiculo v: vehiculos) {
			if (v instanceof Coche) {
				System.out.println(((Coche) v).toString());
				System.out.println("Precio final de venta: " + ((Coche) v).calcularPrecioFinal() + "€");
			}else {
				System.out.println(((Moto) v).toString());
				System.out.println("Precio final de venta: " + ((Moto) v).calcularPrecioFinal() + "€");
			}
			System.out.println("---------------------------");
		}
	}
	
	public void realizarRevisiones() {
		System.out.println("--- INICIANDO REVISIONES TÉCNICAS ---");
		for (Vehiculo v: vehiculos) {
			if (v instanceof Coche) {
				System.out.print("Revisando Coche " + v.modelo + ": ");
				if (((Coche) v).isTieneAireAcondicionado()) {
					System.out.println("Recarga de gas incluida.");
				}else {
					System.out.println("Sistema básico.");
				}
			}else {
				System.out.print("Revisando Moto "  + v.modelo +": ");
				if (((Moto) v).getCilindrada() > 500) {
					System.out.println("Revisión de alta competición.");
				}else {
					System.out.println("Revisión de cadena completada.");
				}
			}
		}
	}
}
