package org.cuatrovientos.jv;

import java.util.Random;

import clases.Passwords;

public class PasswordsMain {

	public static void main(String[] args) {
		Random rnd = new Random();
		Passwords contraseña = new Passwords(rnd.nextInt(20));
		
		System.out.println(contraseña.generate(5));
	}

}
