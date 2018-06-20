package main;

import java.util.Scanner;

import frutas.Fruta;
import frutas.Melocoton;

public class Main {

	public static void main(String[] args) {
		
		Fruta fruta = new Fruta();
		
		String nombre;
		int peso;
		double precio;
		
		Scanner entrada = new Scanner(System.in);
		
		nombre = entrada.nextLine();
		peso = entrada.nextInt();
		precio = entrada.nextDouble();
		
		fruta.addMelocoton(new Melocoton(nombre, peso, precio));
		
		
		
		

	}

}
