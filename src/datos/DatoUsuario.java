package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bdd.GestorBDD;
import interfazGrafica.InterfazGrafica;
import modelo.Usuario;

/**
 * 
 * @author M Carmen
 * 
 * @version 0.1
 * 
 * @date 30/09/2019
 *
 */

public class DatoUsuario implements IDatoUsuario {

	public DatoUsuario() {

	}

	/**
	 * @author M Carmen
	 * 
	 * @date 30/09/2019
	 * 
	 *       Da de baja a un usuario
	 */
	@Override
	public boolean bajaUsuario(int ID) {
		boolean exito = true;
		String SQL = "DELETE FROM usuario WHERE idUsuario = ?";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

			p.setInt(1, ID);

			p.executeUpdate();

		} catch (SQLException e) {
			InterfazGrafica.mensajeErrorUsuario(2);
			exito = false;
		}
		
		InterfazGrafica.mensajesGestionUsuarioCorrecta(1);
		
		return exito;
	}

	/**
	 * @author Varo
	 * 
	 * @date 1/09/2019
	 * 
	 *       Lista de todos los usuarios
	 */
	@Override
	public boolean listarUsuarios() {
		boolean exito = true;

		String SQL = "SELECT * FROM usuario";

		try (Connection con = GestorBDD.Conectar();
				PreparedStatement p = con.prepareStatement(SQL);
				ResultSet rs = p.executeQuery()) {

			while (rs.next()) {
				System.out.printf("%-10s%-20s%-20s\n","ID: " + rs.getInt(1) , "NOMBRE: " + rs.getString(2) , "APELLIDO: " + rs.getString(3));
			}

		} catch (SQLException e) {
			exito = false;
			InterfazGrafica.mensajeErrorUsuario(3);
		}

		return exito;
	}

	/**
	 * @author Varo
	 * 
	 * @date 1/09/2019
	 * 
	 *       Lista todas las peliculas que tiene disponible un usuario
	 */
	@Override
	public boolean peliculasUsuario(int ID) {
		boolean exito = true;

		String SQL = "SELECT * FROM pelicula P \r\n" + "WHERE P.categoria \r\n" + "IN (SELECT UC.categoria\r\n"
				+ "     FROM usuariocategoria UC\r\n" + "     WHERE UC.idUsuario = ? );";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

			p.setInt(1, ID);

			try (ResultSet rs = p.executeQuery();) {
				while (rs.next()) {
					System.out.printf("%-50s%-20s%-20s\n" , "PELICULA : " + rs.getString(2) , "\tAÑO DE ESTRENO: " + rs.getString(3) , "\tCATEGORIA: " + rs.getString(4).toUpperCase() + "\n");

				}
			}
		} catch (SQLException e) {
			exito = false;
			InterfazGrafica.mensajeErrorPelicula(3);
		}
		return exito;
	}

	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/2019
	 * 
	 *       Dar de alta a un usuario en la base de datos
	 */
	@Override
	public boolean altaUsuario(Usuario u) {

		boolean exito = true;

		String SSQL = "INSERT INTO usuario (nombre, apellido1, apellido2, fechaNacimiento, ciudad) "
				+ "VALUES (?, ?, ?, ?, ?)";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			psql.setString(1, u.getNombre());
			psql.setString(2, u.getApellido1());
			psql.setString(3, u.getApellido2());
			psql.setDate(4, u.getFechaNacimiento());
			psql.setString(5, u.getCiudadNacimiento());

			psql.execute();

		} catch (SQLException e) {

			InterfazGrafica.mensajeErrorUsuario(1);
		}
		
		InterfazGrafica.mensajesGestionUsuarioCorrecta(2);
		System.out.println(u + "\n");

		return exito;
	}

	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/2019
	 * 
	 *       Metodo actualizar un usuario
	 */
	@Override
	public boolean actualizarUsuario(int id, Usuario u) {
		boolean exito = true;

		String sSQL = "UPDATE usuario SET nombre=?, apellido1=?, apellido2=?, fechaNacimiento=?, ciudad=? WHERE idUsuario=?";
		try (Connection con = GestorBDD.Conectar(); PreparedStatement pstm = con.prepareStatement(sSQL);) {
			pstm.setString(1, u.getNombre());
			pstm.setString(2, u.getApellido1());
			pstm.setString(3, u.getApellido2());
			pstm.setDate(4, u.getFechaNacimiento());
			pstm.setString(5, u.getCiudadNacimiento());
			pstm.setInt(6, id);
			pstm.executeUpdate();

		} catch (SQLException e) {
			InterfazGrafica.mensajeErrorUsuario(4);

		}
		
		InterfazGrafica.mensajesGestionUsuarioCorrecta(3);
		System.out.println(u + "\n");
		return exito;
	}

	@Override
	public boolean listarPeliculasNoVistas(int id) {
		boolean exito = true;

		String SQL = "SELECT * FROM pelicula P \r\n" + "WHERE P.idPelicula \r\n"
				+ "NOT IN (SELECT R.idPelicula\r\n" + "     FROM registro R\r\n" + "     WHERE R.idUsuario = ? );";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

			p.setInt(1, id);

			try (ResultSet rs = p.executeQuery();) {
				while (rs.next()) {
					System.out.printf("%-50s%-20s%-20s\n" , "PELICULA : " + rs.getString(2) , "\tAÑO DE ESTRENO: " + rs.getString(3) , "\tCATEGORIA: " + rs.getString(4).toUpperCase() + "\n");

				}
			}
		} catch (SQLException e) {
			exito = false;
			InterfazGrafica.mensajeErrorPelicula(3);
		}

		return exito;
	}

}
