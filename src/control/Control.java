package control;

import interfazGrafica.InterfazGrafica;
import servicio.Servicio;
import utilidades.LecturaDatos;

/**
 * 
 * @author M Carmen
 * 
 * @version 0.1
 * 
 * @date 30/09/2019
 * 
 */
public class Control {

	private static Servicio s = new Servicio();

	public Control() {

	}

	/**
	 * @author M Carmen
	 * 
	 *         Comienzo del programa. Muestra menu y recoge opcion elegida por el
	 *         usuario
	 */
	public static void empezarPrograma() {

		InterfazGrafica.inicializarInterfaz();

		int opcion = 99;
		while (opcion != 0) {

			InterfazGrafica.mostrarMenu();

			do {

				opcion = LecturaDatos.LeerInt();
				if (opcion < 0 || opcion > 5)
					InterfazGrafica.mensajeErrorOpcion();

			} while (opcion < 0 || opcion > 5);

			switch (opcion) {

			case 1:
				s.gestionUsuarios();
				break;
			case 2:
				s.gestionPeliculas();
				break;
			case 3:
				s.listarUsuarios();
				break;
			case 4:
				s.listarCategorias();
				break;
			case 5:
				s.listadosPeliculas();
				break;
			}
		}

		InterfazGrafica.mostrarMenuPausa();
		LecturaDatos.LeerString();

	}

	public void gestionUsuarios() {
		int option = 99;
		while (option != 0) {

			InterfazGrafica.gestionU();

			do {

				option = LecturaDatos.LeerInt();
				if (option < 0 || option > 3)
					InterfazGrafica.mensajeErrorOpcion();
			} while (option < 0 || option > 3);

			switch (option) {
			case 1:
				s.altaUsuario();
				break;
			case 2:
				s.bajaUsuario();
				break;
			case 3:
				s.actualizarUsuario();
				break;
			}
		}
	}

	public void gestionPeliculas() {
		int opcion = 99;
		while (opcion != 0) {

			InterfazGrafica.gestionP();

			do {

				opcion = LecturaDatos.LeerInt();
				if (opcion < 0 || opcion > 2)
					InterfazGrafica.mensajeErrorOpcion();

			} while (opcion < 0 || opcion > 2);

			switch (opcion) {
			case 1:
				s.altaPelicula();
				break;
			case 2:
				s.bajaPelicula();
				break;
			}
		}
	}

	public void listadosPeliculas() {
		int opcion = 99;
		while (opcion != 0) {

			InterfazGrafica.listPeliculas();

			do {

				opcion = LecturaDatos.LeerInt();
				if (opcion < 0 || opcion > 8)
					InterfazGrafica.mensajeErrorOpcion();

			} while (opcion < 0 || opcion > 8);

			switch (opcion) {
			case 1:
				s.peliculaUsuario();
				break;
			case 2:
				s.listarPeliculas();
				break;
			case 3:
				s.listarPeliculasMayMen();
				break;
			case 4:
				s.listarPeliculasVal();
				break;
			case 5:
				s.listarPeliculasNoVistas();
				break;
			case 6:
				s.listarPeliculasRec();
				break;
			case 7:
				s.listarPeliculaActual();
				break;
			case 8:
				s.listarPeliculasCat();
				break;
			}
		}
	}
}