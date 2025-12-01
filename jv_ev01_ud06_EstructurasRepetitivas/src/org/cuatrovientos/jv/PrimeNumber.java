package org.cuatrovientos.jv;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int x = 0;
		boolean esPrimo = true, esValido = false, esNumero = false, mayorCero = false;
		String entrada = "";
		
		System.out.println("Introduce un número entero positivo y te diré si es primo.");
		do {
			System.out.print("Número: ");
			entrada = escaner.nextLine();
			
			try {
				x = Integer.parseInt(entrada);
				esNumero = true;
				mayorCero = x > 0;
				
			} catch (NumberFormatException e) {
				esNumero = false;
			}
			
			esValido = esNumero && mayorCero;
			
			if (!esValido) {
				System.out.println("El número debe ser entero positivo.");
			}
			
		}while(!esValido);
		
		if (x == 1) {
			esPrimo = false;
		} else {
			
        	for (int i = 2; i <= Math.sqrt(x); i++) {
    
        		if (x % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
		
		if (esPrimo) {
			System.out.println("Es primo.");
		}else {
			System.out.println("No es primo.");
		}
		
		escaner.close();

	}

}
