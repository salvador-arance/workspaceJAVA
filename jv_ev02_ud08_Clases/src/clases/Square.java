package clases;

public class Square {
	private char character;

	public Square() {
		this.character = '#';
	}

	public Square(char character) {
		this.character = character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	private String generate(int size) {
		String resultado = "";
		for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultado += this.character;
            }
            resultado += "\n";
        }
		return resultado;
	}

	public void show(int size) {
		System.out.println(this.generate(size));
	}
}
