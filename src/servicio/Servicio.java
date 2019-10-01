package servicio;

import datos.DatoPelicula;
import datos.DatoUsuario;
import interfazGrafica.InterfazGrafica;
import modelo.FactoriaPelicula;
import modelo.FactoriaUsuario;
import utilidades.LecturaDatos;

/**
 * 
 * @author M� Jos�
 *
 * @version 0.1
 *
 * @date 30/09/2019
 */
public class Servicio implements IServicio {

	DatoUsuario du = new DatoUsuario();
	DatoPelicula dp = new DatoPelicula();

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
		// dp.listarPeliculas();
	}

}
