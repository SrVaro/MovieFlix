package datos;

import modelo.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bdd.GestorBDD;
import interfazGrafica.InterfazGrafica;

/**
 * 
 * @author Mª José
 * 
 * @version 0.1
 * 
 * @date 30/09/2019
 *
 */

public class DatoPelicula {

	public boolean altaPelicula(Pelicula p) {

		boolean exito = true;

		String SSQL = "INSERT INTO pelicula (nombre, annoEstreno, categoria) " + "VALUES (?, ?, ?)";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			psql.setString(1, p.getNombre());
			psql.setInt(2, p.getAnnoEstreno());
			psql.setString(3, p.getCategoria().toString().toLowerCase());

			psql.execute();

		} catch (SQLException e) {

			InterfazGrafica.mensajeError();

		}

		return exito;
	}

	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/2019
	 * 
	 *       metodo listar pelicula por categoria
	 */

	public boolean listarPeliculasCat(String categoria) {
		boolean exito = true;

		String SQL = "SELECT * FROM pelicula WHERE categoria = ?";

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

		return exito;
	}

}
