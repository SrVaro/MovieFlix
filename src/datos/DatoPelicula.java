package datos;

import modelo.Pelicula;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

	public boolean importarPeliculasTXT() {
		File archivo = new File("peliculas_cat.txt");

		try (FileReader fr = new FileReader(archivo); BufferedReader br = new BufferedReader(fr)) {
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
