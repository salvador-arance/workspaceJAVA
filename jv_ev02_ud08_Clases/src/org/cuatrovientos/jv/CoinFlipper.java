package org.cuatrovientos.jv;

import clases.Coin;

public class CoinFlipper {

	public static void main(String[] args) {
		Coin euro = new Coin();

		
		System.out.println(euro.getEstado());
		
		for (int j = 0; j < 19; j ++) {
			for (int i = 0; i < 5; i++) {
				euro.flip2();
			}

			System.out.println(euro.getEstado());

			System.out.println(euro.flip());
		}
		
	}

}
