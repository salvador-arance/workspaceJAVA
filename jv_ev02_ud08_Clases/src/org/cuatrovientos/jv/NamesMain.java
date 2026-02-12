package org.cuatrovientos.jv;

import java.util.Random;

import clases.Names;

public class NamesMain {

	public static void main(String[] args) {
		Random rnd = new Random();
		Names genNombre = new Names(rnd.nextInt(4, 8));
		String nombre = "";
		
		nombre = genNombre.generate();
		
		System.out.println(nombre);

	}

}
