package org.cuatrovientos.jv;

public class GestorPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Juan", "Pérez", "26523239F", "calle muelle");
		Persona p2 = new Persona("Pedrete", "Carlos", "26523339F", "calle gloosito");
		System.out.println(p1.nombre);
		System.out.println(p2.nombre);
	}
}
