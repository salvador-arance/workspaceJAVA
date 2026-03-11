package Ejercicio_1;

public class Computer extends Device {
	private String processor;

	public Computer(String name, String brand, String price, String processor) {
		super(name, brand, price);
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Computer [processor=" + processor + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
