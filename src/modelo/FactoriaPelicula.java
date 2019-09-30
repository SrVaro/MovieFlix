package modelo;

import utilidades.LecturaDatos;
import modelo.Pelicula;
import interfazGrafica.InterfazGrafica;

/**
 * 
 * @author Andres
 * 
 * @version 0.1
 * 
 * @fecha 30/09/2019
 * 
 *        Se crea una pelicula segun los datos introducidos por el Scanner
 *
 */

public class FactoriaPelicula {

	public static Pelicula pedirPelicula() {
		System.out.println("Adjuntar nueva película");

		String nombre = LecturaDatos.LeerString("Introduzca el nombre de la pelicula");
		int annoEstreno = (LecturaDatos.LeerInt("Introduzca el año de estreno de la Película"));
		CATEGORIA categoria;
		int opcion = 0;
		while (opcion > 0 && opcion <= 6) {
			InterfazGrafica.mensajeCategoriaPelicula();
			opcion = LecturaDatos.LeerInt();

			switch (opcion) {
			case 1:
				categoria = CATEGORIA.POLICIACA;
				break;

			case 2:
				categoria = CATEGORIA.ROMANTICA;
				break;

			case 3:
				categoria = CATEGORIA.AVENTURAS;
				break;

			case 4:
				categoria = CATEGORIA.COMEDIA;
				break;

			case 5:
				categoria = CATEGORIA.ANIMACION;
				break;

			case 6:
				categoria = CATEGORIA.THRILLER;
				break;
			}
			

			return new Pelicula(nombre, annoEstreno, categoria);

		}
	}

}