package vista;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class clsFacturacion extends JFrame {
	public JPanel contentPane;

	public clsFacturacion() throws HeadlessException {
		super("Facturacion");
		initcomponent();
	}
	
	public void initcomponent() {
		setSize(892, 596);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		
		setVisible(true);
		
		
	}
}
