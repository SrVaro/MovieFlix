package control;

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

		int opcion;
		// llamar a interfazGrafica menu1
		opcion = LecturaDatos.LeerInt();

		switch (opcion) {

		case 1:
			// s.altaPelicula();
			break;
		case 2:
			break;
		case 3:
			
			s.bajaUsuario();
			break;
		case 4:
			break;
		case 5:
			break;
		}

	}

}
