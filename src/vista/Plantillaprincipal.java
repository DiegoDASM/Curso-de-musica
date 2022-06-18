package vista;

import java.awt.HeadlessException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;

import ListenerAct.lstPlantillaprincipal;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class Plantillaprincipal extends JFrame {
	
	public JPanel contentPane, pnlwest;
	public JMenuBar jmnBar;
	public JMenu Asistencia, Pagos;
	public JMenuItem ItAsistencia, IEstudianteYfactura, IFacturacion, RegistroPagos;
	public JDesktopPane deskPane;
	
	public Plantillaprincipal() throws HeadlessException {
		super("Records Ruiz");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Diego\\Downloads\\logoIco.jpeg"));
		initcomponent();
	}
	
	public void initcomponent() {
		setExtendedState(MAXIMIZED_BOTH);
		
		contentPane = new JPanel(new BorderLayout());
		contentPane.setBackground(new Color(128, 0, 0));
		deskPane = new JDesktopPane();
		deskPane.setBackground(new Color(128, 0, 0));
		contentPane.add(deskPane);
		setContentPane(contentPane);
		
		jmnBar = new JMenuBar();
		jmnBar.setBackground(new Color(255, 255, 255));
		Asistencia = new JMenu("Gestion de Asistencias y Estudiantes");
		Pagos = new JMenu("Registro de Pagos");
		
		ItAsistencia = new JMenuItem("Registro de Asistencias");
		IEstudianteYfactura = new JMenuItem("Registro de Estudiantes");
		IFacturacion = new JMenuItem("Sistema de Facturacion");
		
		jmnBar.add(Asistencia);
		jmnBar.add(Pagos);
		
		Asistencia.add(ItAsistencia);
		Asistencia.add(IEstudianteYfactura);
		
		Pagos.add(IFacturacion);
		
		contentPane.add(jmnBar, BorderLayout.NORTH);
		addlistener();
	}
	
	public void addlistener() {
		
		ItAsistencia.addActionListener(new lstPlantillaprincipal(this));
		IEstudianteYfactura.addActionListener(new lstPlantillaprincipal(this));
		IFacturacion.addActionListener(new lstPlantillaprincipal(this));
	}

	public JMenuItem getItAsistencia() {
		return ItAsistencia;
	}

	public void setItAsistencia(JMenuItem itAsistencia) {
		ItAsistencia = itAsistencia;
	}

	public JMenuItem getIEstudianteYfactura() {
		return IEstudianteYfactura;
	}

	public void setIEstudianteYfactura(JMenuItem iEstudianteYfactura) {
		IEstudianteYfactura = iEstudianteYfactura;
	}

	public JMenuItem getIFacturacion() {
		return IFacturacion;
	}

	public void setIFacturacion(JMenuItem iFacturacion) {
		IFacturacion = iFacturacion;
	}

	public JDesktopPane getDeskPane() {
		return deskPane;
	}

	public void setDeskPane(JDesktopPane deskPane) {
		this.deskPane = deskPane;
	}
	
}
