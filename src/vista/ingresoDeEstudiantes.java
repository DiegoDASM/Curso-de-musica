package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Logica.Escuela;

@SuppressWarnings("serial")
public class ingresoDeEstudiantes extends JFrame implements ActionListener {

//	private static IfrmFactura factura = new IfrmFactura();

	private String[] titulos = { "Cedula", "Nombre", "Apellido", "Telefono", "Direccion" };

	private DefaultTableModel modelo = new DefaultTableModel(null, titulos);

	private JMenuBar menubar;

	private Escuela h;

	private JTable tblHospital = new JTable(modelo);

	private JPopupMenu jpmMenu;

	private JMenuItem jmiBorrar, jmiFacturar;

	private JButton btnAgregar;

	private JScrollPane scrollPane;

	private JPanel contenedor, pnlSur;

	public ingresoDeEstudiantes() {

		super("Registro de Estudiantes");

		contenedor = new JPanel(new BorderLayout());
		setContentPane(contenedor);
		
		setSize(900, 800);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		h = new Escuela();   

		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		jpmMenu = new JPopupMenu();

		jmiBorrar = new JMenuItem("Borrar");

		jmiFacturar = new JMenuItem("Facturar");
		
		btnAgregar = new JButton("Registrar Estudiante");

		jpmMenu.add(jmiBorrar);

		jpmMenu.add(jmiFacturar);
		
		scrollPane = new JScrollPane(tblHospital);

		tblHospital.add(jpmMenu);

		tblHospital.addMouseListener(new MouseAdapter() {

// **************************************************************************************************************************************        	
			public void mouseReleased(MouseEvent me) {

				jpmMenu.show(me.getComponent(), me.getX(), me.getY());
			}

		});
		pnlSur = new JPanel();
		contenedor.add(pnlSur, BorderLayout.CENTER);
		contenedor.add(scrollPane, BorderLayout.NORTH);
		pnlSur.add(btnAgregar);

		btnAgregar.addActionListener(this);
		jmiBorrar.addActionListener(this);
		jmiFacturar.addActionListener(this);
		mostrarPacientes();

	}
//  **********************************************************************************************************************************

	void mostrarPacientes() {
		
		Object rowData[] = new Object[6];

		for (int i = 0; i < h.getLstEstudiante().size(); i++) {

			rowData[0] = h.getLstEstudiante().get(i).getCedula();
			rowData[1] = h.getLstEstudiante().get(i).getNombre();
			rowData[2] = h.getLstEstudiante().get(i).getApellidos();
			rowData[3] = h.getLstEstudiante().get(i).getTelefono();
			rowData[4] = h.getLstEstudiante().get(i).getDireccion();
			rowData[5] = h.getLstEstudiante().get(i).getInstrumento();
			modelo.addRow(rowData);
		}
	}

//  **********************************************************************************************************************************

//	void buscarDoctor(int codigoDeBusqueda) {
//
//		for (int i = 0; i < h.getLstDoctor().size(); i++) {
//
//			if (h.getLstDoctor().get(i).getCodigoDeBusqueda() == codigoDeBusqueda) {
//
//				factura.txtDoctor.setText(h.getLstDoctor().get(i).getNombre());
//				factura.txtCarnetDoc.setText(h.getLstDoctor().get(i).getCarnet());
//				factura.txtEspecialidad.setText(h.getLstDoctor().get(i).getEspecialidad());
//			}
//		}
//	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == btnAgregar) {
			
//			Registro p = new Registro();
			
//			p.txtCedula.getText();
//			p.txtNombre.getText();
//			p.txtApellido.getText();
//			p.txtDireccion.getText();
//			p.txtInstrumento.getText();
			
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
			
			String apellidos = JOptionPane.showInputDialog("Ingrese el apellido:");

			String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono:");

			String cedula = JOptionPane.showInputDialog("Ingrese el numero de cedula:");
			
			String direccion = JOptionPane.showInputDialog("Ingrese la direccion:");
			
			String instrumento = JOptionPane.showInputDialog("Ingrese instrumento:");
			
			h.registrarEstudiante(nombre, apellidos, telefono, cedula, direccion, instrumento);

			modelo.setRowCount(0);
			mostrarPacientes();

			// **********************************************************************************************************************************

		}
		if (ae.getSource() == jmiBorrar) {
			
			int eliminar = tblHospital.getSelectedRow();

			@SuppressWarnings("unused")
			String datoEliminar = tblHospital.getValueAt(eliminar, 0).toString();

			System.out.println(eliminar);

			if (eliminar == -1) {

				JOptionPane.showMessageDialog(this, "Por favor seleccione una fila.");

			} else {

				modelo.setRowCount(0);

				h.getLstEstudiante().remove(eliminar);

				mostrarPacientes();

				JOptionPane.showMessageDialog(this, "Paciente eliminado correctamente.");
			}
		}

		// **********************************************************************************************************************************

//		if (ae.getSource() == jmiFacturar) {
//
//			int clienteFacturado = tblHospital.getSelectedRow();
//
//			String codigoDeBusqueda = JOptionPane.showInputDialog("Ingrese la cedula del doctor:");
//
//			buscarDoctor(Integer.parseInt(codigoDeBusqueda));
//
//			factura.txtHospital.setText(h.getNombre());
//
//			factura.txtRFC.setText(h.getRUC());
//
//			factura.txtDireccion.setText(h.getDIRECCION());
//
//			factura.txtCedula.setText(codigoDeBusqueda);
//
//			factura.txtPaciente.setText(tblHospital.getValueAt(clienteFacturado, 1).toString());
//
//			factura.txtFecha.setText(tblHospital.getValueAt(clienteFacturado, 3).toString());
//			
//			factura.txtCedulaP.setText(tblHospital.getValueAt(clienteFacturado, 0).toString());
//			
//			factura.setVisible(true);
//
//		}
	}
}