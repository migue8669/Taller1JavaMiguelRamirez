package principal;

import javax.swing.JOptionPane;
import entidad.Mensaje;
import modelo.CalculoNota;

public class Principal {

	public static void main(String[] args) {
		CalculoNota cn = new CalculoNota();

		String notaSeg = JOptionPane.showInputDialog(null, Mensaje.MENSAJE_PETICION_SEGUIMIENTO.getMensajes());
		String notaPar = JOptionPane.showInputDialog(null, Mensaje.MENSAJE_PETICION_PARCIAL.getMensajes());
		String notaExaFinal = JOptionPane.showInputDialog(null, Mensaje.MENSAJE_EXAMEN_FINAL.getMensajes());

		cn.setNotaSeg(Double.parseDouble(notaSeg));
		cn.setNotaParc(Double.parseDouble(notaPar));
		cn.setNotaFinal(Double.parseDouble(notaExaFinal));
		if (cn.calculo() < 1.0) {
			JOptionPane.showMessageDialog(null, cn.calculo());
			JOptionPane.showMessageDialog(null, Mensaje.MENSAJE_FINAL_MAL09.getMensajes());
		}
		if (cn.calculo() > 1.0 && cn.calculo() < 1.9) {
			JOptionPane.showMessageDialog(null, cn.calculo());
			JOptionPane.showMessageDialog(null, Mensaje.MENSAJE_FINAL_MAL19.getMensajes());
		}
		if (cn.calculo() > 2.0 && cn.calculo() < 2.9) {
			JOptionPane.showMessageDialog(null, cn.calculo());
			JOptionPane.showMessageDialog(null, Mensaje.MENSAJE_FINAL_MAL29.getMensajes());
		}
		if (cn.calculo() > 3.0 && cn.calculo() < 3.9) {
			JOptionPane.showMessageDialog(null, Mensaje.MENSAJE_FINAL_REGULAR39.getMensajes());
			JOptionPane.showMessageDialog(null, cn.calculo());
		}
		if (cn.calculo() > 4.0 && cn.calculo() < 4.9) {
			JOptionPane.showMessageDialog(null, Mensaje.MENSAJE_FINAL_MEJOR45.getMensajes());
			JOptionPane.showMessageDialog(null, cn.calculo());
		}
	}

}