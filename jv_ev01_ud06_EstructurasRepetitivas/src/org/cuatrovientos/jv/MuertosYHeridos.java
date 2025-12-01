package org.cuatrovientos.jv;

//import java.util.Random;
import java.util.Scanner;

public class MuertosYHeridos {

	public static void main(String[] args) {
		//Random rnd = new Random();
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		String numeroParaAdivinarStr = "";
		String intentoStr = "";
		char c;
		int numeroParaAdivinarInt, intento, heridos, muertos, numIntentos;
		boolean numeroValido, numeroAcertado, seguirJugando, esNumero, esDeCuatroCifras, cifrasTodasDiferentes,
				aleatorioNoValido;

		do {
			numeroAcertado = false;
			seguirJugando = false;
			numIntentos = 0;

			do {
				aleatorioNoValido = false;
				numeroParaAdivinarInt = (int) ((Math.random() * 9000) + 1000);
				//numeroParaAdivinarInt = rnd.nextInt(1000,10001);
				numeroParaAdivinarStr = Integer.toString(numeroParaAdivinarInt);

				for (int i = 0; i < numeroParaAdivinarStr.length(); i++) {
					c = numeroParaAdivinarStr.charAt(i);
					if (numeroParaAdivinarStr.indexOf(c) != numeroParaAdivinarStr.lastIndexOf(c)) {
						aleatorioNoValido = true;
						break;
					}
				}

			} while (aleatorioNoValido);

			System.out.println("Vamos a jugar a muertos y heridos");

			do {
				intento = 0;
				heridos = 0;
				muertos = 0;

				do {
					numIntentos += 1;
					System.out.print("Intento " + numIntentos + ": ");
					entrada = escaner.nextLine();
					numeroValido = false;
					esDeCuatroCifras = false;
					cifrasTodasDiferentes = true;

					try {
						intento = Integer.parseInt(entrada);
						esNumero = true;
						esDeCuatroCifras = entrada.length() == 4;

						for (int i = 0; i < entrada.length(); i++) {
							c = entrada.charAt(i);
							if (entrada.indexOf(c) != entrada.lastIndexOf(c)) {
								cifrasTodasDiferentes = false;
								break;
							}
						}

					} catch (NumberFormatException e) {
						esNumero = false;
					}

					numeroValido = esNumero && esDeCuatroCifras && cifrasTodasDiferentes;

					if (!numeroValido) {
						System.out.println("Debe ser un número de cuatro cifras todas diferentes.");
					}

				} while (!numeroValido);

				intentoStr = Integer.toString(intento);
				numeroAcertado = numeroParaAdivinarStr.equals(intentoStr);

				if (!numeroAcertado) {
					for (int i = 0; i < numeroParaAdivinarStr.length(); i++) {

						if (numeroParaAdivinarStr.substring(i, i + 1).equals(intentoStr.substring(i, i + 1))) {
							muertos += 1;
						} else {
							if (numeroParaAdivinarStr.contains(intentoStr.substring(i, i + 1))) {
								heridos += 1;
							}
						}

					}

					System.out.println("Muertos: " + muertos + ". Heridos: " + heridos);
				}

			} while (!numeroAcertado);

			System.out.print("¡¡Enhorabuena, has ganado al " + numIntentos + "º intento!!");
			System.out.print("Para seguir jugando, introduzca \"S\": ");

			entrada = escaner.nextLine().toUpperCase();
			seguirJugando = entrada.equals("S");

		} while (seguirJugando);

		escaner.close();

	}

}
