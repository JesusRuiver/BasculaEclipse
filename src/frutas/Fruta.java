package frutas;

import java.util.ArrayList;

public class Fruta {

	private ArrayList<Manzana> manzanas = new ArrayList<>();;
	private ArrayList<Pera> peras  = new ArrayList<>();
	private ArrayList<Melocoton> melocotones = new ArrayList<>();
	private ArrayList<Limon> limones = new ArrayList<>();

	public Fruta() {
		
	}

	public Fruta(ArrayList<Manzana> manzanas, ArrayList<Pera> peras, ArrayList<Melocoton> melocotones,
			ArrayList<Limon> limones) {
		
		this.manzanas = manzanas;
		this.peras = peras;
		this.melocotones = melocotones;
		this.limones = limones;
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
		
		for(Melocoton melocoto : melocotones){
			
			System.out.println(melocotones.size() + " " + melocoto.getNombre());
		}

	}
	
	public void addLimon(Limon limon) {

		limones.add(limon);
	}
	
	public void listaLimones() {
		
		for(Limon limon : limones){
			
			System.out.println(limones.size() + " " + limon.getNombre());
		}
			

	}

}
