package Logica;

public class Profesor extends Persona {

//	Atributos
	private int codigoDeBusqueda;
	private String carnet;
	private String especialidad;

//    Constructor vacio

	public Profesor() {
	}

//    Constructor que recibe parametros

	public Profesor(String nombre, String apellidos, String telefono, String cedula, String direccion, String especialidad, int codigoDeBusqueda) {
		super(nombre, apellidos, telefono, cedula, direccion);
		this.carnet = generarCarnet();
		this.codigoDeBusqueda = codigoDeBusqueda;
		this.especialidad = especialidad;

	}
	/**
	 * @public String generarCarnet()
	 * Este metodo nos permite crear del medico que podemos ver reflejado 
	 * lista de Doctores disponibles
	 */
	public String generarCarnet() {
		StringBuilder sb = new StringBuilder();

		sb.append(cedula.substring(0, 2));
		sb.append(cedula.substring(cedula.length() - 2, cedula.length()));
		sb.append(nombre.substring(nombre.length()-2, nombre.length()));
		sb.append(apellidos.substring(0,2));
		sb.append(generarNumeroAleatorio(10,99));

		return sb.toString().toUpperCase();
	}
	public int generarNumeroAleatorio(int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	
//    Metodos Getter

	public String getCarnet() {
		return carnet;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

//    Metodos Setter

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getCodigoDeBusqueda() {
		return codigoDeBusqueda;
	}

	public void setCodigoDeBusqueda(int codigoDeBusqueda) {
		this.codigoDeBusqueda = codigoDeBusqueda;
	}
	
	public String mostrarDatos() {
		return super.toString() + "Doctor{" + "nombre=" + nombre + ", carnet=" + carnet + ", especialidad=" + especialidad + ", codigoDeBusqueda="+ codigoDeBusqueda +'}';
	}
	/**
	 * @public String toString
	 * mediante el uso de este toString podremos reflejar el nombre y apellido 
	 * en el combo box
	 */
	@Override
	public String toString() {
		return this.nombre +" "+ this.apellidos;
	}
}
