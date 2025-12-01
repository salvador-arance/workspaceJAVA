package org.cuatrovientos.jv;

import java.util.Scanner;

public class SerieFibonacci {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String entrada = "";
		int x, y, z, numeroTerminos, valorMaximo, contador;
		boolean esNumero, mayorQueCero, numeroValido;
		
		valorMaximo = 0;
		numeroTerminos = 0;
		x = 0;
		y = 1;
		
		do {
			System.out.print("Número de términos: ");
			entrada = escaner.nextLine();
			mayorQueCero = false;
			
			try {
				numeroTerminos = Integer.parseInt(entrada);
				esNumero = true;
				mayorQueCero = numeroTerminos >= 2;
				
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			
			numeroValido = esNumero && mayorQueCero;
			
			if (!numeroValido) {
				System.out.println("El número debe ser mayor o igual que 0");
			}
			
		}while(!numeroValido);
		
		do {
			System.out.print("Valor máximo: ");
			entrada = escaner.nextLine();
			mayorQueCero = false;
			
			try {
				valorMaximo = Integer.parseInt(entrada);
				esNumero = true;
				mayorQueCero = numeroTerminos > 0;
				
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			
			numeroValido = esNumero && mayorQueCero;
			
			if (!numeroValido) {
				System.out.println("El número debe ser mayor o igual que 0");
			}
			
		}while(!numeroValido);
		
		contador = 0;
		
		do {
			System.out.println(x);
			z = x + y;
			x = y;
			y = z;
			contador += 1;
			
		}while(contador < numeroTerminos || x < valorMaximo);
		
		escaner.close();
		}
	}


