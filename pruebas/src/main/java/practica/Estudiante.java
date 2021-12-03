package practica;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private int nota;
	
	public Estudiante(String nombre,String apellido,int nota) {
		
	}
	
	public void xEstudiante() {
		System.out.print("Numero de estudiantes: ");
	    numEstudiantes = leer.nextInt();
	    estudiantes = new String[numEstudiantes];
	    
	    leer.nextLine();
	    
	    System.out.println("Ingrese un total de " + numEstudiantes + " estudiantes con nombre y apellido seguido de la tecla enter: ");
	    for(int i=0; i<estudiantes.length; i++){
	        System.out.print("Estudiante "+ (i+1) + ": ");
	        
	        estudiantes[i] = leer.nextLine();
	    }


	    }


	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	
	

}
