package Ejercicio_2;

public class Main {

	public static void main(String[] args) {
		String[] asignaturas = new String[] {"Bases de datos", "Programación"};
		Teacher alberto = new Teacher("Alberto", 55, "Profesor", asignaturas);
		Student kirian = new Student("Kirian", 22, "DAM", "Primero");
		
		System.out.println(alberto.toString());
		System.out.println(kirian.toString());
	}

}
