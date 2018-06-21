package main;

import java.util.Scanner;

import frutas.Fruta;
import frutas.Limon;
import frutas.Melocoton;

public class Main {

	private static Fruta fruta = new Fruta();

	private static int menuPrincipal;
	private static int subMenu;
	private static int peso;
	private static double precio;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		while (menuPrincipal != 4) {

			System.out.println("Bascula de alimentos");
			System.out.println("Introdzuca la opción que desea	\n");

			System.out.println("1.-Frutas");
			System.out.println("2.-Verduras");
			System.out.println("3.-Ticket");
			System.out.println("4.-Salir");

			menuPrincipal = entrada.nextInt();

			switch (menuPrincipal) {

			case 1:

				System.out.println("¿Que fruta desea introducir?	\n");

				System.out.println("1.- Limón");
				System.out.println("2.- Manzana");
				System.out.println("3.- Melocotón");
				System.out.println("4.- Pera");
				System.out.println("5.- Volver al Menu Principal");

				subMenu = entrada.nextInt();

				switch (subMenu) {

				case 1:

					System.out.println("Usted a elegido Limón");
					System.out.println("Introduzca el peso:");

					peso = entrada.nextInt();

					System.out.println("Introduzca el precio:");
					precio = entrada.nextDouble();

					fruta.addLimon(new Limon(peso, precio));

					System.out.println("Usted introducido un Limon");

					fruta.listaLimones();

					break;

				case 5:

					break;

				}

			}
		}
	}

}
