package org.cuatrovientos.jv;

import java.util.Scanner;

public class Horario {

	public static void main(String[] args) {
		//TODO Finish final print
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
		String[] horas = {"08:30", "09:25", "10:20", "11:45", "12:40", "13:35"};
		String horario[][] = new String[5][6];
		String entrada = "";
		Scanner escaner = new Scanner(System.in);
		boolean esNumero = false;
		byte nModulos = 0;
		boolean existeElModulo = false;

		do {
			System.out.print("Introduce la cantidad de módulos (>3): ");
			entrada = escaner.nextLine();
			try {
				nModulos = Byte.parseByte(entrada);
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			if (!esNumero && nModulos < 4) {
				System.out.println("Introduce un número válido de módulos.");
			}
		} while (!esNumero && nModulos < 4);

		String modulos[] = new String[nModulos];
		
		for(int i = 0; i < nModulos; i++) {
			System.out.print("Introduce el nombre del módulo " + (i + 1) + ": ");
			modulos[i] = escaner.nextLine().toLowerCase();
		}
		
		for(int i = 0; i < horario.length; i++) {
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
				}while(!existeElModulo);
			}
			
		}
		
		System.out.println("Hora  " + dias[0] + " " + dias[1] + " " + dias[2] + " " + dias[3] + " " + dias[4]);
		for (int i = 0; i < horario.length; i++) {
			System.out.print(horas[i] + " ");
			for (int j = 0; j < horario[0].length; j++) {
				System.out.print(horario[i][j] + " ");
			}
			System.out.println();
		}
		
		escaner.close();
	}

}
