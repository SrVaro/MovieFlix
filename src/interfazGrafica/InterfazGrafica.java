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
	 * @autor M� Jos�
	 * 
	 * @date 30/09/2019
	 * 
	 *       M�todo que muestra el men�
	 * 
	 */

	public static void mostrarMenu() {

		System.out.println("Elija una de las siguientes opciones:");
		System.out.println("*-------------------------------------------------------*");
		System.out.println("1: Dar de alta pel�culas.");
		System.out.println("2: Dar de alta usuarios.");
		System.out.println("3: Dar de baja usuarios.");
		System.out.println("4: Modificar usuarios.");
		System.out.println("5: Listado pel�culas disponibles para el usuario.");
		System.out.println("6: Litado de todas las pel�culas.");
		System.out.println("7: Listado de pel�culas por categoria.");
		System.out.println("8: Listar Usuarios.");
		System.out.println("9: Listado de pel�culas por visualizaciones de mayor a menor.");
		System.out.println("10: Listado de pel�culas de mayor a menor valoraci�n.");
		System.out.println("11: Listado de pel�culas no vistas por el usuario.");
		System.out.println("12: Listado de pel�culas recomendadas.");
		System.out.println("13: Listado de pel�culas de este a�o.");
		System.out.println("14: Listado de las categorias disponibles.");
		System.out.println("15: Dar de baja peliculas.");
		System.out.println("0: Para salir.");
		System.out.println("*-------------------------------------------------------*");
	}

	public static void mostrarMenuPausa() {
		System.out.println("\n PUlse cualquier tecla para continuar");
	}

	/**
	 * @author M Carmen
	 * 
	 *         mensajes para dar de alta una pelicula
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
		}

	}

	public static void mensajeLeerCategoria() {
		System.out.println(prop.getProperty("categoria.categoria"));
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
		}
	}

	/**
	 * @author M Carmen
	 * 
	 * @date 30/09/2019
	 * 
	 *       mensaje de error
	 */
	public static void mensajeError() {

		System.out.println("\nError al introducir los datos, vuelva a intentarlo:");

	}

	/**
	 * @author M Carmen
	 * 
	 * @date 01/10/2019
	 * 
	 *       mensaje de error BBDD
	 */
	public static void mensajeErrorBbdd() {

		System.out.println("\nError BDD:");

	}

}
