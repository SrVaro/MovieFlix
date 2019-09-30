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

	public String bd = "movie_flix";
	public String url = "jdbc:mysql://10.90.36.106/" + bd;
	public String user = "root";
	public String pass = "root";

	/**
	 * 
	 * @return Connection
	 * 
	 *         Método que conecta con la base de datos y devuelve la conexión
	 */

	public Connection Conectar() {
		Connection link = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");

			link = DriverManager.getConnection(this.url, this.user, this.pass);

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, ex);

		}
		return link;

	}
}
