package Ejercicio_3;

public class Soldier extends Unit {
	private String rank;
	private int age;
	
	public Soldier() {
	}

	public Soldier(String division, String name, String rank, int age) {
		super(division, name);
		this.rank = rank;
		this.age = age;
	}
	
	public int prone() {
		return rnd.nextInt(2);
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Soldier [rank=" + rank + ", age=" + age + ", division=" + division + ", name=" + name;
	}
}
