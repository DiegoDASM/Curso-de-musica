package Logica;

public abstract class Persona {
	
	protected String nombre;
	protected String apellidos;
	protected String telefono;
	protected String cedula;
	protected String direccion;
	
	public Persona() {
	}
	
	public Persona(String nombre, String apellidos, String telefono, String cedula, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.cedula = cedula;
		this. direccion = direccion;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", cedula=" + cedula + ", direccion=" + direccion + "]";
	}
}
