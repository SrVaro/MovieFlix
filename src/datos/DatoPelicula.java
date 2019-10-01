package datos;

import modelo.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bdd.GestorBDD;
import interfazGrafica.InterfazGrafica;

/**
 * 
 * @author M� Jos�
 * 
 * @version 0.1
 * 
 * @date 30/09/2019
 *
 */

public class DatoPelicula {

	public static boolean altaPelicula(Pelicula p) {

		boolean exito = true;

		String SSQL = "INSERT INTO pelicula (nombre, annoEstreno, categoria) " + "VALUES (?, ?, ?)";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			psql.setString(1, p.getNombre());
			psql.setInt(2, p.getAnnoEstreno());
			psql.setString(3, p.getCategoria().toString().toLowerCase());

			psql.close();
			// conexion

		} catch (SQLException e) {

		 InterfazGrafica.mensajeError();

		}

		return exito;
	}

}
