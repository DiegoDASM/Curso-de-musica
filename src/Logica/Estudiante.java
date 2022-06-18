package Logica;
/**
 * @author Diego Alejandro Silva Munoz
 * @companero Braython-espinoza-cabrera
 * @version POO - 2022
 * @since Desde-9-Marzo-2022, 23:55 horas
 */
public class Estudiante extends Persona {

//	Atributos
	protected String instrumento;

//    Constructor por defecto

	public Estudiante() {

	}
//  Constructor que recibe parametros

	public Estudiante(String nombre, String apellidos, String telefono, String cedula, String direccion, String instrumento) {
		super(nombre, apellidos, telefono, cedula, direccion);
		this.instrumento = instrumento;
	}

//    Metodos Getter

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String mostrarDatos() {
		return super.toString()+ "Estudiante{" + "nombre=" + nombre + "Instrumento"+ instrumento+'}';
	}
	
}