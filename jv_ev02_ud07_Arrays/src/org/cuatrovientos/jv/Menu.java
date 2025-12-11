package org.cuatrovientos.jv;

import java.util.Random;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		byte opcion = 0;
		boolean esNumero = false;
		boolean arrayExiste = false;
		int arrayEnteros[] = new int [5];
		Random rnd = new Random();
		
		do {
			System.out.println("Introduce la opción:\n 1. Generar array \n 2. Buscar número  \n 3. Borrar número \n 4. Salir");
			do {
				esNumero = true;
				System.out.print("Opción: ");
				entrada = escaner.nextLine();
				try {
					opcion = Byte.parseByte(entrada);
				} catch (NumberFormatException e) {
					esNumero = false;
				}
				if (!(esNumero && (opcion > 0 && opcion <= 4))){
					System.out.println("Por favor, introduce un número válido.");
				}
			} while (!(esNumero && (opcion > 0 && opcion <= 4)));
			
			switch(opcion) {
			case 1:
				arrayExiste = true;
				for(int i = 0; i < arrayEnteros.length; i++) {
					arrayEnteros[i] = rnd.nextInt(11);
				}
				
				for(int i = 0; i < arrayEnteros.length; i++) {
					System.out.println("Posición " + i + ": " + arrayEnteros[i]);
				}
				System.out.println("Pulse cualquier tecla para continuar:");
				escaner.nextLine();
				break;
			case 2:
				if (!arrayExiste) {
					System.out.println("El array no existe");
					break;
				}
				System.out.println("Introduce un número entre 0 y 10: ");
				
				
				
				break;
			case 3:
				if (!arrayExiste) {
					System.out.println("El array no existe");
					break;
				}
				
				break;
			}
		}while(opcion != 4);
		
		System.out.println("Adiós!");
		escaner.close();
	}

}
