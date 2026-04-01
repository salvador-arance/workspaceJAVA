package org.cuatrovientos.jv;

public class Main {

	public static void main(String[] args) {
		GestorConcesionario gestor = new GestorConcesionario();
		Coche toyotaYaris = new Coche("1410CRV", "Toyota", "Yaris", 15000, true);
		Coche daciaSandero = new Coche("1414CRV", "Dacia", "Sandero", 11000, false);
		Moto hondaC = new Moto("3832PRX", "Honda", "CB500", 6500, 471);
		Moto yamahaR = new Moto("3234LMD", "Yamaha", "R1", 18000, 1000);
		
		System.out.println(gestor.añadirVehiculo(toyotaYaris));
		System.out.println(gestor.añadirVehiculo(daciaSandero));
		System.out.println(gestor.añadirVehiculo(hondaC));
		System.out.println(gestor.añadirVehiculo(yamahaR));
		System.out.println(gestor.añadirVehiculo(yamahaR) + "\n");
		
		
		gestor.mostrarCatalogo();
		System.out.println();
		
		gestor.realizarRevisiones();
		
	}

}
