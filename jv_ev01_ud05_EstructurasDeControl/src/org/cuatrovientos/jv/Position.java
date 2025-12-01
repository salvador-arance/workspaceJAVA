package org.cuatrovientos.jv;

import java.util.Scanner;

public class Position {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		String entrada = "";
		byte dorsal = 0;
		System.out.print("Dime un número entre el 0 y el 99: ");
		entrada = readScrn.nextLine();
		dorsal = Byte.parseByte(entrada);
		if (dorsal < 0 || dorsal > 99 ) {
			System.out.println("No has introducido un número válido");
		} else if (dorsal == 1) {
			System.out.println("Tu posición es KEEPER.");
		} else if (dorsal >= 3 && dorsal <= 5) {
			System.out.println("Tu posición es DEFENDER.");
		} else if (dorsal == 6 || dorsal == 8 || dorsal == 11) {
			System.out.println("Tu posición es MIDFIELD.");
		} else if (dorsal == 9) {
			System.out.println("Tu posición es STRIKER.");
		} else {
			System.out.println("Tu posición es ANY.");
		}
		readScrn.close();
	}

}
