package Ejercicio_3;

public class Tank extends Unit {
	private int armor;
	private int ammo;
	private String model;
	
	public Tank() {
	}

	public Tank(String division, String name, int armor, int ammo, String model) {
		super(division, name);
		this.armor = armor;
		this.ammo = ammo;
		this.model = model;
	}
	
	public int turn() {
		return rnd.nextInt(361);
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Tank [armor=" + armor + ", ammo=" + ammo + ", model=" + model + ", division=" + division + ", name="
				+ name;
	}
	
	
	
}
