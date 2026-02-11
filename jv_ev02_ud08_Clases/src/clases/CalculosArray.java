package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculosArray {
	private ArrayList<Integer> enteros = new ArrayList<Integer>();

	public void leerValores() {
		String entrada = "";
		Scanner escaner = new Scanner(System.in);
	    while (true) {
	        System.out.print("Introduce el entero número " + (enteros.size() + 1) + " (-99 = fin): ");
	        entrada = escaner.nextLine();

	        if (entrada.equals("-99")) {
	            if (enteros.isEmpty()) {
	                System.out.println("Error: Debes introducir al menos un número antes de finalizar.");
	                continue;
	            }
	            break;
	        }

	        try {
	            enteros.add(Integer.parseInt(entrada));
	        } catch (NumberFormatException e) {
	            System.out.println("Error: '" + entrada + "' no es un número válido.");
	        }
	    }
	    escaner.close();
	}
	
	public void mostrarResultados() {
		int suma = this.calcularSuma();
		float media = (float) suma / enteros.size();
		
		System.out.println("Valores introducidos:");
		for (Integer entero : enteros) {
		    System.out.print(entero + " ");
		}
		System.out.println();
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		
		int mediaSuperiores = 0;
		
		for (Integer entero : enteros) {
			if (entero > media) {
				mediaSuperiores++;
			}
		}
		System.out.print(mediaSuperiores + " valores son superiores a la media.");
	}

	private int calcularSuma() {
		int suma = 0;
		for (Integer entero : enteros) {
			suma += entero;
		}
		return suma;
	}
}
