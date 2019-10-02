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
		System.out.println(" ");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             1. GESTIÓN DE USUARIOS               **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             2. GESTIÓN DE PELÍCULAS              **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             3. LISTADO DE USUARIOS               **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             4. LISTADO DE CATEGORÍAS             **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             5. LISTADOS PELÍCULAS                **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             0. SALIR                             **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(" ");
	}

	public static void gestionU() {

		System.out.println("Elija una de las siguientes opciones:");
		System.out.println(" ");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             1. Dar de alta Usuario               **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             2. Dar de baja Usuario               **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             3. Modificar Usuario                 **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             0. SALIR                             **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(" ");
	}

	public static void gestionP() {

		System.out.println("Elija una de las siguientes opciones:");
		System.out.println(" ");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             1. Dar de alta Película              **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             2. Dar de baja Película              **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**             0. SALIR                             **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(" ");
	}

	public static void listPeliculas() {

		System.out.println("Elija una de las siguientes opciones:");
		System.out.println(" ");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    1. Disponibles para el Usuario                **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    2. Todas las Películas                        **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    3. Por visualizaciones (de Mayor a Menor)     **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    4. Por valoración (de Mayor a Menor)          **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    5. No vistas por el Usuario                   **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    6. Recomendadas                               **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    7. Películas de este año                      **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    8. Por categorías                             **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("**    0. SALIR                                      **");
		System.out.println("**--------------------------------------------------**");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println(" ");
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
		case 5:
			System.out.println(prop.getProperty("pelicula.crear"));
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
		case 7:
			System.out.println(prop.getProperty("usuario.crear"));
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
	
	public static void mensajeErrorListarCategoria() {

		System.out.println(prop.getProperty("error.categoria.listar"));

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
