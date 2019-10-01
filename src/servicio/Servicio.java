package servicio;
import datos.DatoPelicula;
import datos.DatoUsuario;
import interfazGrafica.InterfazGrafica;
import modelo.FactoriaPelicula;
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
	
	public Servicio() {
		
	}

	@Override
	public void altaPelicula() {
		dp.altaPelicula(FactoriaPelicula.pedirPelicula());

	}
	
	@Override
	public void bajaUsuario() {
		du.bajaUsuario(LecturaDatos.LeerInt());
	}

	@Override
	public void altaUsuario() {

	}

	@Override
	public void actualizarUsuario() {
		//du.actualizarUsuario(FactoriaUsuario.pedirUsuario, id);
		
	}
	
	public void peliculaUsuario() {
		// du.peliculaUsuario(LecturaDatos.LeerInt());
		
	}
	
	public void listarPeliculas() {
		// dp.listarPeliculas();
	}



}
