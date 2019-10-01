package bdd;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * 
 * @author Mª José
 *
 * @Version 0.1
 * 
 * @date 30/09/2019
 * 
 */

public class GestorBDD {

	public static String bd = "movie_flix";
	public static String url = "jdbc:mysql://10.90.36.106/" + bd;
	public static String user = "root";
	public static String pass = "root";

	/**
	 * 
	 * @return Connection
	 * 
	 *         Método que conecta con la base de datos y devuelve la conexión
	 */

	public static Connection Conectar() {
		Connection link = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");

			link = DriverManager.getConnection(url, user, pass);

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, ex);

		}
		return link;

	}
}
