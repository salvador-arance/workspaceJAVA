package org.cuatrovientos.jv;

import java.util.Scanner;

public class Horario {

	private static final int NUMERO_MODULOS_MINIMO = 4;
	private static final int HORAS_SEMANALES = 30;

	public static void main(String[] args) {
		String[] dias = { "Lunes", "Martes", "Mierc", "Jueves", "Viernes" };
		String[] horas = { "08:30", "09:25", "10:20", "11:45", "12:40", "13:35" };
		String horario[][] = new String[dias.length][horas.length];
		String entrada = "";
		Scanner escaner = new Scanner(System.in);
		boolean esNumero = false;
		byte numeroModulos = 0;
		byte numeroHorasTotal = 0;
		boolean existeElModulo = false;

		do {
			System.out.print("Introduce la cantidad de módulos (>=" + NUMERO_MODULOS_MINIMO + "): ");
			entrada = escaner.nextLine();
			try {
				numeroModulos = Byte.parseByte(entrada);
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			if (!esNumero && numeroModulos < NUMERO_MODULOS_MINIMO) {
				System.out.println("Introduce un número válido de módulos.");
			}
		} while (!esNumero && numeroModulos < NUMERO_MODULOS_MINIMO);

		String modulos[] = new String[numeroModulos];
		byte horasModulos[] = new byte[numeroModulos];

		do {
			for (int i = 0; i < numeroModulos; i++) {
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
			numeroHorasTotal = 0;
			for (int i = 0; i < numeroModulos; i++) {
				numeroHorasTotal += horasModulos[i];
			}
			if (numeroHorasTotal != HORAS_SEMANALES) {
				System.out.println("No cuadra el número de horas, vuelve a intentarlo.");
			}
		} while (numeroHorasTotal != HORAS_SEMANALES);

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
