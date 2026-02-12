package org.cuatrovientos.jv;

import clases.Names;
import clases.Nicknames;

public class MainNicknames {

	public static void main(String[] args) {
		Names nameGen = new Names();
		Nicknames nicknameGen = new Nicknames();
		
		String name = "";
		
		for (int i = 0; i < 5; i++) {
			name = nameGen.generate() + " " + nicknameGen.generate();
			System.out.println(name);
		}

	}

}
