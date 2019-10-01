package datos;

import modelo.CATEGORIA;
import modelo.Pelicula;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

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

		String SSQL = "INSERT INTO pelicula (nombre, annoEstreno, categoria, valoracion) " + "VALUES (?, ?, ?, ?)";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			psql.setString(1, p.getNombre());
			psql.setInt(2, p.getAnnoEstreno());
			psql.setString(3, p.getCategoria().toString().toLowerCase());
			psql.setInt(4, p.getValoracion());

			psql.execute();

		} catch (SQLException e) {

			InterfazGrafica.mensajeErrorBbdd();

		}

		return exito;
	}

	/**
	 * @author M Carmen
	 * 
	 * @date 01/10/2019
	 * 
	 *       muestra listado de peliculas
	 *
	 */
	public boolean listarPeliculas() {

		boolean exito = true;

		String SSQL = "SELECT * FROM pelicula";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			ResultSet x = psql.executeQuery();

			while (x.next()) {
				System.out.println(x.getString(2));
			}

		} catch (SQLException e) {

			InterfazGrafica.mensajeErrorBbdd();
			exito = false;
		}

		return exito;
	}

	/**
	 * 
	 * @author M� Jos�
	 * 
	 * @date 01/10/2019
	 * 
	 *       Metodo que muestra pel�culas por su valoraci�n (de mayor a menor)
	 */
	public boolean listarPeliculasVal() {

		boolean exito = true;

		String SSQL = "SELECT * FROM pelicula ORDER BY valoracion DESC";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {
			ResultSet x = psql.executeQuery();
			while (x.next()) {
				System.out.println(x.getString(2));
			}
		} catch (SQLException e) {
			InterfazGrafica.mensajeErrorBbdd();
			exito = false;
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

	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/2019
	 * 
	 *       metodo listar pelicula por categoria
	 */
	public boolean listarPeliculasMayMen() {

		boolean exito = true;

		String SSQL = "SELECT * FROM pelicula ORDER BY visualizaciones DESC";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			ResultSet x = psql.executeQuery();

			while (x.next()) {
				System.out.println(x.getString(2));
			}

		} catch (SQLException e) {

			InterfazGrafica.mensajeErrorBbdd();
			exito = false;
		}

		return exito;
	}
	/**
	 * @author M Carmen
	 * 
	 * @date 01/10/2019
	 * 
	 *  muestra listado de peliculas recomendadas
	 */
	public boolean listarPeliculasRec() {

		boolean exito = true;

		String SSQL = "SELECT * FROM pelicula WHERE recomendada=1";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			ResultSet x = psql.executeQuery();

			while (x.next()) {
				System.out.println(x.getString(2));
			}

		} catch (SQLException e) {

			InterfazGrafica.mensajeErrorBbdd();
			exito = false;
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
	 *         Importa todas las peliculas de un archivo de texto y las sube a la
	 *         base de datos
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

				altaPelicula(new Pelicula(nombre, anno, categoria, (int) (Math.random() * 5)));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/2019
	 * 
	 *       metodo listar pelicula por categoria
	 */

	public boolean listarPeliculaActual() {
		boolean exito = true;
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		String SSQL = "SELECT * FROM pelicula WHERE annoEstreno = ?";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			psql.setInt(1, year);

			ResultSet x = psql.executeQuery();

			while (x.next()) {
				System.out.println(x.getString(2));
			}

		} catch (SQLException e) {

			InterfazGrafica.mensajeErrorBbdd();
			exito = false;
		}

		return exito;
	}

	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/19
	 * 
	 *       metodo para listar categorias
	 */

	public boolean listarCategorias() {

		boolean exito = true;

		String SSQL = "SELECT * FROM categoria";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement psql = con.prepareStatement(SSQL);) {

			ResultSet x = psql.executeQuery();

			while (x.next()) {
				System.out.println(x.getString(1));
			}

		} catch (SQLException e) {

			InterfazGrafica.mensajeErrorBbdd();
			exito = false;
		}

		return exito;
	}

	/**
	 * 
	 * @author Andres
	 * 
	 * @date 01/10/19
	 * 
	 *       metodo para listar categorias
	 */

	public boolean bajaPelicula(int id) {
		boolean exito = true;
		String SQL = "DELETE FROM pelicula WHERE idPelicula=?";

		try (Connection con = GestorBDD.Conectar(); PreparedStatement p = con.prepareStatement(SQL)) {

			p.setInt(1, id);

			p.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
			exito = false;
		}
		return exito;
	}

}
