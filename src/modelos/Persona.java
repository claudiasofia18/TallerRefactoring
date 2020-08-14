package modelos;

public class Persona {
	public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public String telefono;
    public String facultad;
    
    public Persona() {
    	// Constructor vacio para subclases que no necesiten constructor
    }
    
	public Persona(String nombre, String apellido, int edad, String direccion, String telefono, String facultad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.facultad = facultad;
	}
	// Getters y Setters
	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
    
    
}
