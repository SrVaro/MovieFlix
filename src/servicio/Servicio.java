package servicio;

import control.Control;
import datos.DatoPelicula;
import datos.DatoUsuario;
import modelo.FactoriaPelicula;
import modelo.FactoriaUsuario;
import utilidades.LecturaDatos;

/**
 * 
 * @author Mª José
 *
 * @version 0.1
 *
 * @date 30/09/2019
 */
public class Servicio implements IServicio {

	DatoUsuario du = new DatoUsuario();
	DatoPelicula dp = new DatoPelicula();
	Control c = new Control();

	public Servicio() {

	}

	@Override
	public void altaPelicula() {
		dp.altaPelicula(FactoriaPelicula.pedirPelicula());

	}

	@Override
	public void bajaUsuario() {
		du.bajaUsuario(LecturaDatos.LeerInt("Introduce el id del usuario"));
	}

	@Override
	public void altaUsuario() {
		du.altaUsuario(FactoriaUsuario.pedirUsuario());
	}

	@Override
	public void actualizarUsuario() {
		du.actualizarUsuario(FactoriaUsuario.pedirUsuario(),
				LecturaDatos.LeerInt("Introduce el id del usuario que quieres actualizar"));

	}

	@Override
	public void peliculaUsuario() {
		du.peliculasUsuario(LecturaDatos.LeerInt("Introduce el id del usuario"));

	}

	@Override
	public void listarPeliculas() {
		dp.listarPeliculas();
	}

	@Override
	public void listarPeliculasCat() {
		dp.listarPeliculasCat(LecturaDatos.LeerString("Introduce una categoria"));
	}

	@Override
	public void listarUsuarios() {
		du.listarUsuarios();
	}

	@Override
	public void listarPeliculasMayMen() {
		dp.listarPeliculasMayMen();
	}

	@Override
	public void listarPeliculasVal() {
		dp.listarPeliculasVal();

	}

	@Override
	public void listarPeliculasNoVistas() {
		du.listarPeliculasNoVistas(LecturaDatos.LeerInt("Introduce el id del usuario"));
	}

	@Override
	public void listarPeliculasRec() {
		dp.listarPeliculasRec();
	}

	@Override
	public void listarPeliculaActual() {
		dp.listarPeliculaActual();
	}

	@Override
	public void listarCategorias() {
		dp.listarCategorias();
	}

	@Override
	public void bajaPelicula() {
		dp.bajaPelicula(LecturaDatos.LeerInt("Introduce el id de la pelicula"));
	}
	
	public void gestionUsuarios() {
		c.gestionUsuarios();
	}
	
	public void gestionPeliculas() {
		c.gestionPeliculas();
	}
	
	public void listadosPeliculas() {
		c.listadosPeliculas();
	}

}
