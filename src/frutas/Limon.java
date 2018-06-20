package frutas;

public class Limon {

	private final String nombre = "Limon";
	private int peso;
	private double precio;

	public Limon() {
		
	}

	public Limon(int peso, double precio) {

		this.peso = peso;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
