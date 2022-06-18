package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Logica.Escuela;
import Logica.Estudiante;

@SuppressWarnings("serial")
public class clsAsistencia extends JFrame{
	
	private JPanel contentPane, PanelDeRegistro;
	private JLabel lblNombre, lblApellido, lblPresente, lblFalta;
	private JTextField txtNombre, txtApellido;
	private JRadioButton rdbtnPresente, rdbtnFaltas;
	private Escuela ingEstu;
	private JScrollPane scrollPane;
	private JTable tablaDeEstudiantes;

	public clsAsistencia() throws HeadlessException {
		super("Asistencia");
		initcomponent();
		llenarTabla(tablaDeEstudiantes);
	}
	
	public void initcomponent() {
		setSize(657, 583);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ingEstu = new Escuela();
		
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		
		PanelDeRegistro = new JPanel();
		contentPane.add(PanelDeRegistro, BorderLayout.WEST);
		PanelDeRegistro.setLayout(new GridLayout(4, 2));
		
		lblNombre = new JLabel("Nombres");
		lblApellido = new JLabel("Apellidos");
		lblPresente = new JLabel("Presente");
		lblFalta = new JLabel("Falta");
		
		txtNombre = new JTextField(10);
		txtNombre.setEnabled(false);	
		txtApellido = new JTextField(10);
		txtApellido.setEnabled(false);
		
		rdbtnPresente = new JRadioButton();
		rdbtnFaltas = new JRadioButton();
		
		PanelDeRegistro.add(lblNombre);
		PanelDeRegistro.add(txtNombre);
		
		PanelDeRegistro.add(lblApellido);
		PanelDeRegistro.add(txtApellido);
		
		PanelDeRegistro.add(lblPresente);
		PanelDeRegistro.add(rdbtnPresente);
		
		PanelDeRegistro.add(lblFalta);
		PanelDeRegistro.add(rdbtnFaltas);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		tablaDeEstudiantes = new JTable();
		tablaDeEstudiantes.setModel(new DefaultTableModel(new Object[][] {},
		new String[] { "Nombre", "Apellidos", "Telefono", "Cedula", "Direccion", "Carnet", "Especialidad","Codigo" }));
		scrollPane.setViewportView(tablaDeEstudiantes);
		
		setVisible(true);
	}
	public void llenaFila(JTable tblDoc, int fila, Estudiante m) {
		DefaultTableModel modelo = (DefaultTableModel) tblDoc.getModel();
		modelo.addRow(new Object[1]);
		tblDoc.setValueAt(m.getNombre(), fila, 0);
		tblDoc.setValueAt(m.getApellidos(), fila, 1);
		tblDoc.setValueAt(m.getTelefono(), fila, 2);
		tblDoc.setValueAt(m.getCedula(), fila, 3);
		tblDoc.setValueAt(m.getDireccion(), fila, 4);
//		tblDoc.setValueAt(m.getCarnet(), fila, 5);
//		tblDoc.setValueAt(m.getEspecialidad(), fila, 6);
//		tblDoc.setValueAt(m.getCodigoDeBusqueda(), fila, 7);
	}

	public void llenarTabla(JTable tblDoc) {
		@SuppressWarnings("unused")
		DefaultTableModel modelo = (DefaultTableModel) tblDoc.getModel();
		int fila = 0;
		if (ingEstu.getLstEstudiante().size() > 0) {
			for (Estudiante m : ingEstu.getLstEstudiante()) {
				llenaFila(tblDoc, fila, m);
				fila++;
			}
		}	
	}
}
