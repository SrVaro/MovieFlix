package servicio;

import control.Control;
import datos.DatoPelicula;
import datos.DatoUsuario;
import interfazGrafica.InterfazGrafica;
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
		InterfazGrafica.mensajesLeerUsuario(6);
		du.bajaUsuario(LecturaDatos.LeerInt());
	}

	@Override
	public void altaUsuario() {
		du.altaUsuario(FactoriaUsuario.pedirUsuario());
	}

	@Override
	public void actualizarUsuario() {
		InterfazGrafica.mensajesLeerUsuario(6);
		du.actualizarUsuario(LecturaDatos.LeerInt(), FactoriaUsuario.pedirUsuario());

	}

	@Override
	public void peliculaUsuario() {
		InterfazGrafica.mensajesLeerUsuario(6);
		du.peliculasUsuario(LecturaDatos.LeerInt());

	}

	@Override
	public void listarPeliculas() {
		dp.listarPeliculas();
	}

	@Override
	public void listarPeliculasCat() {
		InterfazGrafica.mensajeLeerCategoria();
		dp.listarPeliculasCat(LecturaDatos.LeerString());
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
		InterfazGrafica.mensajesLeerUsuario(6);
		du.listarPeliculasNoVistas(LecturaDatos.LeerInt());
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
		InterfazGrafica.mensajesLeerUsuario(4);
		dp.bajaPelicula(LecturaDatos.LeerInt());
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
