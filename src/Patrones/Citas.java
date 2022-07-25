package Patrones;

public class Citas {

	public static int valor;

	public static void main(String[] args) {

		Consola.escribir("Hola Escribe tu nombre");
		String nombre = Consola.leer();
		System.out.println("***********************************");
		Consola.escribir("Eliga un número de 1 a 3");
		System.out.println("***********************************");
		System.out.println("1.- Horarios Mañana");
		System.out.println("2.- Horarios Tarde");
		System.out.println("3.- Sobre Cupos");
		int elegido = Consola.leerEntero();
		valor = elegido;

		Consola.escribir(nombre + " Nuestros horarios disponibles son:\n");

		CitaUno one = new CitaUno();
		one.PrimeraOpcion();

		CitaDos dos = new CitaDos();
		dos.SegundaOpcion();

		CitaTres tres = new CitaTres();
		tres.TerceraOpcion();
		System.out.println("\n");
		Especialidades especialidad = new Especialidades();
		especialidad.especialidades();
	}

}
