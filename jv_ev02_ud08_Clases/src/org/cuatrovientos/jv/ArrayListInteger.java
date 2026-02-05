package org.cuatrovientos.jv;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		String entrada = "";
		Scanner escaner = new Scanner(System.in);
		
		while (true) {
            System.out.print("Introduce el entero número " + (enteros.size() + 1) + ": ");
            entrada = escaner.nextLine();

            if (entrada.equals("-99")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                enteros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + entrada + "' no es un número válido. Inténtalo de nuevo.");
            }
        }
		
		if(enteros.isEmpty()) {
			System.out.println("No has introducido ningún número.");
			escaner.close();
			return;
		}
		
		System.out.println("Números ingresados: " + enteros);
		
		float suma = 0;
		
		for (Integer entero:enteros) {
			suma += entero;
		}
		
		float media = suma / enteros.size();
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		
		int mediaSuperiores = 0;
		for (Integer entero:enteros) {
			if (entero > media) {
				mediaSuperiores ++;
			}
		}
		
		System.out.print(mediaSuperiores + " valores son superiores a la media.");
		escaner.close();
	}

}
