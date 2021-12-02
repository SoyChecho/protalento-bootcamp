package practica;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private int nota;
	
	public Estudiante() {
		nombre = "";
		apellido = "";
		nota = 0;
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
