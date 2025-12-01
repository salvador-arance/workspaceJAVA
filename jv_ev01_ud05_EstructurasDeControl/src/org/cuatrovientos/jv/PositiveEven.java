package org.cuatrovientos.jv;

import java.util.Scanner;

public class PositiveEven {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		String entrada = "";
		int numero = 0;
		System.out.print("Introduce un número: ");
		entrada = readScrn.nextLine();
		numero = Integer.parseInt(entrada);
		if (numero < 0 && (numero % 2 != 0)) {
			System.out.println("Tu número es negativo e impar");
		}else if (numero < 0 && (numero % 2 == 0)){
			System.out.println("Tu número es negativo y par");
		}else if (numero > 0 && (numero % 2 != 0)){
			System.out.println("Tu número es positivo e impar");
		}else if (numero > 0 && (numero % 2 == 0)) {
			System.out.println("Tu número es positivo y par");
		}else {
			System.out.println("Tu número es 0.");
		}
		readScrn.close();

	}

}
