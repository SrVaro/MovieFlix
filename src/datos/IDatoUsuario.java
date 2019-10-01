package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bdd.GestorBDD;

/**
 * 
 * @author M Carmen
 * 
 * @version 0.1
 * 
 * @date 30/09/2019
 *
 */
public interface IDatoUsuario {

	public boolean bajaUsuario(int ID);

}
