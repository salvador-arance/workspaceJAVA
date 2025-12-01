package org.cuatrovientos.jv;

import java.util.Scanner;

public class SimpleLoop {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		char otro;
		byte num1 = 0;
		boolean otroValido = true;
		
		do {
			
			do {
				System.out.print("Introduce un número mayor que 0 y menor que 128: ");
				entrada = escaner.nextLine();
				num1 = Byte.parseByte(entrada);
			} while (num1 <= 0);
			
			for (int i = 0; i < num1; i++) {
				System.out.println("Hola!!");
			}
			
			do {
				System.out.print("¿Otro? (S/N): ");
				entrada = escaner.nextLine().toLowerCase();
				otro = entrada.charAt(0);
			}while (!(otro == 's' || otro == 'n'));
			
			if (otro == 'n') {
					otroValido = false;
			}
		}while (otroValido);
		
		escaner.close();
	}

}
