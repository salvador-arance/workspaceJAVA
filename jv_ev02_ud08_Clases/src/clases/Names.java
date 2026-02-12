package clases;

import java.util.Random;

public class Names {
	private int length;
	private static final char[] VOCALES = {'a','e','i','o','u'};
    private static final char[] CONSONANTES = {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
	
	public Names() {
		this.length = 5;
	}
	
	public Names(int length) {
		this.length = length;
	}
	
	public String generate() {
		Random rnd = new Random();
		String nombre = "";
		boolean esVocal = rnd.nextBoolean();
		
		for (int i = 0; i < this.length; i++) {
			if (esVocal) {
				nombre += VOCALES[rnd.nextInt(VOCALES.length)];
			}else {
				nombre += CONSONANTES[rnd.nextInt(CONSONANTES.length)];
			}
			esVocal = !esVocal;
		}
		
		return nombre;
	}
}
