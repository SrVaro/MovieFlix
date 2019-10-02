package interfazGrafica;

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

	public InterfazGrafica() {

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
	public static void gestionU(){
	
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
		System.out.println("\n Pulse cualquier tecla para continuar");
	}

	/**
	 * @author M Carmen
	 * 
	 *         mensajes para dar de alta una pelicula
	 */
	public static void mensajeNombrePelicula() {
		System.out.println("\nIntroduzca el nombre de la película:");
	}

	public static void mensajeAnnoPelicula() {
		System.out.println("\n Introduzca el año del estreno:");
	}

	public static void mensajeCategoriaPelicula() {
		System.out.println("\nIntroduzca a que categoria pertenece:");
		System.out.println("\tPonga 1 para seleccionar categoria POLICIACA");
		System.out.println("\tPonga 2 para seleccionar categoria ROMANTICA");
		System.out.println("\tPonga 3 para seleccionar categoria AVENTURAS");
		System.out.println("\tPonga 4 para seleccionar categoria COMEDIA");
		System.out.println("\tPonga 5 para seleccionar categoria ANIMACION");
		System.out.println("\tPonga 6 para seleccionar categoria THRILLER");
	}

	public static void mensajeValPelicula() {
		System.out.println("\nIntroduzca valoración de la película:");
	}

	/**
	 * @author M Carmen
	 * 
	 * @date 30/09/2019
	 * 
	 *       Mensajes para dar de alta un usuario
	 */

	public static void mensajeNombreUsuario() {
		System.out.println("\nIntroduzca el nombre de usuario:");
	}

	public static void mensajeApellido1Usuario() {
		System.out.println("\nIntroduzca primer apellido:");
	}

	public static void mensajeApellido2Usuario() {
		System.out.println("\nIntroduzca segundo apellido");
	}

	public static void mensajeFechaNacimientoUsuario() {
		System.out.println("\n Introduzca la fecha de nacimiento (yyyy-MM-dd):");
	}

	public static void mensajeCiudadUsuario() {
		System.out.println("\n Introduzca ciudad del usuario:");
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
