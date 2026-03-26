package Ejercicio_4;

public class Main {
	
	public static void main(String[] args) {
		Basket cestaCompra = new Basket();
		Candy caramelo = new Candy("Caramelo", 1, 50);
		Candy piruleta = new Candy("Piruleta", 1, 50);
		Fruit manzana = new Fruit("Manzana", 1, "A");
		Fruit pera = new Fruit("Pera", 1, "A");
		
		System.out.println(cestaCompra.meterComida(pera));
		System.out.println(cestaCompra.meterComida(caramelo));
		System.out.println(cestaCompra.meterComida(caramelo));
		System.out.println(cestaCompra.meterComida(piruleta));
		System.out.println(cestaCompra.meterComida(manzana));
		
		System.out.println("\nAlimentos en la cesta: ");
		for (Food a: cestaCompra.alimentos) {
			System.out.println(a.toString());
		}
		
		System.out.println("\nPeso cesta: " + cestaCompra.pesoCesta());
		System.out.println("Cantidad de alimentos: " + cestaCompra.cantidadComidaCesta());
		System.out.println("Cantidad de Fruta: " + cestaCompra.cantidadFrutaCesta());
		System.out.println("Cantidad de Caramelos: " + cestaCompra.cantidadCaramelosCesta());
		
		System.out.println("\nEliminando manzana: " +  cestaCompra.borrarComida("Manzana"));
		System.out.println("Eliminando otra vez manzana: " +  cestaCompra.borrarComida("Manzana"));
		
		System.out.println("\nPeso cesta: " + cestaCompra.pesoCesta());
		System.out.println("Cantidad de alimentos: " + cestaCompra.cantidadComidaCesta());
		System.out.println("Cantidad de Fruta: " + cestaCompra.cantidadFrutaCesta());
		System.out.println("Cantidad de Caramelos: " + cestaCompra.cantidadCaramelosCesta());
	}
}
