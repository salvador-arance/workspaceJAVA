package org.cuatrovientos.jv;

import java.util.Scanner;

public class Horario {

	private static final int NUMERO_MODULOS_MINIMO = 4;
	private static final int HORAS_SEMANALES = 30;

	public static void main(String[] args) {
		// TODO Finish final print
		String[] dias = { "Lunes", "Martes", "Mierc", "Jueves", "Viernes" };
		String[] horas = { "08:30", "09:25", "10:20", "11:45", "12:40", "13:35" };
		String horario[][] = new String[dias.length][horas.length];
		String entrada = "";
		Scanner escaner = new Scanner(System.in);
		boolean esNumero = false;
		byte nModulos = 0;
		byte nHorasTotal = 0;
		boolean existeElModulo = false;

		do {
			System.out.print("Introduce la cantidad de módulos (>3): ");
			entrada = escaner.nextLine();
			try {
				nModulos = Byte.parseByte(entrada);
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			if (!esNumero && nModulos < NUMERO_MODULOS_MINIMO) {
				System.out.println("Introduce un número válido de módulos.");
			}
		} while (!esNumero && nModulos < NUMERO_MODULOS_MINIMO);

		String modulos[] = new String[nModulos];
		byte horasModulos[] = new byte[nModulos];

		do {
			for (int i = 0; i < nModulos; i++) {
				System.out.print("Introduce el nombre del módulo " + (i + 1) + ": ");
				modulos[i] = escaner.nextLine().toLowerCase();
				do {
					esNumero = true;
					System.out.print("Introduce la cantidad de horas del módulo " + (i + 1) + ": ");
					entrada = escaner.nextLine();
					try {
						horasModulos[i] = Byte.parseByte(entrada);
					} catch (NumberFormatException e) {
						esNumero = false;
					}
					if (!esNumero) {
						System.out.println("Introduce un número válido.");
					}
				} while (!esNumero);
			}
			nHorasTotal = 0;
			for (int i = 0; i < nModulos; i++) {
				nHorasTotal += horasModulos[i];
			}
			if (nHorasTotal != HORAS_SEMANALES) {
				System.out.println("No cuadra el número de horas, vuelve a intentarlo.");
			}
		} while (nHorasTotal != HORAS_SEMANALES);

		for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario[0].length; j++) {
				do {
					System.out.print("¿Qué módulo se imparte el " + dias[i] + " a las " + horas[j] + "?: ");
					horario[i][j] = escaner.nextLine().toLowerCase();
					for (int k = 0; k < modulos.length; k++) {
						existeElModulo = modulos[k].equals(horario[i][j]);
						if (existeElModulo) {
							break;
						}
					}
					if (!existeElModulo) {
						System.out.println("No existe el módulo.");
					}
				} while (!existeElModulo);
			}
		}

		System.out.print("Hora \t");
		for (int i = 0; i < dias.length; i++) {
			System.out.print(dias[i] + "\t");
		}
		System.out.println();
		for (int filas = 0; filas < horas.length; filas++) {
			System.out.print(horas[filas] + "\t");

			for (int columnas = 0; columnas < dias.length; columnas++) {
				System.out.print(horario[columnas][filas] + "\t");
			}
			System.out.println();
		}
		escaner.close();
	}

}
