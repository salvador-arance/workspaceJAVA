package org.cuatrovientos.jv;

import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		Random rnd = new Random();
		String entrada = "";
		int contador = 1;
		boolean esNumero;
		int[] arrayEnteros = new int[10];

		for (int i = 0; i < arrayEnteros.length; i++) {
			do {
				esNumero = true;
				System.out.print("Número " + contador + ": ");
				entrada = escaner.nextLine();
				try {
					arrayEnteros[i] = Integer.parseInt(entrada);
				} catch (NumberFormatException e) {
					esNumero = false;
				}
				if (!esNumero || arrayEnteros[i] <= 0) {
					System.out.println("Por favor, introduce un número válido.");
				}
			} while (!esNumero || arrayEnteros[i] <= 0);
			contador++;
		}
		contador = 1;
		System.out.println("Valores introducidos: ");
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("Número " + contador + ": " + arrayEnteros[i]);
			contador++;
		}
		System.out.println("Después de mezclar:");
		for (int i = 0; i < (arrayEnteros.length * 100); i++) {
			for (int j = i + 1; j < arrayEnteros.length; j++) {
				int random = rnd.nextInt(arrayEnteros.length);
				int temp = arrayEnteros[j];
				arrayEnteros[j] = arrayEnteros[random];
				arrayEnteros[random] = temp;
			}
		}
		contador = 1;
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("Número " + contador + ": " + arrayEnteros[i]);
			contador++;
		}
		escaner.close();
	}

}
