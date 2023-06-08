package tp01b.ejercicio3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String email;
	private String facultad;
	private String catedra;
	
	public Profesor(String nombre, String apellido, String email, String facultad, String catedra) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.facultad = facultad;
		this.catedra = catedra;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

}
