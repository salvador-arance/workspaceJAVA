package clases;

import java.util.Random;

public class Dice {
	private int sides = 0;
	private boolean allowZero = false;
	
	
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public boolean isAllowZero() {
		return allowZero;
	}
	public void setAllowZero(boolean allowZero) {
		this.allowZero = allowZero;
	}

	private Random rnd = new Random();
	
	public Dice() {
		this.sides = 6;
	}
	public Dice (int  sides) {
		this.sides = sides;
	}
	
	public Dice (int sides, boolean allowZero) {
		this.sides = sides;
		this.allowZero = allowZero;
	}
	
	public int roll() {
		int rollResult = 0;
		if (this.allowZero) {
			rollResult = rnd.nextInt(0, sides);
		} else {
			rollResult = rnd.nextInt(1, sides + 1);
		}
		return rollResult;
	}
}
