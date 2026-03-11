package Ejercicio_2;

import java.util.Arrays;

public class Teacher extends Person {
	private String degree;
	private String[] subjects = null;
	
	public Teacher() {
	}

	public Teacher(String name, int age, String degree, String[] subjects) {
		super(name, age);
		this.degree = degree;
		this.subjects = subjects;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Teacher [degree=" + degree + ", subjects=" + Arrays.toString(subjects) + ", name=" + name + ", age="
				+ age + "]";
	}
	
	

}
