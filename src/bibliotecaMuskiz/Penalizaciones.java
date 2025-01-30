package bibliotecaMuskiz;

import java.util.Objects;

public class Penalizaciones implements ObtenerDatos{
	private int codido;
	private String nombre;
	private int libros_permitidos;
	
	
	
	////CONSTRUCTORES////
	public Penalizaciones(int codido, String nombre, int libros_permitidos) {
		super();
		this.codido = codido;
		this.nombre = nombre;
		this.libros_permitidos = libros_permitidos;
	}
	
	public Penalizaciones(int codido) {
		super();
		this.codido = codido;
		this.nombre = "****";
		this.libros_permitidos = 0;
	}

	
	///// GETTERS & SETTERS/////
	/**
	 * @return the codido
	 */
	public int getCodido() {
		return codido;
	}

	/**
	 * @param codido the codido to set
	 */
	public void setCodido(int codido) {
		this.codido = codido;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the libros_permitidos
	 */
	public int getLibros_permitidos() {
		return libros_permitidos;
	}

	/**
	 * @param libros_permitidos the libros_permitidos to set
	 */
	public void setLibros_permitidos(int libros_permitidos) {
		this.libros_permitidos = libros_permitidos;
	}
	
	//// TOSTRING ////

	
	@Override
	public String toString() {
		return "Penalizaciones [codido=" + codido + ", nombre=" + nombre + ", libros_permitidos=" + libros_permitidos
				+ "]";
	}

	///// HASHCODE & EQUALS /////
	@Override
	public int hashCode() {
		return Objects.hash(codido, libros_permitidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Penalizaciones other = (Penalizaciones) obj;
		return codido == other.codido && libros_permitidos == other.libros_permitidos
				&& Objects.equals(nombre, other.nombre);
	}
	
	//// METODOS ////
	public void modificarPermitido(int libros_permitidos) {
		this.libros_permitidos = libros_permitidos;
	}

	@Override
	public void obtenerNombre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obtenerCodigo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}