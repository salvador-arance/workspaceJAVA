package org.cuatrovientos.jv;

import clases.Square;

public class MainSquare {

	public static void main(String[] args) {
		Square cuadradoUno = new Square();
		Square cuadradoDos = new Square('d');
		Square cuadradoTres = new Square('3');
		
		cuadradoUno.show(1);
		cuadradoDos.show(2);
		cuadradoTres.show(3);
	}

}
