package org.cuatrovientos.jv;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListColores {

	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		Collections.addAll(colores, "Rojo", "Verde", "Azul", "Blanco", "Amarillo", "Blanco");
		colores.add(2, "Negro");
		
		for(String color:colores) {
			System.out.println(color);
		}
		
		colores.remove(4);
		
		boolean encontrado = false;
		
		for (String color:colores) {
			if (color.equals("Blanco")) {
				encontrado = true;
				System.out.println(color.indexOf("Blanco"));
			}
		}
		
		if (!encontrado) {
			System.out.println("No existe el blanco");
		}
		
		colores.remove(2);
		
		for(String color:colores) {
			System.out.println(color);
		}
	}

}
