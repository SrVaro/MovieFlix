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

		int opcion = 99;
		while (opcion != 0) {

			InterfazGrafica.mostrarMenu();

			opcion = LecturaDatos.LeerInt();

			switch (opcion) {

			case 1:
				s.altaPelicula();
				break;
			case 2:
				s.altaUsuario();
				break;
			case 3:
				s.bajaUsuario();
				break;
			case 4:
				s.actualizarUsuario();
				break;
			case 5:
				s.peliculaUsuario();
				break;
			case 6:
				s.listarPeliculas();
				break;
			case 7:
				s.listarPeliculasCat();
				break;
			case 8:
				s.listarUsuarios();
				break;
			case 9:
				s.listarPeliculasMayMen();
				break;
			case 10:
				s.listarPeliculasVal();
				break;
			case 11:
				s.listarPeliculasNoVistas();
				break;
			case 12:
				s.listarPeliculasRec();
				break;
			case 13:
				s.listarPeliculaActual();
				break;
			case 14:
				s.listarCategorias();
				break;
			case 15:
				s.bajaPelicula();
			}
			InterfazGrafica.mostrarMenuPausa();
			LecturaDatos.LeerString();
		}

	}

}
