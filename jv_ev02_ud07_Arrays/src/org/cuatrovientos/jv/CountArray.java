package org.cuatrovientos.jv;

import java.util.Scanner;

public class CountArray {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		boolean esNumero;
		int[] arrayEnteros = new int[10];
		int negativos = 0, positivos = 0, ceros = 0;
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			do {
				System.out.print("Entero posición " + i + ": ");
				entrada = escaner.nextLine();
				try {
					arrayEnteros[i] = Integer.parseInt(entrada);
					esNumero = true;

				} catch (NumberFormatException e) {
					esNumero = false;
				}
				if (!esNumero) {
					System.out.println("Por favor, introduce un número entero.");
				}
			} while(!esNumero);
		}
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			
			if (arrayEnteros[i] == 0) {
				ceros ++;
			}
			
			if (arrayEnteros[i] > 0) {
				positivos ++;
			}
			
			if (arrayEnteros[i] < 0) {
				negativos ++;
			}
		}
		
		System.out.println("Postivos: " + positivos + ". Negativos: " + negativos + ". Ceros: " + ceros + ".");
		
		escaner.close();

	}

}
