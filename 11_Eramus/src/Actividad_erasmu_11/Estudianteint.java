/**
 * 
 */
package Actividad_erasmu_11;

/**
 * @author Matias Machin
 *
 */
public class Estudianteint extends Estudiante {
	
	//atributos
	
	private boolean esErasmus;
	private String nacionalidad;
	
	//contructor vacio
	
	public Estudianteint() {
		
	}
	
	// Contructor con parametros
	
	public Estudianteint(String codigo, String nombre , String direccion, int edad, boolean esErasmus, String nacionalidad ) {
		super(codigo, nombre, direccion, edad);
		this.esErasmus=esErasmus;
		this.nacionalidad=nacionalidad;
	}

	
	// Metodos getter y setter
	
	
	/**
	 * Metodos getter para el atributo esErasmus
	 * @return the esErasmus
	 */
	public boolean isEsErasmus() {
		return esErasmus;
	}

	/**
	 * Metodos setter para el atributo esErasmus
	 * @param esErasmus the esErasmus to set
	 */
	public void setEsErasmus(boolean esErasmus) {
		this.esErasmus = esErasmus;
	}

	/**
	 * Metodos getter para el atributo nacionalidad
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Metodos setter para el atributo nacionalidad
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	
	
	@Override
	public String toString() {
		/*
		 * return "Estudianteint [esErasmus=" + esErasmus + ", nacionalidad=" +
		 * nacionalidad + ", getCodigo()=" + getCodigo() + ", toString()=" +
		 * super.toString() + ", getNombre()=" + getNombre() + ", getDireccion()=" +
		 * getDireccion() + ", getEdad()=" + getEdad() + ", mayorEdad()=" + mayorEdad()
		 * + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		 */
		return super.toString();
	}
	
	
	
}
