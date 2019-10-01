package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bdd.GestorBDD;

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
	 * @author Varo
	 * 
	 * @date 1/09/2019
	 * 
	 *       Devuelve todas las peliculas que tiene disponible un usuario
	 */
	public boolean peliculasUsuario(int ID) {
		boolean exito = true;

		String SQL = "SELECT * FROM usuariocategoria WHERE idUsuario = ?";

		PreparedStatement stmt;
		try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

			p.setInt(1, ID);

			try (ResultSet rs = p.executeQuery();) {
				while (rs.next()) {
					System.out.println("EMP_ID=" + rs.getString(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return exito;
	}

}
