package org.cuatrovientos.jv;

import clases.Dice;

public class MainDice {

	public static void main(String[] args) {
		Dice dadoNormal = new Dice();
		int dadoNormalResultados[] = new int[100];
		Dice dadoDiezCaras = new Dice(10);
		int dadoDiezCarasResultados[] = new int[100];
		Dice dadoVeinteCaras = new Dice(20, true);
		int dadoVeinteCarasResultados[] = new int[100];
		
		for (int i = 0; i < 100; i++) {
			dadoNormalResultados[i] = dadoNormal.roll();
		}
		
		for (int i = 0; i < 100; i++) {
			dadoDiezCarasResultados[i] = dadoDiezCaras.roll();
		}
		
		for (int i = 0; i < 100; i++) {
			dadoVeinteCarasResultados[i] = dadoVeinteCaras.roll();
		}
		
		System.out.println(dadoNormalResultados[99] + " " + dadoDiezCarasResultados[99] + " " + dadoVeinteCarasResultados[99]);
		
	}

}
