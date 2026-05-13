package org.cuatrovientos.jv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AppMonedas {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Scanner ficheroScan = null;
		PrintWriter ficheroSalida = null;
		
		String entrada = "";
		ArrayList<Moneda> listaMonedas = new ArrayList<Moneda>();
		ArrayList<String> listaErrores = new ArrayList<String>();
		
		System.out.print("Introduce el nombre del fichero a analizar: ");
		String nombreFichero = lector.next();
		
		try {
			ficheroScan = new Scanner(new File(nombreFichero));
			
			if ((!ficheroScan.hasNextLine())) {
				listaErrores.add("El fichero " + nombreFichero + " está vacío");
			}
			
			while (ficheroScan.hasNextLine()) {
				String linea = ficheroScan.nextLine();
				
				if (linea.trim().equals("")) {
					listaErrores.add("Error: línea en blanco detectada.");
					ficheroScan.close();
					return;
				}
				
				String[] partes = linea.split(":");
				
				if (partes.length != 2) {
					listaErrores.add("Error: estructura incorrecta en la línea " + linea);
					ficheroScan.close();
					return;
				}
				
				double valor = 0;
				
				try {
					valor = Double.parseDouble(partes[1]);
				} catch (NumberFormatException e) {
					listaErrores.add("Error: formato numérico incorrecto: " + partes[1]);
					ficheroScan.close();
					return;
				}
				
				Moneda moneda = new Moneda(partes[0], valor);
				
				if (listaMonedas.contains(moneda)) {
					listaErrores.add("Error: Moneda duplicada: " + moneda);
					ficheroScan.close();
					return;
				}
				
				listaMonedas.add(moneda);
			}
			
		} catch (FileNotFoundException e) {
			listaErrores.add("Error: El fichero " + nombreFichero + " no existe.");
			e.printStackTrace();
		} catch (Exception e) {
		} finally {
			if (ficheroScan != null) {
				ficheroScan.close();
				return;
			}
		}
		
		if (listaErrores.size() != 0) {
			System.out.println("Hay errores. consulte el fichero errores.log");
			try {
				ficheroSalida = new PrintWriter("errores.log");
				
				for (String error: listaErrores) {
					ficheroSalida.println(error);
				}
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return;
		}
		
		if (listaMonedas.size() != 0) {
			for (Moneda moneda : listaMonedas) {
				System.out.println(moneda.toString());
			}
		}
		
	}
	
}
