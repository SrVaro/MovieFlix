package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

		ArrayList<String> categoriasUsuario = new ArrayList<>();

		try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

			p.setInt(1, ID);

			try (ResultSet rs = p.executeQuery();) {
				while (rs.next()) {
					categoriasUsuario.add(rs.getString(3));
				}
			}
		} catch (SQLException e) {
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
				e.printStackTrace();
			}
		}

		return exito;
	}

}
