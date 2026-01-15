package clases;
import java.util.Random;

public class Coin {
	private String estado;

	public String getEstado() {
		return estado;
	}

	public Coin() {
		super();
		this.estado = this.flip();
	} 
	
	public String flip() {
		Random rnd = new Random();
		boolean valor = rnd.nextBoolean();
		if (valor) {
			this.estado = "PILE";
		} else {
			this.estado = "CROSS";
		}
		return this.estado;
	}
	
	public void flip2() {
		Random rnd = new Random();
		boolean valor = rnd.nextBoolean();
		if (valor) {
			this.estado = "PILE";
		} else {
			this.estado = "CROSS";
		}
	}
}


