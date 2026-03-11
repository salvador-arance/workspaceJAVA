package Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		Computer ordenador = new Computer("THINKPAD", "IBM", "500€", "IntelCore i5 8400H");
		Mobile movil = new Mobile("iPhone 15", "Apple", "1500€", 666833719);
		
		System.out.println(ordenador.toString());
		System.out.println(movil.toString());
		movil.call(678862642);
	}

}
