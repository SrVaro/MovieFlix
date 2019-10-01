package modelo;

/**
 * 
 * @author M Carmen
 *
 * @version 0.1
 * 
 * @date 30/09/2019
 * 
 *
 */

public class Pelicula {

	private String nombre;
	private int annoEstreno;
	private CATEGORIA categoria;
	private int valoracion;

	public Pelicula() {

	}

	public Pelicula(String nombre, int annoEstreno, CATEGORIA categoria, int valoracion) {
		this.nombre = nombre;
		this.annoEstreno = annoEstreno;
		this.categoria = categoria;
		this.valoracion = valoracion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnnoEstreno() {
		return annoEstreno;
	}

	public void setAnnoEstreno(int annoEstreno) {
		this.annoEstreno = annoEstreno;
	}

	public CATEGORIA getCategoria() {
		return categoria;
	}

	public void setCategoria(CATEGORIA categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", annoEstreno=" + annoEstreno + ", categoria=" + categoria
				+ ", valoracion=" + valoracion + "]";
	}

}
