package bibliotecaMuskiz;

import java.util.Objects;

public class Autores implements ObtenerDatos {
	private int codigo;
	private String nombre;
	private String apellido;
	
	/// CONSTRUCTORES ///
	public Autores(int codigo, String nombre, String apellido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Autores(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = "";
	}
	
	/// GETTERS y SETTERS ///
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/// TOSTRING ///
	@Override
	public String toString() {
		return "Autores [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	/// HASHCODE Y EQUALS ///
	@Override
	public int hashCode() {
		return Objects.hash(apellido, codigo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autores other = (Autores) obj;
		return Objects.equals(apellido, other.apellido) && codigo == other.codigo
				&& Objects.equals(nombre, other.nombre);
	}

	/// METODOS ///
	@Override
	public void obtenerNombre() {
		System.out.println("El nombre del autor es "+nombre);
	}

	@Override
	public void obtenerCodigo() {
		System.out.println("El codigo del autor es "+codigo);
	}

}
