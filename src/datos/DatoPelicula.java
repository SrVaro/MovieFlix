package datos;

import modelo.CATEGORIA;
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
 * @author M� Jos�
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
	 * @author Varo
	 * 
	 * @date 01/10/2019
	 * 
	 * @return boolean
	 * 
	 * Importa todas las peliculas de un archivo de texto y las sube a la base de datos
	 */
	public boolean importarPeliculasTXT() {
		File archivo = new File("src/peliculas_cat.txt");

		try (FileReader fr = new FileReader(archivo); BufferedReader br = new BufferedReader(fr)) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] atributosPelicula = linea.split(",");

				String nombre = atributosPelicula[0];

				int anno = Integer.parseInt(atributosPelicula[1]);

				CATEGORIA categoria = null;

				switch (atributosPelicula[2].trim()) {
				case "aventura":
					categoria = CATEGORIA.AVENTURA;
					break;
				case "romantica":
					categoria = CATEGORIA.ROMANTICA;
					break;
				case "comedia":
					categoria = CATEGORIA.COMEDIA;
					break;
				case "animacion":
					categoria = CATEGORIA.ANIMACION;
					break;
				case "thriller":
					categoria = CATEGORIA.THRILLER;
					break;
				case "policiaca":
					categoria = CATEGORIA.POLICIACA;
					break;
				}

				altaPelicula(new Pelicula(nombre, anno, categoria));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
