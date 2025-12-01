package org.cuatrovientos.jv;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String palabra = "";
		int i = 1;
		
		System.out.println("Ingresa una palabra, si quiere que el programa termine ingrese la palabra \"out\".");
		
		do {
			
			System.out.print("Palabra " + i + ": ");
			palabra = escaner.nextLine();
			i++;
			
		}while(!palabra.equalsIgnoreCase("out"));
		
		System.out.println("¡Adiós!");
		escaner.close();
	}

}
