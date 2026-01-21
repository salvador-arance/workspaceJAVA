package org.cuatrovientos.jv;

import java.util.Scanner;

import clases.Conversor;

public class ConversorMonedas {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		Conversor conv = new Conversor();
		double valor = 0d;
		byte opcion = 0;
		boolean esNumero = false;
		boolean opcionCorrecta = false;
		boolean salirPrograma = false;

		do {
			System.out.println(
					"--- MENÚ CONVERSOR --- \n 1. Convertir pesetas a euros. \n 2. Convertir euros a pesetas. \n 3. Convertir euros a dólares. \n 4. Convertir dólares a euros. \n 5. Convertir euros a libras. \n 6. Convertir libras a euros. \n 7. Salir.");
			do {
				System.out.print("Elige una opción: ");
				entrada = escaner.nextLine();
				try {
					opcion = Byte.parseByte(entrada);
					esNumero = true;

				} catch (NumberFormatException e) {
					esNumero = false;
				}
				opcionCorrecta = esNumero && (opcion >= 1 && opcion <= 7);
				if (!opcionCorrecta) {
					System.out.println("Por favor, introduce una opción correcta.");
				}
			} while (!opcionCorrecta);

			if (opcion == 7) {
				salirPrograma = true;
				break;
			}

			boolean cantidadCorrecta = false;

			do {
				System.out.print("Introduce la cantidad que deseas convertir: ");
				entrada = escaner.nextLine();
				try {
					valor = Double.parseDouble(entrada);
					esNumero = true;

				} catch (NumberFormatException e) {
					esNumero = false;
				}

				cantidadCorrecta = esNumero && valor > 0;
				if (!cantidadCorrecta) {
					System.out.println("Tiene que ser un número positivo.");
				}
			} while (!cantidadCorrecta);

			switch (opcion) {
			case 1:
				System.out.println(valor + " pesetas son " + conv.pesetas2Euros(valor) + " euros.");
				break;
			case 2:
				System.out.println(valor + " euros son " + conv.euros2Pesetas(valor) + " pesetas.");
				break;
			case 3:
				System.out.println(valor + " euros son " + conv.euros2Dollars(valor) + " dólares.");
				break;
			case 4:
				System.out.println(valor + " dólares son " + conv.dollars2Euros(valor) + "euros.");
				break;
			case 5:
				System.out.println(valor + " euros son " + conv.euros2Pounds(valor) + " libras.");
				break;
			case 6:
				System.out.println(valor + " libras son " + conv.pounds2Euros(valor) + " euros.");
				break;
			}

			System.out.println("Pulsa cualquier tecla para continuar...");
			escaner.nextLine();

		} while (!salirPrograma);

		System.out.println("Adiós :).");

		escaner.close();
	}

}
