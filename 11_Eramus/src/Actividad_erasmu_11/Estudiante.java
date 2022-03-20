/**
 * 
 */
package Actividad_erasmu_11;

/**
 * @author Matias Machin
 *
 */
public class Estudiante extends Persona {
	
	//atributos
	
	private String codigo;
	
	// Constructor vacio
	
	public Estudiante() {
		
	}
	
	// Constructor con parametros
	
	public Estudiante(String codigo, String nombre , String direccion, int edad) {
		super(nombre, direccion, edad);
		this.codigo=codigo;
			
	}

	
	// Metodos getter y setter
	
	
	/**
	 * Metodos getter para el atributo codigo
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Metodos setter para el atributo codigo
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		/*
		 * return "Estudiante [codigo=" + codigo + ", getNombre()=" + getNombre() +
		 * ", getDireccion()=" + getDireccion() + ", getEdad()=" + getEdad() +
		 * ", mayorEdad()=" + mayorEdad1() + ", toString()=" + super.toString() +
		 * ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		 */
		return super.toString();
	}

	
	
	
	
}
