package servicio;

import datos.DatoPelicula;
import datos.DatoUsuario;
import modelo.FactoriaPelicula;
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
	
	public Servicio() {
		
	}

	@Override
	public void altaPelicula() {
		//du.altaPelicula(FactoriaPelicula.pedirPelicula());
		
	}
	
	@Override
	public void bajaUsuario() {
		du.bajaUsuario(LecturaDatos.LeerInt());
		
	}


}
