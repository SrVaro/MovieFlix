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

		InterfazGrafica.mensajesLeerUsuario(1);
		String nombre = LecturaDatos.LeerString();

		InterfazGrafica.mensajesLeerUsuario(2);
		String apellido1 = LecturaDatos.LeerString();

		InterfazGrafica.mensajesLeerUsuario(3);
		String apellido2 = LecturaDatos.LeerString();

		InterfazGrafica.mensajesLeerUsuario(4);
		Date fechaNacimiento = LecturaDatos.LeerFecha();

		InterfazGrafica.mensajesLeerUsuario(5);
		String CiudadNacimiento = LecturaDatos.LeerString();

		return new Usuario(nombre, apellido1, apellido2, fechaNacimiento, CiudadNacimiento);

	}

}
