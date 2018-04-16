import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Ejercicio VideoClub.
		// crear una aplicacion de consola que permita el registro y listado de
		// peliculas.
		// una pelicula tendra: titulo, duracion (minutos), precio, genero,
		// resumen.

		Scanner miScanner = new Scanner(System.in);
		ArrayList<Pelicula> listDePeliculas = new ArrayList<Pelicula>();

		int intWhile = 0;
		while (intWhile != -1) {
			System.out.println("Despues es distinto de -1");
			System.out.println("Inserta una opcion");
			System.out.println("1- Introducir pelicula");
			System.out.println("2- Listar pelicula");
			System.out.println("3- Salir");
			String introducido = miScanner.nextLine();

			System.out.println("Has introducido: " + introducido);
			int introducidoInt = Integer.parseInt(introducido);
			switch (introducidoInt) {
			
			case 1:
				System.out.println("Introduce los datos de la pelicula: ");
				Pelicula nuevo = new Pelicula();
				System.out.println("Introduce el titulo de la pelicula: ");
				introducido = miScanner.nextLine();
				nuevo.titulo = introducido;

				System.out.println("Introduce duracion: ");
				introducido = miScanner.nextLine();
				nuevo.duracion = Integer.parseInt(introducido);

				System.out.println("Introduce el precio: ");
				introducido = miScanner.nextLine();
				nuevo.precio = Double.parseDouble(introducido);

				System.out.println("Introduce el genero: ");
				introducido = miScanner.nextLine();
				nuevo.genero = introducido;

				System.out.println("Introduce el resumen: ");
				introducido = miScanner.nextLine();
				nuevo.resumen = introducido;

				listDePeliculas.add(nuevo);
				System.out.println("Pelicula registrada correctamente");

				break;
			
			case 2:
				System.out.println("Listando pelicula");

				System.out.println("**************");
				for (Pelicula elemento : listDePeliculas) {
					elemento.mostrarDatos();
					

				}
				System.out.println("----------------");
				break;

			case 3:
				System.out.println("Hasta luego");
				intWhile = -1;
				break;

			default:
				System.out.println("Opcion no valida");
				break;

			}// end switch

		}// end while
		System.out.println("despues del while");
		miScanner.close();

	}// end main
		// end class

}
