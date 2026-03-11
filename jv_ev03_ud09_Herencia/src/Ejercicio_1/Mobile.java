package Ejercicio_1;

public class Mobile extends Device {
	private int number;
	
	public Mobile(String name, String brand, String price, int number) {
		super(name, brand, price);
		this.number = number;
	}
	
	public void call(int otherNumber) {
		System.out.println("Calling number " + otherNumber + "...");
	}

	@Override
	public String toString() {
		return "Mobile [number=" + number + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
