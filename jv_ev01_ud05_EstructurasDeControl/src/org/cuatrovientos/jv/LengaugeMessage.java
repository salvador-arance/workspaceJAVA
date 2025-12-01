package org.cuatrovientos.jv;

import java.util.Scanner;

public class LengaugeMessage {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		String lenguaje = "";
		System.out.print("Dime el nombre de un lenguaje: ");
		lenguaje = readScrn.nextLine();
		if (lenguaje.equals("C++")) {
			System.out.println("The best lenguage ever.");
		} else if (lenguaje.equals("Java")) {
			System.out.println("The second best lenguage ever.");
		} else if (lenguaje.equals("JavaScript")) {
			System.out.println("The lenguage of the present.");
		} else {
			System.out.println("Nothing to say about that.");
		}
		readScrn.close();
	}

}
