package org.cuatrovientos.jv;

import java.util.Scanner;

public class DimensionalArray {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		float arrayFloats[][] = new float[5][5];
		float sumas[] = new float [5];
		float medias[] = new float [5];
		boolean esNumero = false;

		for (int i = 0; i < arrayFloats.length; i++) {
			for (int j = 0; j < arrayFloats[i].length; j++) {
				do {
					esNumero = true;
					System.out.print("Número [" + i + "] [" + j + "]: ");
					entrada = escaner.nextLine();
					try {
						arrayFloats[i][j] = Float.parseFloat(entrada);
					} catch (NumberFormatException e) {
						esNumero = false;
					}
					if (!esNumero){
						System.out.println("Por favor, introduce un número válido.");
					}
				} while (!esNumero);
			}
		}

		for (int i = 0; i < arrayFloats.length; i++) {
			for (int j = 0; j < arrayFloats[i].length; j++) {
				sumas[i] += arrayFloats[i][j];
			}
			
			medias[i] = sumas[i] / arrayFloats.length;
			
		}
		
		for (int i =0; i < arrayFloats.length; i++) {
			System.out.println("La media de la fila " + i + " es: " + medias[i]);
		}
		escaner.close();
	}
}
