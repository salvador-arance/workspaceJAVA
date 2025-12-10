package org.cuatrovientos.jv;

import java.util.Scanner;

public class DimensionalArray {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		int arrayEnteros[][] = new int[5][5];
		int sumas[] = new int [5];
		int medias[] = new int [5];
		boolean esNumero = false;

		for (int i = 0; i < arrayEnteros.length; i++) {
			for (int j = 0; j < arrayEnteros[i].length; j++) {
				do {
					esNumero = true;
					System.out.print("Número [" + i + "] [" + j + "]: ");
					entrada = escaner.nextLine();
					try {
						arrayEnteros[i][j] = Integer.parseInt(entrada);
					} catch (NumberFormatException e) {
						esNumero = false;
					}
					if (!esNumero){
						System.out.println("Por favor, introduce un número válido.");
					}
				} while (!esNumero);
			}
		}

		for (int i = 0; i < arrayEnteros.length; i++) {
			for (int j = 0; j < arrayEnteros[i].length; j++) {
				sumas[i] += arrayEnteros[i][j];
			}
			
			medias[i] = sumas[i] / arrayEnteros.length;
			
		}
		
		for (int i =0; i < arrayEnteros.length; i++) {
			System.out.println("La media de la fila " + i + " es: " + medias[i]);
		}
		escaner.close();
	}
}
