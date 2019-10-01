package datos;

import modelo.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
			exito=false;
		}

		return exito;
	}
	
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

	}