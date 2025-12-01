package org.cuatrovientos.jv;

import java.util.Scanner;

public class PositiveNegativeOrZero {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		String entrada = "";
		int num = 0;
		System.out.print("Introduce un número entero y te diré si es positivo, negativo 0: ");
		entrada = readScrn.nextLine();
		num = Integer.parseInt(entrada);
		if (num > 0) {
			System.out.println("Tu número es positivo");
		} else if (num < 0){
			System.out.println("Tu número es negativo.");
		} else {
			System.out.println("Tu número es 0.");
		}
		readScrn.close();

	}

}
