package modelo;

import java.sql.Date;

import interfazGrafica.InterfazGrafica;
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
public class FactoriaUsuario {

	/**
	 * 
	 * @author Andres
	 * 
	 * @version 0.1
	 * 
	 * @date 30/09/19
	 * 
	 *       Se crea un Usuario con los datos pedidos por la lectura de datos
	 * 
	 */

	public static Usuario pedirUsuario() {
		System.out.println("Añadir un usuario");

		InterfazGrafica.mensajeNombreUsuario();
		String nombre = LecturaDatos.LeerString();
		
		InterfazGrafica.mensajeApellido1Usuario();
		String apellido1 = LecturaDatos.LeerString();
		
		InterfazGrafica.mensajeApellido2Usuario();
		String apellido2 = LecturaDatos.LeerString();
		
		InterfazGrafica.mensajeFechaNacimientoUsuario();
		Date fechaNacimiento = LecturaDatos.LeerFecha();
		
		InterfazGrafica.mensajeCiudadUsuario();
		String CiudadNacimiento = LecturaDatos.LeerString();

		return new Usuario(nombre, apellido1, apellido2, fechaNacimiento, CiudadNacimiento);

	}

}
