package org.cuatrovientos.jv;

import java.util.Scanner;

public class PositionSwitch {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		String entrada = "";
		byte dorsal = 0;
		System.out.print("Dime un número entre el 0 y el 99: ");
		entrada = readScrn.nextLine();
		dorsal = Byte.parseByte(entrada);
		
		if (dorsal < 0 || dorsal > 99 ) {
			System.out.println("No has introducido un número válido.");
		} else {
			switch (dorsal) {
			case 1 :
				System.out.println("KEEPER");
				break;
			case 3, 4, 5 :
				System.out.println("DEFENDER");
				break;
			case 9 :
				System.out.println("STRIKER");
				break;
			case 6, 8, 11 :
				System.out.println("MIDFIELD");
				break;
			default :
				System.out.println("ANY");
				break;
			}
		}
		
		readScrn.close();
	}

}