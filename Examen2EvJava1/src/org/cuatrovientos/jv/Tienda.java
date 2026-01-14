package org.cuatrovientos.jv;

import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		String[] nombreProductos = null;
		float[] precioProductos = null;
		int[] stockProductos = null;
		String entrada = "";
		boolean esNumero = false;
		byte opcion = 0;
		boolean opcionCorrecta = false;
		boolean salirPrograma = false;
		byte numeroProductos = 0;

		do {
			System.out.println(
					"--- MENÚ INVENTARIO --- \n 1. Registrar productos. \n 2. Mostrar valor del inventario y stock por producto. \n 3. Venta de un producto. \n 4. Salir.");
			do {
				System.out.print("Elige una opción: ");
				entrada = escaner.nextLine();
				try {
					opcion = Byte.parseByte(entrada);
					esNumero = true;

				} catch (NumberFormatException e) {
					esNumero = false;
				}
				opcionCorrecta = esNumero && (opcion >= 1 && opcion <= 4);
				if (!opcionCorrecta) {
					System.out.println("Por favor, introduce una opción correcta.");
				}
			} while (!opcionCorrecta);

			if (opcion == 4) {
				salirPrograma = true;
				break;
			}

			if (opcion == 1) {
				if (numeroProductos > 0) {
					System.out.println("Ya hay productos registrados");
				} else {
					System.out.println("--- 1. REGISTRAR PRODUCTOS ---");
					boolean numeroProductosValido = false;
					do {
						System.out.print("¿Cuántos productos quieres registrar? (>0): ");
						entrada = escaner.nextLine();
						try {
							numeroProductos = Byte.parseByte(entrada);
							esNumero = true;

						} catch (NumberFormatException e) {
							esNumero = false;
						}
						numeroProductosValido = esNumero && numeroProductos > 0;
						if (!numeroProductosValido) {
							System.out.println("Por favor, introduce un número de productos válido.");
						}
					} while (!numeroProductosValido);

					nombreProductos = new String[numeroProductos];
					precioProductos = new float[numeroProductos];
					stockProductos = new int[numeroProductos];

					for (int i = 0; i < numeroProductos; i++) {
						System.out.println("Producto " + (i + 1) + ": ");
						boolean nombreProductoValido = false;
						do {
							System.out.print("Nombre: ");
							nombreProductos[i] = escaner.nextLine().toLowerCase();
							nombreProductoValido = !(nombreProductos[i].isEmpty());
							if (!nombreProductoValido) {
								System.out.println("No puede estar vacío.");
							}
						} while (!nombreProductoValido);

						boolean precioValido = false;
						do {
							System.out.print("Precio: ");
							entrada = escaner.nextLine();
							try {
								precioProductos[i] = Float.parseFloat(entrada);
								esNumero = true;
							} catch (NumberFormatException e) {
								esNumero = false;
							}
							precioValido = esNumero && precioProductos[i] > 0;
							if (!precioValido) {
								System.out.println("Introduce un precio válido.");
							}
						} while (!precioValido);
						boolean stockValido = false;
						do {
							System.out.print("Stock (>0): ");
							entrada = escaner.nextLine();
							try {
								stockProductos[i] = Integer.parseInt(entrada);
								esNumero = true;
							} catch (NumberFormatException e) {
								esNumero = false;
							}
							stockValido = esNumero && stockProductos[i] > 0;
							if (!stockValido) {
								System.out.println("Introduce un número de stock válido.");
							}
						} while (!stockValido);

					}
					entrada = escaner.nextLine();
				}
			}

			if (opcion == 2) {
				if (numeroProductos == 0) {
					System.out.println("No hay productos registrados.");
				} else {
					System.out.println("--- INVENTARIO ---");
					for (int i = 0; i < numeroProductos; i++) {
						System.out.println("Producto: " + nombreProductos[i] + ". Precio: " + precioProductos[i]
								+ ". Stock: " + stockProductos[i] + ". Valor Stock: "
								+ (stockProductos[i] * precioProductos[i]));
					}
					entrada = escaner.nextLine();
				}
			}

			if (opcion == 3) {
				if (numeroProductos == 0) {
					System.out.println("No hay productos registrados.");
				} else {
					System.out.println("--- VENTA DE UN PRODUCTO ---");
					boolean nombreProductoValido = false;
					do {
						System.out.print("Introduce el nombre del producto a vender: ");
						entrada = escaner.nextLine().toLowerCase();
						nombreProductoValido = !(entrada.isEmpty());
						if (!nombreProductoValido) {
							System.out.println("No puede estar vacío.");
						}
					} while (!nombreProductoValido);

					int indiceArray = 0;
					boolean encontrado = false;

					for (int i = 0; i < numeroProductos; i++) {
						if (entrada.equals(nombreProductos[i])) {
							indiceArray = i;
							encontrado = true;
							break;
						}
						if (encontrado)
							break;
					}

					if (!encontrado) {
						System.out.println("No ha sido encontrado el producto.");
					} else {
						int cantidadAVender = 0;
						boolean cantidadAVenderValida = false;
						do {
							System.out.print("Cantidad a vender (>0): ");
							entrada = escaner.nextLine();
							try {
								cantidadAVender = Integer.parseInt(entrada);
								esNumero = true;
							} catch (NumberFormatException e) {
								esNumero = false;
							}
							cantidadAVenderValida = esNumero && cantidadAVender > 0
									&& cantidadAVender <= stockProductos[indiceArray];
							if (!cantidadAVenderValida) {
								System.out.println("Introduce una cantidad a vender válida.");
							}
							if (cantidadAVender > stockProductos[indiceArray]) {
								System.out.println(
										"No hay suficiente stock. Stock disponible: " + stockProductos[indiceArray]);
							}
						} while (!cantidadAVenderValida);
						stockProductos[indiceArray] -= cantidadAVender;
						System.out.println("Cantidad a pagar: " + (precioProductos[indiceArray] * cantidadAVender)
								+ "\n Compra Realizada. \n Stock restante de " + nombreProductos[indiceArray] + ": "
								+ stockProductos[indiceArray]);
						entrada = escaner.nextLine();
					}
				}
			}

		} while (!salirPrograma);

		System.out.println("Adiós.");
		escaner.close();
	}

}
