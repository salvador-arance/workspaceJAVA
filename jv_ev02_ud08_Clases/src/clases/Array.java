package clases;

import java.util.Random;

public class Array {
	
	private static final int ARRAY_SIZE = 10;
	private int array[] = new int[ARRAY_SIZE];
	
	public int[] getArray() {
		return array;
	}

	private Random rnd = new Random();
	
	public Array() {
		this.init();
	}
	
	private void init() {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = rnd.nextInt(101);
		}
	}
	
	public void increment() {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] ++;
		}
	}
	
	public void decrement() {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] --;
		}
	}
	
	public int countEven() {
		int numeroPares = 0;
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] % 2 == 0) {
				numeroPares ++;
			}
		}
		return numeroPares;
	}
}
