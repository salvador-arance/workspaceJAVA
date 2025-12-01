package org.cuatrovientos.jv;

import java.util.Scanner;

public class DrawPyramid {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		int num = 0;
		boolean esNumero, mayorQueCero, numeroValido;
		System.out.println("Introduce un valor entero positivo y par.");
		
		do {
			System.out.print("Número: ");
			entrada = escaner.nextLine();
			mayorQueCero = false;
			
			try {
				num = Integer.parseInt(entrada);
				esNumero = true;
				mayorQueCero = num > 0;
				
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			
			numeroValido = esNumero && mayorQueCero;
			
			if (!numeroValido) {
				System.out.println("El número debe ser entero positivo.");
			}
			
		}while(!numeroValido);
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}

		escaner.close();

	}

}
