package org.cuatrovientos.jv;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		String entrada = "";
		char letra;
		float usd = 0, eur = 0, yen = 0, libra = 0, valorUsd = 0.8608f, valorYen = 0.0057f, valorLibra = 1.15f;
		System.out.println("Introduce un valor en euros acompañado de una letra (y, p o d para yen, libra o dólar respectivamente) para hacer una conversión de divisas.");
		System.out.print("Valor en euros (Formato cifra-letra) (150d por ejemplo):");
		entrada = readScrn.nextLine().toLowerCase();

		letra = entrada.charAt(entrada.length() - 1);
		eur = Float.parseFloat(entrada.substring(0, (entrada.length() - 1)));
		
		switch (letra) {
		case 'd' :
			usd = eur / valorUsd;
			System.out.println(eur + " euros en dólares es " + usd);
			break;
		case 'p' :
			libra = eur / valorLibra;
			System.out.println(eur + " euros en libras es " + libra);
			break;
		case 'y' :
			yen = eur / valorYen;
			System.out.println(eur + " euros en yenes es " + yen);
			break;
		default :
			System.out.println("No has seguido el formato, el dato no es válido.");
			break;
		}
		
//		if (letra == 'd') {
//			usd = eur / valorUsd;
//			System.out.println(eur + " euros en dólares es " + usd);
//		}else if (letra == 'p') {
//			libra = eur / valorLibra;
//			System.out.println(eur + " euros en libras es " + libra);
//		}else if (letra == 'y') {
//			yen = eur / valorYen;
//			System.out.println(eur + " euros en yenes es " + yen);
//		}else {
//			System.out.println("No has seguido el formato, el dato no es válido.");
//		}
		
		readScrn.close();
	}

}
