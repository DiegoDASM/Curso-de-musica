package Logica;
/**
* @author Diego Alejandro Silva Munoz
* @companero Braython-espinoza-cabrera
* @version POO - 2022
* @since Desde-9-Marzo-2022, 23:55 horas
*/
import java.util.LinkedList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class MiModelo implements TableModel {

	@Override
	public int getRowCount() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getColumnCount() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getColumnName(int columnIndex) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Object getValueAt(int fila, int columna) {
		Estudiante aux = (Estudiante) suscriptores.get(fila);

		switch (columna) {
		case 0:
			return aux.cedula;

		case 1:
			return aux.nombre;
		case 2:
			return aux.apellidos;
		case 3:
			return aux.telefono;
		case 4:
			return aux.direccion;	
		case 5:
			return aux.instrumento;

		}
		return null;
	}

	@Override
	public void setValueAt(Object dato, int fila, int columna) {

		// Obtenemos la persona de la fila indicada

		Estudiante aux = (Estudiante) suscriptores.get(fila);

		switch (columna) {

		// Nos pasan el nombre.

		case 0:
			aux.cedula = (String) dato;
			break;

		// Nos pasan el apellido.
		case 1:
			aux.nombre = (String) dato;
			break;

		// Nos pasan la edad.

		case 2:
			aux.apellidos = (String) dato;
			break;

		case 3:
			aux.telefono = (String) dato;
			break;

		case 4:
			aux.direccion = (String) dato;
			break;
			
		case 5:
			aux.instrumento = (String) dato;
			break;

		}

		// Aquí hay que avisar a los sucriptores del cambio.
		// Ver unpoco más abajo cómo.
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addTableModelListener(TableModelListener l) {
		suscriptores.add(l);
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		suscriptores.remove(l);
	}

	@SuppressWarnings("rawtypes")
	private LinkedList suscriptores = new LinkedList();

}
