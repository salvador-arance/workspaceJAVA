package org.cuatrovientos.jv;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		String entrada = "";
		System.out.print("Introduce un número entero: ");
		entrada = readScrn.next();
		numero1 = Integer.parseInt(entrada);
		System.out.print("Introduce otro número entero: ");
		entrada = readScrn.next();
		numero2 = Integer.parseInt(entrada);
		if (numero1 < numero2) {
			System.out.println("El primer número introducido es menor que el segundo.");
		} else if (numero1 > numero2) {
			System.out.println("El primer número introducido es mayor que el segundo.");
		} else {
			System.out.println("Los dos números son iguales.");
		}
		readScrn.close();
	}

}
