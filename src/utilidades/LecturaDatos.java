package utilidades;
/**
 * 
 * Autor Andres
 * 
 * Version 0.1
 */

import java.util.Scanner;

/**
 * 
 * Se pide un entero por Scanner
 */
public class LecturaDatos {

	@SuppressWarnings("resource")
	public static int LeerInt(){
		return new Scanner (System.in).nextInt();
	}
	
	public static int LeerInt (String mensaje) {
		System.out.println(mensaje);
		return LeerInt();
	}
	
	/**
	 * 
	 * Se pide un String por Scanner
	 */
	@SuppressWarnings("resource")
	public static String LeerString() {
		return new Scanner (System.in).nextLine();
	}
	
	public static String LeerString(String mensaje) {
		System.out.println(mensaje);
		return LeerString();
	}
}
