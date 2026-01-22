package org.cuatrovientos.jv;

import clases.Dice;

public class MainDice {

	public static void main(String[] args) {
		Dice dadoNormal = new Dice();
		Dice dadoDiezCaras = new Dice(10);
		Dice dadoVeinteCaras = new Dice(20, true);
		
		
		System.out.println("Resultado: " + dadoNormal.roll());
	}

}
