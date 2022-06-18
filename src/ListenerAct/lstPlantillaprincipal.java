package ListenerAct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Plantillaprincipal;
import vista.clsAsistencia;
import vista.clsFacturacion;
import vista.ingresoDeEstudiantes;

public class lstPlantillaprincipal implements ActionListener{
	
	public Plantillaprincipal oPlantillaprincipal;
	
	public lstPlantillaprincipal(Plantillaprincipal oPlantillaprincipal) {
		this.oPlantillaprincipal = oPlantillaprincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.oPlantillaprincipal.getItAsistencia()) {
			
			clsAsistencia op = new clsAsistencia();
			oPlantillaprincipal.getDeskPane().add(op);
			op.setVisible(true);
			
			return;
		}
		
		if(e.getSource() == this.oPlantillaprincipal.getIEstudianteYfactura()) {
			
			ingresoDeEstudiantes cp = new ingresoDeEstudiantes();
			oPlantillaprincipal.getDeskPane().add(cp);
			cp.setVisible(true);
			
			return;
		}
		
		if(e.getSource() == this.oPlantillaprincipal.getIFacturacion()) {
			
			clsFacturacion dp = new clsFacturacion();
			oPlantillaprincipal.getDeskPane().add(dp);
			dp.setVisible(true);
			
			return;
		}
	}
}
