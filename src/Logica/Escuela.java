package Logica;
/**
* @author Diego Alejandro Silva Munoz
* @companero Braython-espinoza-cabrera
* @version POO - 2022
* @since Desde-9-Marzo-2022, 23:55 horas
*/
import java.util.ArrayList;

public class Escuela {
	//Atributos Usados
	private final String nombre = "Hospital Guayaquil";
	private final String RUC = "A001";
	private final String DIRECCION = "Avenida Francisco de orellana";
	private final String Ciudad = DIRECCION;

	private ArrayList<Estudiante> lstEstudiante;
	private ArrayList<Profesor> lstProfesores;
	
	/**
	 * @Constructor vacio
	 */
	public Escuela() {
		
	lstEstudiante = new ArrayList<Estudiante>();
	lstProfesores = new ArrayList<Profesor>();
	Estudiantelst();
	Profesores();
	}
	/**
	 * @param nombre
	 * @param apellidos
	 * @param telefono
	 * @param cedula
	 * @param direccion
	 * @return
	 */
	public Estudiante registrarEstudiante(String nombre, String apellidos, String telefono, String cedula, String direccion, String instrumento) {

		Estudiante pac = new Estudiante(nombre, apellidos, telefono, cedula, direccion, instrumento);
		lstEstudiante.add(pac);
		return pac;
	}
	public void facturarPaciente() {
	}
	/**
	 * lista de Paciente
	 */
	public void Estudiantelst() {

		lstEstudiante.add(new Estudiante("Pepe", "Perez","0963112333", "0926364198", "Guayacanes mz6 villa 9", "Piano"));

		lstEstudiante.add(new Estudiante("Samuel", "Ortiz", "0926954813", "0958625978", "Mucholote 1 villa espana, mz 22 villa 6", "Guitarra"));

		lstEstudiante.add(new Estudiante("Joaquin", "Salazar", "0935789243", "0973899663", "Bastion popular bloque 7, Alborada Etapa 9", "tambor"));

		lstEstudiante.add(new Estudiante("Santiago", "Silva", "0915289220", "0914264894", "Saauces 8, C. 19A", "flauta"));

		lstEstudiante.add(new Estudiante("Eduardo", "Barragan", "0969255425", "0915421875", "Av. Rodolfo Baquerizo Nazur", "triangulo"));

		lstEstudiante.add(new Estudiante("Nazareno", "Munoz", "0976418796", "0936963585", "Sauces 6 mz328 villa 13", "bateria"));

		lstEstudiante.add(new Estudiante("Marco", "Jimenez", "0996856324", "0926635725", "Samborondo", "violin"));
	}
	/**
	 * Lista de Doctores
	 */
	private void Profesores() {

		lstProfesores.add(new Profesor("Gian", "Ordoñez", "0963112555", "0326594817", "Cooperativa Pastor Vera", "Cardiologo", 123));

		lstProfesores.add(new Profesor("Andrea", "Lopez", "0981021436", "0998325892", "Fuerte Huancavilca", "Neurologa",  001));

		lstProfesores.add(new Profesor("Carlos", "Rodriguez", "0928695880", "0978687415", "Av. Guillermo Pareja Rolando","Dermatologo",  002));

		lstProfesores.add(new Profesor("Anthony", "Garcia", "0935870309", "0468317479", "Av. Samborondón, Samborondón","Oftalmologo", 003));

		lstProfesores.add(new Profesor("Pedro", "Torres", "0928616321", "0632746716",  "Urb. San Felipe","Traumatologo", 004));

		lstProfesores.add(new Profesor("Maria", "Andrade", "0994384334", "0255429016", "Mirador De Mapasingue", "Ginecologa", 005));

		lstProfesores.add(new Profesor("Stephany", "Santacruz", "0978534608", "0923115128", "Peatonal 32 NO", "Urologa", 006));

		lstProfesores.add(new Profesor("Jhon", "Vera", "0952309014", "0477131769", "Dr. Antonio Sánchez Granados 704","General", 000));
	}
	/**
	 * 
	 * @param codigoDeBusqueda
	 * @return
	 * Este metodo nos permitira usar un codigo de busqueda que tiene cada doctor
	 * para poder facturar
	 */
	public String seleccionarDoctor(int codigoDeBusqueda) {

		Profesor buscado = null;

		for (int i = 0; i < lstProfesores.size() && buscado == null; i++) {
			Profesor ahora = lstProfesores.get(i);

			if (ahora.getCodigoDeBusqueda() == codigoDeBusqueda) {

				buscado = ahora;
			}
		}

		return buscado.getNombre().toString();
	}

//    Metodos Getter

	public String getDIRECCION() {
		return DIRECCION;
	}

	public String getRUC() {
		return RUC;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public ArrayList<Estudiante> getLstEstudiante() {
		return lstEstudiante;
	}
	public void setLstEstudiante(ArrayList<Estudiante> lstEstudiante) {
		this.lstEstudiante = lstEstudiante;
	}
	public ArrayList<Profesor> getLstProfesores() {
		return lstProfesores;
	}
	public void setLstProfesores(ArrayList<Profesor> lstProfesores) {
		this.lstProfesores = lstProfesores;
	}
	
	@Override
	public String toString() {
		return "Hospital{" + "nombre=" + nombre + ", RUC=" + RUC + ", DIRECCION=" + DIRECCION + "ciudad=" + DIRECCION+ '}';
	}
	
}