package Ejercicio_4;

public class Candy extends Food {
	private int calorias;
	
	public Candy(String nombre, float peso, int calorias) {
		super(nombre, peso);
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Candy [calorias=" + calorias + ", nombre=" + nombre + ", peso=" + peso + "]";
	}
	
}
