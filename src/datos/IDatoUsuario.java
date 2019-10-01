package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
public interface IDatoUsuario {

	/**
	 * @author M Carmen
	 * 
	 * @date 30/09/2019
	 * 
	 *       da de baja a un usuario
	 */
	public static boolean bajaUsuario(int ID) {
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

}
