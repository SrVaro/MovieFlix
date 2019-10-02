package interfazGrafica;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author Andres
 * 
 * @version 0.1
 *
 * @date 30/09/2019
 *
 */
public class InterfazGrafica {

	private static Properties prop = new Properties();
	private static InputStream is = null;

	public InterfazGrafica() {

	}

	public static void inicializarInterfaz() {
		InputStream is = null;

		try {
			is = new FileInputStream("src/mensajes.properties");
			prop.load(is);
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	/**
	 * 
	 * @autor Mª José
	 * 
	 * @date 30/09/2019
	 * 
	 *       Método que muestra el menú
	 * 
	 */

	public static void mostrarMenu() {

		System.out.println("Elija una de las siguientes opciones:");
		System.out.println("*-------------------------------------------------------*");
		System.out.println("1: Dar de alta películas.");
		System.out.println("2: Dar de alta usuarios.");
		System.out.println("3: Dar de baja usuarios.");
		System.out.println("4: Modificar usuarios.");
		System.out.println("5: Listado películas disponibles para el usuario.");
		System.out.println("6: Litado de todas las películas.");
		System.out.println("7: Listado de películas por categoria.");
		System.out.println("8: Listar Usuarios.");
		System.out.println("9: Listado de películas por visualizaciones de mayor a menor.");
		System.out.println("10: Listado de películas de mayor a menor valoración.");
		System.out.println("11: Listado de películas no vistas por el usuario.");
		System.out.println("12: Listado de películas recomendadas.");
		System.out.println("13: Listado de películas de este año.");
		System.out.println("14: Listado de las categorias disponibles.");
		System.out.println("15: Dar de baja peliculas.");
		System.out.println("0: Para salir.");
		System.out.println("*-------------------------------------------------------*");
	}

	public static void mostrarMenuPausa() {
		System.out.println(prop.getProperty("menu.pausa"));
	}

	/**
	 * @author M Carmen
	 * 
	 *         Mensajes para dar de alta una pelicula
	 */
	public static void mensajesLeerPelicula(int n) {
		switch (n) {
		case 1:
			System.out.println(prop.getProperty("pelicula.estreno"));
			break;
		case 2:
			System.out.println(prop.getProperty("pelicula.annoEstreno"));
			break;
		case 3:
			System.out.println(prop.getProperty("pelicula.valoracion"));
			break;
		case 4:
			System.out.println(prop.getProperty("pelicula.id"));
			break;
		}

	}
	
	public static void mensajeLeerCategoria() {
		System.out.println(prop.getProperty("categoria.categoria"));
	}

	public static void mensajeMenuCategoria() {
		System.out.println(prop.getProperty("categoria.menu"));
	}

	/**
	 * @author M Carmen
	 * 
	 * @date 30/09/2019
	 * 
	 *       Mensajes para dar de alta un usuario
	 */

	public static void mensajesLeerUsuario(int n) {
		switch (n) {
		case 1:
			System.out.println(prop.getProperty("usuario.nombre"));
			break;
		case 2:
			System.out.println(prop.getProperty("usuario.apellido1"));
			break;
		case 3:
			System.out.println(prop.getProperty("usuario.apellido2"));
			break;
		case 4:
			System.out.println(prop.getProperty("usuario.fechaNacimiento"));
			break;
		case 5:
			System.out.println(prop.getProperty("usuario.ciudad"));
			break;
		case 6:
			System.out.println(prop.getProperty("usuario.id"));
			break;
		}
	}
	
	

	/**
	 * @author M Carmen
	 * 
	 * @date 30/09/2019
	 * 
	 *       Mensajes de error
	 */
	public static void mensajeErrorLeerInt() {

		System.out.println(prop.getProperty("lectura.error.int"));

	}

	public static void mensajeErrorLeerDate() {

		System.out.println(prop.getProperty("lectura.error.date"));

	}

	public static void mensajeErrorOpcion() {

		System.out.println(prop.getProperty("opcion.error"));

	}

	public static void mensajeErrorBbdd() {

		System.out.println(prop.getProperty("bdd.error"));

	}
	
	public static void mensajeErrorUsuario(int n) {

		switch (n) {
		case 1:
			System.out.println(prop.getProperty("error.usuario.alta"));
			break;
		case 2:
			System.out.println(prop.getProperty("error.usuario.baja"));
			break;
		case 3:
			System.out.println(prop.getProperty("error.usuario.listar"));
			break;
		case 4:
			System.out.println(prop.getProperty("error.usuario.actualizar"));
			break;
		}

	}
	
	public static void mensajeErrorPelicula(int n) {

		switch (n) {
		case 1:
			System.out.println(prop.getProperty("error.pelicula.alta"));
			break;
		case 2:
			System.out.println(prop.getProperty("error.pelicula.baja"));
			break;
		case 3:
			System.out.println(prop.getProperty("error.pelicula.listar"));
			break;
		case 4:
			System.out.println(prop.getProperty("error.pelicula.importar"));
			break;
		}

	}

}
