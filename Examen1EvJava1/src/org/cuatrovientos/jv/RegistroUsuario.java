package org.cuatrovientos.jv;

import java.util.Scanner;

public class RegistroUsuario {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		String usuario = "";
		String contraseña = "";
		String nombreCompleto = "";
		
		System.out.print("Introduce tu nombre completo: ");
		nombreCompleto = escaner.nextLine().toUpperCase();
		System.out.print("Introduce tu nombre de usuario: ");
		usuario = escaner.nextLine().toLowerCase();
		System.out.print("Introduce tu contraseña: ");
		contraseña = escaner.nextLine();
		System.out.print("Repite la contraseña: ");
		entrada = escaner.nextLine();
		
		if (!(contraseña.equals(entrada))){
			System.out.println(nombreCompleto + ": Las contraseñas no coinciden");
		}else {
			System.out.println("Las contraseñas coinciden, Verificando validez...");
			if ((contraseña.length() >= 8) && !(contraseña.toLowerCase().contains(usuario))) {
				System.out.println(nombreCompleto + ": Contraseña válida. Registro completado con éxito.");
			}
			if (contraseña.length() < 8) {
				System.out.println(nombreCompleto + ": La contraseña no puede tener menos de 8 caracteres.");
			}
			if (contraseña.toLowerCase().contains(usuario)){
				System.out.println(nombreCompleto + ": La contraseña no puede contener el nombre de usuario.");
			}
		}
		escaner.close();
	}

}
