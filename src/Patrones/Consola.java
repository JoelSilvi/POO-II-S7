package Patrones;

import java.util.Scanner;

public class Consola {

	private static Scanner input = new Scanner(System.in);

	private Consola() {
	}

	public static void escribir(Object x) {
		System.out.println(x);
	}

	public static String leer() {
		return input.nextLine();
	}

	public static String leer(String mensaje) {
		Consola.escribir(mensaje);
		return input.nextLine();
	}

	public static int leerEntero() {
		return Integer.parseInt(Consola.leer());
	}

}
