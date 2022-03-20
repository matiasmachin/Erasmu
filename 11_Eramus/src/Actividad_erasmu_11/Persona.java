package Actividad_erasmu_11;

public class Persona {
	
	// Atributos 
	
	protected String nombre;
	protected String direccion;
	protected int edad;
	
	// Constructor Vacio
	
	public Persona() {
		
	}

	// Constructor con Parametros
	
	public Persona(String nombre, String direccion, int edad) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.edad=edad;
	}

	
	
	// Metodos getter y setter
	
	
	
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	

	public boolean mayorEdad1() {
		boolean  mayor=false;
		if (edad >= 18) 
			mayor=true;
			System.out.println(" El mayor de edad");
		if (edad<=18)
			mayor=false;
			System.out.println(" Es menor de edad");
		return mayor;
	}
	
	@Override
	public String toString() {
		/*
		 * return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", edad=" +
		 * edad + ", toString()=" + super.toString() + "]  "+ mayorEdad1();
		 */
		return super.toString()+"La Persona : " + nombre + "con dirección en: "+ direccion + "es " + mayorEdad1()+ "ya que tiene " + edad + "años";
		
	}
		
	}
	
	
	


