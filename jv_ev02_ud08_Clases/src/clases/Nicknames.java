package clases;

import java.util.Random;

public class Nicknames {
	private String[] nicknameStart = {"Ojo", "Puño", "Barón", "Rey", "Cadaver"};
	private String[] nicknameEnd = {"Negro", "Del Infierno", "Terrible", "Helado", "Espeluznante"};
	
	public Nicknames() {
		
	}
	
	public String generate() {
		String nombre = "";
		Random rnd = new Random();
		
		nombre = nicknameStart[rnd.nextInt(nicknameStart.length)] + " " + nicknameEnd[rnd.nextInt(nicknameEnd.length)];
		
		return nombre;
	}
	
}
