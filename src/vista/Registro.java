package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Registro extends JDialog {

	public final JPanel contentPanel = new JPanel();
	public JTextField txtCedula;
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtDireccion;
	public JTextField txtInstrumento;

	public static void main(String[] args) {
		try {
			Registro dialog = new Registro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Registro() {
		setBounds(100, 100, 317, 285);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 15));
		lblNewLabel.setBounds(54, 28, 55, 13);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new java.awt.Font("Yu Gothic UI", 1, 15));
		lblNewLabel_1.setBounds(46, 64, 63, 13);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setFont(new java.awt.Font("Yu Gothic UI", 1, 15));
		lblNewLabel_2.setBounds(46, 97, 63, 19);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion");
		lblNewLabel_3.setFont(new java.awt.Font("Yu Gothic UI", 1, 15));
		lblNewLabel_3.setBounds(46, 135, 73, 22);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Instrumento");
		lblNewLabel_4.setFont(new java.awt.Font("Yu Gothic UI", 1, 15));
		lblNewLabel_4.setBounds(34, 177, 85, 13);
		contentPanel.add(lblNewLabel_4);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(129, 28, 137, 19);
		contentPanel.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(129, 64, 137, 19);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(129, 103, 137, 19);
		contentPanel.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(129, 138, 137, 19);
		contentPanel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtInstrumento = new JTextField();
		txtInstrumento.setBounds(129, 177, 137, 19);
		contentPanel.add(txtInstrumento);
		txtInstrumento.setColumns(10);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			
		}
	
	}
}
