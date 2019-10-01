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
	 * @author Varo
	 * 
	 * @date 1/09/2019
	 * 
	 *       Lista de todos los usuarios
	 */
	public boolean listarUsuarios() {
		boolean exito = true;

		String SQL = "SELECT * FROM usuario";

		try (Connection con = GestorBDD.Conectar();
				PreparedStatement p = con.prepareStatement(SQL);
				ResultSet rs = p.executeQuery()) {

			while (rs.next()) {
				System.out.println(rs.getString(2));
			}

		} catch (SQLException e) {
			exito = false;
			e.printStackTrace();
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
	public boolean peliculasUsuario(int ID) {
		boolean exito = true;

		String SQL = "SELECT * FROM usuariocategoria WHERE idUsuario = ?";

		ArrayList<String> categoriasUsuario = new ArrayList<>();

		try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

			p.setInt(1, ID);

			try (ResultSet rs = p.executeQuery();) {
				while (rs.next()) {
					categoriasUsuario.add(rs.getString(3));
				}
			}
		} catch (SQLException e) {
			exito = false;
			e.printStackTrace();
		}

		for (String categoria : categoriasUsuario) {

			SQL = "SELECT * FROM pelicula WHERE categoria = ?";

			try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

				p.setString(1, categoria);

				try (ResultSet rs = p.executeQuery();) {
					while (rs.next()) {
						System.out.println(rs.getString(2));
					}
				}
			} catch (SQLException e) {
				exito = false;
				e.printStackTrace();
			}
		}

		return exito;
	}

	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/2019
	 * 
	 *       metodo dar de alta a un usuario
	 */

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

			InterfazGrafica.mensajeErrorBbdd();
		}

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

	public boolean actualizarUsuario(Usuario u, int id) {
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
			InterfazGrafica.mensajeErrorBbdd();

		}
		return exito;
	}

}
