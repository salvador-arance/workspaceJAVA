package Ejercicio_4;
import java.util.ArrayList;

public class Basket {
	//TODO Terminar avanzado. Clase principal y método eliminar. Crear clase candy.
	
	private ArrayList<Food> alimentos;
	
	public Basket() {
		this.alimentos = new ArrayList<Food>();
	}
	
	public String meterComida(Food comida) {
		if (alimentos.indexOf(comida) != -1) {
			this.alimentos.add(comida);
			return "El alimento " + comida.nombre + " ha sido añadido con éxito.";
		}else {
			return "El alimento " + comida.nombre + " ya estaba en la cesta y no será añadido";
		}
	}
	
	public float pesoCesta(){
		float pesoTotal = 0;
		for (Food alimento: alimentos) {
			pesoTotal += alimento.peso;
		}
		return pesoTotal;
	}
	
	public int cantidadFrutaCesta() {
		return this.devolverCantidad("Fruit");
	}
	
	public int cantidadCaramelosCesta() {
		return this.devolverCantidad("Candy");
	}
	
	public int cantidadComidaCesta() {
		return this.alimentos.size();
	}
	
	private int devolverCantidad(String tipo) {
		int cantidad = 0;
		for (Food a:alimentos) {
			if (a.toString().contains(tipo)) {
				cantidad ++;
			}
		}
		return cantidad;
	}
}
