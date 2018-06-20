package main;

import java.util.Scanner;

import frutas.Fruta;
import frutas.Limon;
import frutas.Melocoton;

public class Main {

	private static Fruta fruta = new Fruta();

	private static int opcion;
	private static int peso;
	private static double precio;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Bascula de alimentos");
		System.out.println("Introdzuca la opción que desea\n");

		System.out.println("1.-Frutas");
		System.out.println("2.-Verduras");
		System.out.println("3.-Ticket");
		System.out.println("4.-Salir");

		opcion = entrada.nextInt();

		switch (opcion) {

		case 1:

			System.out.println("¿Que fruta desea introducir?");
			System.out.println("1.- Limón");
			System.out.println("2.- Manzana");
			System.out.println("3.- Melocotón");
			System.out.println("4.- Pera");

			opcion = entrada.nextInt();

			if (opcion == 1) {

				System.out.println("Usted a elegido Limón");
				System.out.println("Introduzca el peso:");

				peso = entrada.nextInt();

				System.out.println("Introduzca el precio:");
				precio = entrada.nextDouble();

				fruta.addLimon(new Limon(peso, precio));

				System.out.println("Usted introducido un Limon");

				fruta.listaLimones();

				break;

			}
			

		}

	}

}
