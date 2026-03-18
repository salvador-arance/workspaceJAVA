package Ejercicio_3;

public class Main {

	public static void main(String[] args) {
		Tank tanque = new Tank("Frente 19", "Destructor", 100, 25, "GoyKiller");
		Soldier kike = new Soldier("Frente 19", "Kike", "Capitán", 34);
		System.out.println(tanque.toString() + "\n" + kike.toString());
	}

}
