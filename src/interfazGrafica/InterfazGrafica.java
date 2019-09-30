package interfazGrafica;

import modelo.Pelicula;


/** 
 * 
 * @author Andres
 * 
 * version 0.1
 *
 */
public class InterfazGrafica {
	
	private Pelicula p =new Pelicula();
	public InterfazGrafica() {
		
	}
	
	public Pelicula getP() {
		return p;
	}

	public void setP(Pelicula p) {
		this.p = p;
	}
	
	@Override
	public String toString() {
		return "InterfazGrafica [p=" + p + "]";
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
	
	/**
	 * @author M Carmen
	 * menu opcion: alta pelicula
	 */
	public static void mostrarMenu() {
	
		System.out.println("\nOpciones:");
		System.out.println("\t 1-Dar de alta una pelicula nueva");
		
		
	}

}
