package frutas;

import java.util.ArrayList;

public class Fruta {

	Melocoton melocoton = new Melocoton();
	private ArrayList<Manzana> manzanas;
	private ArrayList<Pera> peras;
	private ArrayList<Melocoton> melocotones = new ArrayList<>();

	public Fruta() {
		super();
	}

	public Fruta(ArrayList<Manzana> manzanas, ArrayList<Pera> peras, ArrayList<Melocoton> melocotones) {
		super();
		this.manzanas = manzanas;
		this.peras = peras;
		this.melocotones = melocotones;
	}

	public ArrayList<Manzana> getManzanas() {
		return manzanas;
	}

	public void setManzanas(ArrayList<Manzana> manzanas) {
		this.manzanas = manzanas;
	}

	public ArrayList<Pera> getPeras() {
		return peras;
	}

	public void setPeras(ArrayList<Pera> peras) {
		this.peras = peras;
	}

	public ArrayList<Melocoton> getMelocotones() {
		return melocotones;
	}

	public void setMelocotones(ArrayList<Melocoton> melocotones) {
		this.melocotones = melocotones;
	}

	public void addMelocoton(Melocoton melocoton) {

		melocotones.add(melocoton);

		System.out.println(melocoton.getNombre());
	}

	public void listaMelocotones() {

	}

}
