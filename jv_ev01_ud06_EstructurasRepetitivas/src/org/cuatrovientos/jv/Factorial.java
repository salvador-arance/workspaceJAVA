package org.cuatrovientos.jv;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		int x = 0, y = 0;
		
		boolean esNumero, esPositivo = false, esValido;
		
		System.out.println("Introduce un número entero positivo y calcularé su factorial.");
		
		do {
			System.out.print("Número: ");
			entrada = escaner.nextLine();
			
			try {
				x = Integer.parseInt(entrada);
				esNumero = true;
				esPositivo = x > 0;
				
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			
			esValido = esNumero && esPositivo;
			
			if (!esValido) {
				System.out.println("El número debe ser entero positivo.");
			}
			
		}while(!esValido);		
		
		y = x;
			
		for (int i = x - 1; i >= 1; i--) {
			
			y *= i ;
		}
			
		System.out.println("El factorial de " + x + " es " + y);
		
		escaner.close();

	}

}
