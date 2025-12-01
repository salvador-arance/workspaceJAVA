package org.cuatrovientos.jv;

import java.util.Scanner;

public class RepetirFrase {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		int numVocales = 0, numEspacios = 0;
		
		boolean fraseValida = false, tieneVocales = false, espacios = false, numCaracteresCorrecto = false;
		
		do {
			System.out.print("Introduce una frase: ");
			entrada = escaner.nextLine();
			
			tieneVocales = entrada.toLowerCase().contains("a") || entrada.toLowerCase().contains("e") || entrada.toLowerCase().contains("i") || entrada.toLowerCase().contains("o") || entrada.toLowerCase().contains("u");
			espacios = !(entrada.startsWith(" ") || entrada.endsWith(" "));
			numCaracteresCorrecto = entrada.length() >= 10;
			
			fraseValida = tieneVocales && espacios && numCaracteresCorrecto;
			
			if (!tieneVocales && espacios && numCaracteresCorrecto) {
				System.out.println("Error: la frase debe contener al menos una vocal.");
			}
			
			if (tieneVocales && !espacios && numCaracteresCorrecto) {
				System.out.println("Error: la frase no puede empezar o terminar con espacio.");
			}
			
			if (tieneVocales && espacios && !numCaracteresCorrecto) {
				System.out.println("Error: la frase debe contener al menos 10 caracteres.");
			}
			
			if (!tieneVocales && !espacios && numCaracteresCorrecto) {
				System.out.println("Error: la frase debe contener al menos una vocal y no terminar ni empezar con espacio.");
			}
			
			if (tieneVocales && !espacios && !numCaracteresCorrecto) {
				System.out.println("Error: la frase debe contener al menos 10 caracteres y no terminar ni empezar con espacio.");
			}
			
			if (!tieneVocales && espacios && !numCaracteresCorrecto) {
				System.out.println("Error: la frase debe contener al menos una vocal y tener al menos 10 caracteres.");
			}
			
			if (!tieneVocales && !espacios && !numCaracteresCorrecto) {
				System.out.println("Error: la frase debe contener al menos una vocal, tener al menos 10 caracteres y no terminar ni empezar con espacio.");
			}
			
			
			
		}while(!fraseValida);
		
		System.out.println("Frase válida. Analizando...");
		
		for (int i = 0; i<= entrada.length() -1; i++) {
			
			
			if (entrada.toLowerCase().charAt(i) == 'a' || entrada.toLowerCase().charAt(i) == 'e' || entrada.toLowerCase().charAt(i) == 'i' || entrada.toLowerCase().charAt(i) == 'o' || entrada.toLowerCase().charAt(i) == 'u') {
				numVocales ++;
			}
			
			
			if (entrada.charAt(i) == ' ') {
				numEspacios ++;
			}
			
		} 
		
		System.out.println("Vocales: " + numVocales + ". Espacios: " + numEspacios);
		escaner.close();

	}

}
