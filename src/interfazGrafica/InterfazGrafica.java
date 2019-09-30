package interfazGrafica;

/** 
 * 
 * @author Andres
 * 
 * version 0.1
 *
 */
public class InterfazGrafica {
	
	public InterfazGrafica() {
		
	}
	/**
	 * @author M Carmen
	 * 
	 * mensajes para dar de alta una pelicula
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

}
