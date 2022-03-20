/**
 * 
 */
package Actividad_erasmu_11;



/**
 * @author Matias Machin
 *
 */
public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instanciar
		
		Persona p1= new Persona("Matias Machin", "C/El canal 7", 17);
		Persona p2= new Persona("Jose Perez", "Avenida Maritima", 25);
		
		Estudiante e1= new Estudiante("03", "Andres Loreto", "C/ Mendez Nuñez", 19);
		Estudiante e2= new Estudiante("04","Juana Diaz", "Avenida Belgica", 26);
		
		Estudianteint ei1=new Estudianteint("05", "Maria Caceres", "C/ El Horno, 8", 20, true, "Ingles");
		Estudianteint ei2=new Estudianteint("06","Luis Medina", "C/ Albacete",30,true, "Americano" );
		Estudianteint ei3=new Estudianteint("07","Andres Soto", "C/ Alba",20,true, "Frances" );
		
		//System.out.println(" Estudiante Inte" + ei1.toString()+"\n\n");
		//System.out.println(" Estudiante Inte" + e1.toString()+"\n\n");
		System.out.println(ei1.toString()+"\n\n");

	}

}
