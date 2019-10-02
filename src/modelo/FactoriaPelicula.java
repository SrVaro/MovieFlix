package modelo;

import utilidades.LecturaDatos;
import modelo.Pelicula;

import java.io.IOException;
import java.util.InputMismatchException;

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

		boolean noConseguido = true;
		InterfazGrafica.mensajeValPelicula();
		int valoracion = 0;
		do {
			try {
				valoracion = LecturaDatos.LeerInt();
				if ((valoracion > 5) || (valoracion < 0)) {
					throw new IOException("Rango no valido, introduzca otro rango");
				} else {
					noConseguido = false;
				}
			} catch (IOException e) {
				System.out.println("Problema: " + e.getMessage());
			}

		} while (noConseguido);
		
		noConseguido = true;
		
		CATEGORIA categoria = null;
		InterfazGrafica.mensajeCategoriaPelicula();

		int opcion = 0;
		do {
			try {
				opcion = LecturaDatos.LeerInt();
				if ((opcion > 6) || (opcion < 1)) {
					throw new IOException("Rango no valido, introduzca otra opcion");
				} else {
					noConseguido = false;
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
				}
			} catch (IOException e) {
				System.out.println("Problema: " + e.getMessage());
			}

		} while (noConseguido);

		return new Pelicula(nombre, annoEstreno, categoria, valoracion);
	}

}
