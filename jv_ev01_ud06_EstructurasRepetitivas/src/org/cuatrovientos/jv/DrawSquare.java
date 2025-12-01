package org.cuatrovientos.jv;

import java.util.Scanner;

public class DrawSquare {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		int num1 = 0;
		boolean esNumero, esPar, mayorQueCero, numeroValido;
		System.out.println("Introduce un valor entero positivo y par.");
		
		do {
			System.out.print("Número: ");
			entrada = escaner.nextLine();
			esPar = false;
			mayorQueCero = false;
			
			try {
				num1 = Integer.parseInt(entrada);
				esNumero = true;
				esPar = (num1 % 2 == 0);
				mayorQueCero = num1 > 0;
				
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			
			numeroValido = esNumero && esPar && mayorQueCero;
			
			if (!numeroValido) {
				System.out.println("El número debe ser entero positivo y par.");
			}
			
		}while(!numeroValido);
		
		for (int i = 0; i < num1; i++) {
			
			for (int j = 0; j < num1; j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}

		escaner.close();

	}

}
