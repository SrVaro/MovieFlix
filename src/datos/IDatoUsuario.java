package datos;

import modelo.Usuario;

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

	public boolean peliculasUsuario(int ID);

	public boolean altaUsuario(Usuario u);

	public boolean actualizarUsuario(int id, Usuario u);

	public boolean listarUsuarios();

	public boolean listarPeliculasNoVistas(int id);

}
