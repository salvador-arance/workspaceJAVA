package org.cuatrovientos.jv;

import java.util.Scanner;

public class GimnasioMain {

	public static void main(String[] args) {
		CentroAcceso gym = new CentroAcceso(20, 50);
		int opcion = 0;
		Scanner leerPantalla = new Scanner(System.in);
		String entrada = "";
		int aforoActual = 0;
		
		do {
			System.out.println("=========================== \n CONTROL DE ACCESO - CENTRO \n Aforo máximo: " + gym.getAforoMaximoGimnasio() + "\n Ocupación actual: " + aforoActual + "\n ===========================");
			System.out.println("1. Alta usuario \n 2. Listar Usuarios \n 3. Registrar entrada. \n 4. Registrar Salida. \n 5. Salir.");
			System.out.println("===========================");
			System.out.print("Introduce una opción: ");
			entrada = leerPantalla.nextLine();
			opcion = Integer.parseInt(entrada);
			switch(opcion) {
			case 1: 
				gym.altaUsuario();
				System.out.print("Pulse cualquier tecla para continuar...");
				leerPantalla.nextLine();
				break;
			case 2:
				gym.listarUsuarios();
				System.out.print("Pulse cualquier tecla para continuar...");
				leerPantalla.nextLine();
				break;
			case 3:
				System.out.print("Introduce el ID del usuario que entra: ");
				entrada = leerPantalla.nextLine();
				String mensaje = gym.registrarEntrada(entrada);
				System.out.println(mensaje);
				if (mensaje.contains("éxito")){
					aforoActual ++;
				};
				System.out.print("Pulse cualquier tecla para continuar...");
				leerPantalla.nextLine();
				break;
			case 4:
				System.out.print("Introduce el ID del usuario que sale: ");
				entrada = leerPantalla.nextLine();
				mensaje = gym.registrarSalida(entrada);
				System.out.println(mensaje);
				if (mensaje.contains("éxito")){
					aforoActual --;
				};
				System.out.print("Pulse cualquier tecla para continuar...");
				leerPantalla.nextLine();
				break;
			case 5:
				System.out.println("Cerrando el gym...");
				break;
			default:
				System.out.println("No has introducido una opción válida.");
				System.out.print("Pulse cualquier tecla para continuar...");
				leerPantalla.nextLine();
				break;
			}
		}while(opcion != 5);
		System.out.println("Hasta mañana!");
		leerPantalla.close();
	}

}
