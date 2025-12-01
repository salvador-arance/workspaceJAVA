package org.cuatrovientos.jv;

import java.util.Scanner;

public class CalculadoraPeaje {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		boolean abono = false;
		float precioBase = 0f;
		byte ejes = 0;
		float precioFinal = 0f;
		
		System.out.print("Introduce el tipo de vehículo (coche, moto, camión): ");
		entrada = escaner.nextLine().toLowerCase();
			
		switch (entrada) {
		case "coche" :
			precioBase = 3f;
			break;
		case "moto" :
			precioBase = 2f;
			break;
		case "camión" :
			System.out.print("Número de ejes: ");
			entrada = escaner.nextLine();
			ejes = Byte.parseByte(entrada);
			precioBase = (float) ejes * 5;
			break;
		}
			

		System.out.print("¿Tiene abono de autopista? S/N: ");
		entrada = escaner.nextLine().toUpperCase();
		
		abono = entrada.equals("S");
		
		if(abono) {
			precioFinal = (float) (precioBase - (precioBase * 0.5));
		}else {
			precioFinal = precioBase;
		}
		
		System.out.println("El precio final del peaje es:" + precioFinal + "€.");
		
		escaner.close();
	}

}
