package Ejercicio_4;

public class Fruit extends Food {
	private String vitamina;
	
	public Fruit(String nombre, float peso, String vitamina) {
		super(nombre, peso);
		this.vitamina = vitamina;
	}

	public String getVitamina() {
		return vitamina;
	}

	public void setVitamina(String vitamina) {
		this.vitamina = vitamina;
	}

	@Override
	public String toString() {
		return "Fruit [vitamina=" + vitamina + ", nombre=" + nombre + ", peso=" + peso + "]";
	}
}
