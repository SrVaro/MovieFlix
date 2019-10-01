package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bdd.GestorBDD;
import interfazGrafica.InterfazGrafica;
import modelo.Usuario;
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

public class DatoUsuario implements IDatoUsuario{
	
	public DatoUsuario() {
		
	}
	
	/**
	 * @author M Carmen
	 * 
	 * @date 30/09/2019
	 * 
	 *       da de baja a un usuario
	 */
	public boolean bajaUsuario(int ID) {
		boolean exito = true;
		String SQL = "DELETE FROM usuario WHERE idUsuario = ?";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

			p.setInt(1, ID);

			p.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
			exito = false;
		}
		return exito;
	}
	
	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/2019
	 * 
	 * metodo dar de alta a un usuario
	 */


	public static boolean altaUsuario(Usuario u) {

		boolean exito = true;

		String SSQL = "INSERT INTO usuario (nombre, apellido1, apellido2, fechaNacimiento, ciudad) " + "VALUES (?, ?, ?, ?, ?)";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			psql.setString(1, u.getNombre());
			psql.setString(2, u.getApellido1());
			psql.setString(3, u.getApellido2());
			psql.setDate(4, u.getFechaNacimiento());
			psql.setString(5, u.getCiudadNacimiento());

			int resultado = psql.executeUpdate();

			psql.close();
			// conexion

		} catch (SQLException e) {
			
		
			InterfazGrafica.mensajeError();

		}

		return exito;
	}
}
