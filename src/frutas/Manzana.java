package frutas;

public class Manzana {

	private String nombre;
	private int peso;
	private double precio;

	public Manzana() {
		super();
	}

	public Manzana(String nombre, int peso, double precio) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
