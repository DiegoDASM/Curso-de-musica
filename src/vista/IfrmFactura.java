package vista;
/**
* @author Diego Alejandro Silva Munoz
* @companero Braython Espinoza Cabrera
* @version POO - 2022
* @since Desde-9-Marzo-2022, 23:55 horas
*/
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class IfrmFactura extends JFrame{
	
	private JLabel lblHospital, lblRFC, lblDireccion, lblDoctor, lblCedula, lblPaciente, lblFecha, lblEspecialidad, lblCedulaP, lblCarnetDoc;
	
    protected JTextField txtHospital, txtRFC, txtDireccion, txtDoctor, txtCedula, txtPaciente, txtFecha, txtEspecialidad, txtCedulaP, txtCarnetDoc;
    
    private JPanel pnlDatos ;
    
    private JPanel contenedor;
   
    public IfrmFactura() {
    	
    	contenedor = new JPanel(new BorderLayout());
		setContentPane(contenedor);

        setSize(400, 400);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        lblHospital = new JLabel("Hospital");
        lblRFC = new JLabel("RFC");
        lblDireccion = new JLabel("Direccion");
        lblDoctor = new JLabel("Doctor");
        lblCedula = new JLabel("Codigo de busqueda");
        lblCarnetDoc = new JLabel("Carnet del doctor");
        lblEspecialidad = new JLabel("Especialidad");
        lblPaciente = new JLabel("Paciente");
        lblCedulaP = new JLabel("Cedula (P)");
        lblFecha = new JLabel("Fecha");

        txtHospital = new JTextField();
        txtRFC = new JTextField();
        txtDireccion = new JTextField();
        txtDoctor = new JTextField();
        txtCedula = new JTextField();
        txtCarnetDoc = new JTextField();
        txtEspecialidad = new JTextField();
        txtPaciente = new JTextField();
        txtCedulaP = new JTextField();
        txtFecha = new JTextField();
        
        pnlDatos = new JPanel();
        pnlDatos.setLayout(new GridLayout(10, 2));

        txtHospital.setEditable(false);
        txtRFC.setEditable(false);
        txtDireccion.setEditable(false);
        txtDoctor.setEditable(false);
        txtCedula.setEditable(false);
        txtCarnetDoc.setEditable(false);
        txtEspecialidad.setEditable(false);
        txtPaciente.setEditable(false);
        txtCedulaP.setEditable(false);
        txtFecha.setEditable(false);


        pnlDatos.add(lblFecha);
        pnlDatos.add(txtFecha);
        
        
        pnlDatos.add(lblHospital);
        pnlDatos.add(txtHospital);
        
        
        pnlDatos.add(lblRFC);
        pnlDatos.add(txtRFC);
        
        
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        
        
        pnlDatos.add(lblDoctor);
        pnlDatos.add(txtDoctor);
        
        
        pnlDatos.add(lblCedula);
        pnlDatos.add(txtCedula);
        
        pnlDatos.add(lblCarnetDoc);
        pnlDatos.add(txtCarnetDoc);
        
        
        pnlDatos.add(lblEspecialidad);
        pnlDatos.add(txtEspecialidad);
        
        
        pnlDatos.add(lblPaciente);
        pnlDatos.add(txtPaciente);
        
        pnlDatos.add(lblCedulaP);
        pnlDatos.add(txtCedulaP);
        
        
        Box cajaDatos = Box.createVerticalBox();
        
        cajaDatos.setBorder(BorderFactory.createTitledBorder("Factura"));
        cajaDatos.add(pnlDatos);

        pnlDatos.setBounds(0, 0, 800, 800);
        cajaDatos.setBounds(0, 0, 400, 300);
        
        contenedor.add(cajaDatos);

    }
}