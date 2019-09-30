package interfazGrafica;

import modelo.Pelicula;


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
		System.out.println("\nIntroduzca el nombre de la pel�cula:");
	}
	
	public static void mensajeAnnoPelicula() {
		System.out.println("\n Introduzca el a�o del estreno:");
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
	 * 
	 * @autor M� Jos�
	 * 
	 * @date 30/09/2019
	 * 
	 * M�todo que muestra el men�
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
		System.out.println("*-------------------------------------------------------*");
	}
		
	}

