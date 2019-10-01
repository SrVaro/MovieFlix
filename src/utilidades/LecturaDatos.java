package utilidades;

import java.io.Writer;
import java.sql.Date;
/** 
 * 
 * @author Andres
 * 
 * @version 0.1
 * 
 * @fecha 30/09/2019
 *
 */
import java.util.Scanner;

import interfazGrafica.InterfazGrafica;

/**
 * @author Andres
 * Se pide un entero por Scanner
 */
public class LecturaDatos {

	@SuppressWarnings("resource")
	public static int LeerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int LeerInt(String mensaje) {
		System.out.println(mensaje);
		return LeerInt();
	}

	/**
	 * @author Andres
	 * Se pide un String por Scanner
	 */
	@SuppressWarnings("resource")
	public static String LeerString() {
		return new Scanner(System.in).nextLine();
	}

	public static String LeerString(String mensaje) {
		System.out.println(mensaje);
		return LeerString();
	}
	
	/**
	 * 
	 * @author Andres
	 * 
	 */
	public static Date LeerFecha() {
	
	//InterfazGrafica.mensajeFechaNacimientoUsuario();
	boolean correct = false;
    Date date = null;
    while (!correct) {
        try {
            date = Date.valueOf(LecturaDatos.LeerString());
            correct = true;
        } catch (IllegalArgumentException e) {
            InterfazGrafica.mensajeError();
        }
    }
    return date;
}
}
