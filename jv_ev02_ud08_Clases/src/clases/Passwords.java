package clases;

import java.util.Random;

public class Passwords {
	private static final char[] MINUSCULAS = { 'a', 'e', 'i', 'o', 'u', 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
			'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };

	private static final char[] MAYUSCULAS = { 'A', 'E', 'I', 'O', 'U', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L',
			'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z' };

	private static final char[] NUMEROS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	private static final char[] ESPECIALES = { '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.',
			'/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~', '¿', '¡', '°',
			'¬', '¨', 'ç', '€', '£', '¥' };

	private int length;

	public Passwords() {
		this.length = 12;
	}

	public Passwords(int length) {
		this.length = Math.max(length, 10);
	}

	public String generate() {
		String password = "";
		Random rnd = new Random();
		boolean tieneMayusculas;
		boolean tieneMinusculas;
		boolean tieneNumeros;
		boolean tieneEspeciales;
		boolean contraseñaValida;

		do {
			password = "";
			tieneMayusculas = false;
			tieneMinusculas = false;
			tieneNumeros = false;
			tieneEspeciales = false;
			contraseñaValida = false;
			for (int i = 0; i < this.length; i++) {
				switch (rnd.nextInt(4)) {
				case 0:
					password += MINUSCULAS[rnd.nextInt(MINUSCULAS.length)];
					tieneMinusculas = true;
					break;
				case 1:
					password += MAYUSCULAS[rnd.nextInt(MAYUSCULAS.length)];
					tieneMayusculas = true;
					break;
				case 2:
					password += NUMEROS[rnd.nextInt(NUMEROS.length)];
					tieneNumeros = true;
					break;
				case 3:
					password += ESPECIALES[rnd.nextInt(ESPECIALES.length)];
					tieneEspeciales = true;
					break;
				}

			}

			contraseñaValida = tieneMinusculas && tieneMayusculas && (tieneNumeros || tieneEspeciales);
		} while (!contraseñaValida);
		return password;
	}

	public String generate(int qty) {
		String password = "";

		for (int i = 0; i < qty; i++) {
			password += this.generate() + "\n";
		}

		return password;
	}
}
