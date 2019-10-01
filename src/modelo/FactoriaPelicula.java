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

		InterfazGrafica.mensajeNombrePelicula();
		String nombre = LecturaDatos.LeerString();

		InterfazGrafica.mensajeAnnoPelicula();
		int annoEstreno = (LecturaDatos.LeerInt());

		CATEGORIA categoria = null;
		InterfazGrafica.mensajeValPelicula();
		int valoracion = LecturaDatos.LeerInt();

		int opcion = 0;

		do {

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
				categoria = CATEGORIA.AVENTURA;
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

		} while (opcion < 1 && opcion > 6);

		return new Pelicula(nombre, annoEstreno, categoria, valoracion);
	}

}
