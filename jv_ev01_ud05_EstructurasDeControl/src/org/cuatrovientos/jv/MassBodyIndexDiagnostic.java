package org.cuatrovientos.jv;

import java.util.Scanner;

public class MassBodyIndexDiagnostic {

	public static void main(String[] args) {
		Scanner readScrn = new Scanner(System.in);
		String readStr;
		float peso;
		float altura;
		float imc;
		System.out.println("Vamos a calcular tu índice de masa corporal para darte un diagnóstico, para ello deberás introducir tu altura y tu peso");
		System.out.print("Altura (introduce siguiendo el formato N.NN): ");
		readStr = readScrn.nextLine();
		altura = Float.parseFloat(readStr);
		System.out.print("Peso (introduce siguiendo el formato NN.N): ");
		readStr = readScrn.nextLine();
		peso = Float.parseFloat(readStr);
		imc = (float) (peso / Math.pow(altura, 2)) ;
		if (imc < 16) {
			System.out.println("You need to eat more.");
		} else if (imc <25) {
			System.out.println("You are fine.");
		} else if (imc <=30) {
			System.out.println("You are eating too much.");
		} else {
			System.out.println("Go to hospital. ");
		}
		readScrn.close();

	}

}
