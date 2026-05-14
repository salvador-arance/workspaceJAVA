package ejercicio_1;
import java.util.Random;


public class RealNumbers implements Statatistics {
	
	private double[] values;
	
	
	public RealNumbers() {
		values = new double[5];
		initialize();
	}
	
	
	private void initialize() {
		Random rnd = new Random();
		for (int i = 0; i < values.length; i ++) {
			values[i] = rnd.nextDouble(100);
		}
	}

	@Override
	public double min() {
		double result = values[0];
		
		for (int i = 1; i < values.length ; i++) {
			if (values[i] < result) {
				result = values[i];
			}
		}
		
		return result;
	}

	@Override
	public double max() {
		double result = values[0];
		
		for (int i = 1; i < values.length ; i++) {
			if (values[i] > result) {
				result = values[i];
			}
		}
		
		return result;
	}

	@Override
	public double sum() {
		double result = values[0];
		
		for (int i = 1; i < values.length ; i++) {
			result += values[i];
			
		}
		
		return result;
	}

	@Override
	public void print() {
		System.out.println("Elementos del array: ");
		System.out.println();
		String mensaje = "";
		
		for (int i = 0; i < values.length; i ++) {
			mensaje += values[i];
			
			if (i != values.length - 1) {
				mensaje += ", ";
			} else {
				mensaje += ".";
			}
		}
		
		System.out.println(mensaje);
		System.out.println();
		System.out.println("Mínimo: " + this.min());
		System.out.println("Máximo: " + this.max());
		System.out.println("Suma: " + this.sum());
	}

}
