package org.cuatrovientos.jv;

import java.util.ArrayList;
import java.util.Scanner;

public class CentroAcceso {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<String> idGenteDentro = new ArrayList<String>();
	private int aforoMaximoGimnasio;
	private int cantidadMaximaUsuarios;

	public CentroAcceso(int aforoMaximoGimnasio, int cantidadMaximaUsuarios) {
		super();
		this.aforoMaximoGimnasio = aforoMaximoGimnasio;
		this.cantidadMaximaUsuarios = cantidadMaximaUsuarios;
	}

	public int getAforoMaximoGimnasio() {
		return this.aforoMaximoGimnasio;
	}

	public int getCantidadMaximaUsuarios() {
		return this.cantidadMaximaUsuarios;
	}

	public void altaUsuario() {
		Scanner leerPantalla = new Scanner(System.in);
		String idAux;
		String nombreAux;
		Usuario userAux;

		if (this.usuarios.size() < this.cantidadMaximaUsuarios) {
			do {
				do {
					System.out.print("Introduce el ID: ");
					idAux = leerPantalla.nextLine();
					if (idAux.isBlank()) {
						System.out.println("El ID no puede estar vacío.");
					}
				} while (idAux.isBlank());

				do {
					System.out.print("Introduce el Nombre: ");
					nombreAux = leerPantalla.nextLine();
					if (idAux.isBlank()) {
						System.out.println("El nombre no puede estar vacío.");
					}

				} while ((nombreAux.isBlank()));
				userAux = new Usuario(idAux, nombreAux);
				if (this.usuarios.contains(userAux)) {
					System.out.println("El usuario con ID " + idAux + " ya existe.");
				}
			} while (this.usuarios.contains(userAux));

			this.usuarios.add(userAux);
			System.out.println("El usuario ha sido añadido con éxito.");

		} else {
			System.out.println("Ya se ha alcanzado la cantidad máxima de usuarios.");
		}
	}

	public void listarUsuarios() {
		int i = 0;
		for (Usuario user : usuarios) {
			i += 1;
			System.out.println(i + ". " + user.imprimir());
		}
	}

	public String registrarEntrada(String id) {
		Usuario userAux = new Usuario(id);

		if (!this.usuarios.contains(userAux)) {
			return "El usuario debe existir";
		}

		if (this.idGenteDentro.contains(id.toLowerCase())) {
			return "El usuario ya está dentro";
		}

		if (this.aforoMaximoGimnasio < this.idGenteDentro.size()) {
			return "No se puede superar el aforo máximo";
		}

		this.idGenteDentro.add(id.toLowerCase());

		return "Se ha registrado la entrada con éxito.";
	}

	public String registrarSalida(String id) {
		Usuario userAux = new Usuario(id);

		if (!this.usuarios.contains(userAux)) {
			return "El usuario debe existir";
		}

		int indice = idGenteDentro.indexOf(id.toLowerCase());

		if (indice == -1) {
			return "El usuario no está dentro";
		}

		this.idGenteDentro.remove(indice);
		return "Se ha registrado la salida con éxito.";
	}
	
}
