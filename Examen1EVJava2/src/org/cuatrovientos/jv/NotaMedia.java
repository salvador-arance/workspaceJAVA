package org.cuatrovientos.jv;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		int numAsignaturas = 0;
		boolean numeroValido = false;
		float nota = 0f, sumaNotas= 0f, notaMedia = 0f;
		
		System.out.println("Vamos a calcular tu nota media.");
		
		do {
			System.out.print("Número de asignaturas: ");
			entrada = escaner.nextLine();
			numAsignaturas = Integer.parseInt(entrada);
			numeroValido = numAsignaturas >= 1;
			if (!numeroValido) {
				System.out.println("Error: El número de asigntaruas debe ser mayor que 0");
			}
			
		}while(!numeroValido);
		
		int contador = 1;
		
		for(int i = 0; i < numAsignaturas; i++) {
			
			do {
				System.out.print("Introduce la nota de la asignatura " + contador + ": " );
				entrada = escaner.nextLine();
				nota = Float.parseFloat(entrada);
				numeroValido = nota >= 0 && nota <= 10;
				if (!numeroValido) {
					System.out.println("Error: la nota debe estar entre 0 y 10");
				}	
			}while(!numeroValido);
			
			sumaNotas += nota;
			
			contador ++;
		}
		
		notaMedia = (sumaNotas / numAsignaturas);
		
		System.out.println("La nota del alumno es: " + notaMedia);
		
		if (notaMedia < 5) {
			System.out.println("Valoración: Suspendido");
		}else if(notaMedia < 7){
			System.out.println("Valoración: Aprobado");
		}else if(notaMedia < 9) {
			System.out.println("Valoración: Notable");
		}else if(notaMedia <= 10) {
			System.out.println("Valoración: Sobresaliente");
		}
		
		escaner.close();
	}

}
