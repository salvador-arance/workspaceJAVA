package clases;

public class Hello {
	private String greet;

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	public Hello(String greet) {
		super();
		this.greet = greet;
	}
	
	public Hello(){
		super();
		this.greet = "Hola";
	}
	
	public void SayHello() {
		System.out.println(this.greet);
	}
}
