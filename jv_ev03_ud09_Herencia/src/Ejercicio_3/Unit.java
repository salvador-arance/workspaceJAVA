package Ejercicio_3;

import java.util.Random;

public abstract class Unit {
	protected String division;
	protected String name;
	protected Random rnd = new Random();
	
	public Unit() {
	}
	
	public Unit(String division, String name) {
		this.division = division;
		this.name = name;
	}
	
	public int fire() {
		return rnd.nextInt(11);
	}
	
	public int move() {
		return rnd.nextInt(101);
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Unit [division=" + division + ", name=" + name;
	}
	
	
}
