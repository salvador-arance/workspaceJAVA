package org.cuatrovientos.jv;

import clases.Array;

public class ArrayMain {

	public static void main(String[] args) {
		Array arrayEnteros = new Array();
		System.out.println("Números pares: " + arrayEnteros.countEven());
		arrayEnteros.increment();
		System.out.println("Números pares después del incremento: " + arrayEnteros.countEven());
		arrayEnteros.decrement();
		System.out.println("Números pares después del decremento: " + arrayEnteros.countEven());
	}

}
