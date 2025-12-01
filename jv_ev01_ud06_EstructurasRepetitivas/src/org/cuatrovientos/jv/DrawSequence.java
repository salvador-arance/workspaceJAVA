package org.cuatrovientos.jv;

import java.util.Scanner;

public class DrawSequence {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		int numero = 0;
		boolean esNumero, mayorQueCero, numeroValido;
		System.out.println("Introduce un valor entero positivo.");
		
		do {
			System.out.print("Número: ");
			entrada = escaner.nextLine();
			mayorQueCero = false;
			
			try {
				numero = Integer.parseInt(entrada);
				esNumero = true;
				mayorQueCero = numero > 0;
				
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			
			numeroValido = esNumero && mayorQueCero;
			
			if (!numeroValido) {
				System.out.println("El número debe ser entero positivo.");
			}
			
		}while(!numeroValido);
		
		for (int i = 0; i < numero; i++) {
			if (!(i % 2 == 0)) {
				System.out.print("-");
			}else {
				System.out.print("*");
			}
		}
		if(numero % 2 == 0) {
			System.out.print("*");
		}
		escaner.close();
	}

}
