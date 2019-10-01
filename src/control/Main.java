package control;

import datos.DatoPelicula;

public class Main {
	public static void main(String[] args) {
		//Control.empezarPrograma();
		
		DatoPelicula d = new DatoPelicula();
		
		d.importarPeliculasTXT();
	}
}
