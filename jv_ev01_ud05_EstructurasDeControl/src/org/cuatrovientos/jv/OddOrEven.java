package org.cuatrovientos.jv;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		String entrada = "";
		int num = 0;
		System.out.print("Introduce un número entero y te diré si es par o no: ");
		entrada = readScrn.next();
		num = Integer.parseInt(entrada);
		if (num % 2 == 0) {
			System.out.println("Tu número es par.");
		}else{
			System.out.println("Tu número es impar.");
		}
		readScrn.close();

	}

}
