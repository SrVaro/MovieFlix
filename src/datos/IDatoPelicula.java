package datos;

import modelo.Pelicula;

/**
 * 
 * @author M Carmen
 * 
 * @version 0.1
 * 
 * @date 30/09/2019
 *
 */

public interface IDatoPelicula {

	public boolean altaPelicula(Pelicula p);

	public boolean listarPeliculasCat(String categoria);

	public boolean listarPeliculas();

	public boolean listarPeliculasMayMen();

	public boolean importarPeliculasTXT();

	public boolean listarPeliculasVal();

	public boolean listarPeliculaActual();

	public boolean listarCategorias();

	public boolean bajaPelicula(int ID);

	public boolean listarPeliculasRec();

}
