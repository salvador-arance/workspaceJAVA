package org.cuatrovientos.jv;
import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		int arrayEnteros[][] = new int[5][5];
		boolean encontrado = false;
		Random rnd = new Random();
		
		for (int i = 0; i < arrayEnteros.length; i++) {
		    for (int j = 0; j < arrayEnteros[i].length; j++) {
		        arrayEnteros[i][j] = rnd.nextInt(30);
		    }
		}

		for (int i = 0; i < arrayEnteros.length; i++) {
		    for (int j = 0; j < arrayEnteros[i].length; j++) {
		    	
		    	if (arrayEnteros[i][j] != 15) {
		    		System.out.println("Posición [" + i + "][" + j + "]" + ": " + arrayEnteros[i][j]);
		    	}else {
		    		System.out.println("El número 15 ha sido encontrado en la posición [" + i + "][" + j + "]");
		    		encontrado = true;
		    		break;
		    	}
		    }
		    
		    if (encontrado) {
		    	break;
		    }
		}
		
	}

}
